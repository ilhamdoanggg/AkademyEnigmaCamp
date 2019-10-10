package com.enigma.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name ="trx_purchased")
public class Purchesed {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    private String productId;
    private Integer qty;
    private BigDecimal totalPrice;


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

    /*public void setPurchesPrice(BigDecimal productPrice){
        BigDecimal qtyDecimal= new BigDecimal(this.qty);
        this.totalPrice = productPrice.multiply(qtyDecimal);
    }*/
}
