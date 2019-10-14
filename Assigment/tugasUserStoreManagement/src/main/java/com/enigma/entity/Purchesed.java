package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "trx_purchesed")
public class Purchesed {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;
    private BigDecimal totalPrice;
    @Transient
    private String userId;

    @OneToMany(mappedBy = "purchesed", cascade = CascadeType.PERSIST)
    List<PurchesedDetail> purchesedDetailList;

    public Purchesed() {
    }

    public Purchesed(BigDecimal totalPrice, Users user, String userId, List<PurchesedDetail> purchesedDetailList) {
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<PurchesedDetail> getPurchesedDetailList() {
        return purchesedDetailList;
    }

    public void setPurchesedDetailList(List<PurchesedDetail> purchesedDetailList) {
        this.purchesedDetailList = purchesedDetailList;
    }

    public BigDecimal setTotalPricePurchased(BigDecimal total){
        return this.totalPrice= this.totalPrice.add(total);
    }

}
