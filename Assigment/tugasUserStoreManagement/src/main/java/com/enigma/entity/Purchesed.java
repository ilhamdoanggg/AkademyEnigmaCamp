package com.enigma.entity;

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
    private String productId;
    private Integer qty;
    private BigDecimal totalPrice;

    @ManyToOne()
    @JoinColumn(name = "userId")
    @JsonIgnore
    private Users userId;

    public Purchesed() {
    }

    public Purchesed(String productId, Integer qty, BigDecimal totalPrice) {
        this.productId = productId;
        this.qty = qty;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
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

    public Users getUsers() {
        return userId;
    }

    public void setUsers(Users users) {
        this.userId = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchesed purchesed = (Purchesed) o;
        return Objects.equals(id, purchesed.id) &&
                Objects.equals(productId, purchesed.productId) &&
                Objects.equals(qty, purchesed.qty) &&
                totalPrice.compareTo(purchesed.totalPrice)==0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, productId, qty, totalPrice);
    }
}
