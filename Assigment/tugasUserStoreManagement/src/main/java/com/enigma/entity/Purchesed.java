package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "trx_purchesed")
public class Purchesed {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "productId")
    @JsonIgnore
    private Product product;

    private Integer qty;
    private BigDecimal totalPrice;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @Transient
    private String userId;

    @Transient
    private String productId;


    public Purchesed() {
    }

    public Purchesed(Integer qty, BigDecimal totalPrice) {
        this.qty = qty;
        this.totalPrice = totalPrice;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getQty() {
        return qty;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setPurchesPrice(BigDecimal productPrice){
        this.totalPrice = productPrice.multiply(new BigDecimal(this.qty));
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Users getUserId() {
        return user;
    }

    public void setUserId(Users userId) {
        this.user = userId;
    }

    public Users getUsers() {
        return user;
    }

    public void setUsers(Users users) {
        this.user = users;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchesed purchesed = (Purchesed) o;
        return Objects.equals(id, purchesed.id) &&
                Objects.equals(product, purchesed.product) &&
                Objects.equals(qty, purchesed.qty) &&
                totalPrice.compareTo(purchesed.totalPrice)==0 &&
                Objects.equals(user, purchesed.user) &&
                Objects.equals(userId, purchesed.userId) &&
                Objects.equals(productId, purchesed.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, qty, totalPrice, user, userId, productId);
    }
}
