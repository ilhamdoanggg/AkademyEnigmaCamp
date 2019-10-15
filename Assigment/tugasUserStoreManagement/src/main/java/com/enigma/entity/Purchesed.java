package com.enigma.entity;

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
    List<PurchesedDetail> purchesedDetail = new ArrayList<>();

    public Purchesed() {
    }

    public Purchesed(BigDecimal totalPrice, Users user, List<PurchesedDetail> purchesedDetail) {
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

    public List<PurchesedDetail> getPurchesedDetail() {
        return purchesedDetail;
    }

    public void setPurchesedDetail(List<PurchesedDetail> purchesedDetail) {
        this.purchesedDetail = purchesedDetail;
    }

    public BigDecimal setTotalPricePurchased(BigDecimal total){
        return this.totalPrice= this.totalPrice.add(total);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchesed purchesed = (Purchesed) o;
        return Objects.equals(id, purchesed.id) &&
                Objects.equals(user, purchesed.user) &&
                Objects.equals(totalPrice, purchesed.totalPrice) &&
             //   Objects.equals(userId, purchesed.userId) &&
                Objects.equals(purchesedDetail, purchesed.purchesedDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, totalPrice, purchesedDetail);
    }
}
