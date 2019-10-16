package com.enigma.specification;

import com.enigma.entity.Store;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;

public class StoreSpecification {
    public static Specification<Store> findByCriterias(Store store){
        return new Specification<Store>() {
            @Override
            public Predicate toPredicate(Root<Store> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(store.getStoreName())){
                    final Predicate storeNamePredicate=criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("storeName")),
                                    "%"+store.getStoreName()+"%");
                    predicates.add(storeNamePredicate);
                }if (!StringUtils.isEmpty(store.getAddress())){
                    final Predicate addressPredicate=criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("address")),
                                    "%"+store.getAddress()+"%");
                    predicates.add(addressPredicate);
                }if (!StringUtils.isEmpty(store.getDescription())){
                    final Predicate descriptionPredicat=criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("description")),
                                    "%"+store.getDescription()+"%");
                    predicates.add(descriptionPredicat);
                }if (!StringUtils.isEmpty(store.getPhoneNumber())){
                    final Predicate phoneNumberPredicate=criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("phoneNumber")),
                                    "%"+store.getPhoneNumber()+"%");
                    predicates.add(phoneNumberPredicate);
                }if (!StringUtils.isEmpty(store.getProducts())){
                    final Predicate productsPredicate=criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("products")),
                                    "%"+store.getProducts()+"%");
                    predicates.add(productsPredicate);
                }
                return null;
            }
        };
    }
}
