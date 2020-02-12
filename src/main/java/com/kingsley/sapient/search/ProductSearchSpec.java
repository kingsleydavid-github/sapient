package com.kingsley.sapient.search;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.kingsley.sapient.model.Product;

@Component
public class ProductSearchSpec implements Specification<Product>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3010055257870252415L;
	
	private ProductSearchItems filterItems;

	public ProductSearchSpec(ProductSearchItems filter)
	{
		this.filterItems = filter;
	}
	
	@Override
	public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

		
		List<Predicate> predicates = new ArrayList<>();
		
		if(filterItems.getBrand() != null && filterItems.getBrand().length() > 0)
		{
			predicates.add( criteriaBuilder.like(root.get("brand"), "%" + filterItems.getBrand() + "%") );
		}

		if(filterItems.getColor() != null && filterItems.getColor().length() > 0)
		{
			predicates.add(  criteriaBuilder.like(root.get("color"), "%" + filterItems.getColor() + "%") );
		}

		if(filterItems.getPrice() != null && filterItems.getPrice().length() > 0)
		{
			predicates.add(  criteriaBuilder.like(root.get("price"), "%" + filterItems.getPrice() + "%") );
		}
		
		//query.groupBy()
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
	}
}
