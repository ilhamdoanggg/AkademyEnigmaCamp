package com.enigma.specification;

import com.enigma.entity.Users;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;
/*
*    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateAt;
//    private Email email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Purchesed> purchesedList*/
public class UserSpecification {
    public final Specification<Users> findByCriteriaUsers(Users users){
        return new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                final Collection<Predicate> predicates =new ArrayList<>();
                if (!StringUtils.isEmpty(users.getFirstName())){
                    final Predicate fisthNamePredicate =criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("firstName")),
                                    "%"+users.getFirstName()+"%");
                    predicates.add(fisthNamePredicate);
                } if (!StringUtils.isEmpty(users.getLastName())){
                    final Predicate lastNamePredicate =criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("lastName")),
                                    "%"+users.getLastName()+"%");
                    predicates.add(lastNamePredicate);
                } if (!StringUtils.isEmpty(users.getEmail())){
                    final Predicate emailPredicate =criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("email")),
                                    "%"+users.getEmail()+"%");
                    predicates.add(emailPredicate);
                } if (!StringUtils.isEmpty(users.getUsername())) {
                    final Predicate userNamePredicate = criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("firstName")),
                                    "%" + users.getFirstName() + "%");
                    predicates.add(userNamePredicate);
                } if (!StringUtils.isEmpty(users.getPurchesedList())){
                    final Predicate purchasedDetaulPredicate =criteriaBuilder
                            .like(criteriaBuilder.lower(root.get("dttttttttttt")),
                                    "%"+users.getFirstName()+"%");
                    predicates.add(purchasedDetaulPredicate);
                }
                return null;
            }
        };
    }
}
