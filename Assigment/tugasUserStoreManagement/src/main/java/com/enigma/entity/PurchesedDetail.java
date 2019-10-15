package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "trx_purchesed_detail")
public class PurchesedDetail {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    private Integer qty;
    private BigDecimal subTotalPrice;
    @Transient
    private String purchesedId;
    @ManyToOne
    @JoinColumn(name = "purchesedId")
    @JsonIgnore
    private Purchesed purchesed;

    @Transient
    private String productId;
    @ManyToOne
    @JoinColumn(name = "productId")
    @JsonIgnore
    private Product product;

    public PurchesedDetail() {
    }

    public PurchesedDetail(Purchesed purchesed, Product product, Integer qty, BigDecimal subTotalPrice, String productId, String purchesedId) {
        this.purchesed = purchesed;
        this.product = product;
        this.qty = qty;
        this.subTotalPrice = subTotalPrice;
        this.productId = productId;
        this.purchesedId = purchesedId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Purchesed getPurchesed() {
        return purchesed;
    }

    public void setPurchesed(Purchesed purchesed) {
        this.purchesed = purchesed;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getSubTotalPrice() {
        return subTotalPrice;
    }

    public void setSubTotalPrice(BigDecimal subTotalPrice) {
        this.subTotalPrice = subTotalPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPurchesedId() {
        return purchesedId;
    }

    public void setPurchesedId(String purchesedId) {
        this.purchesedId = purchesedId;
    }

    public void setPurchasePrice(BigDecimal price){
        this.subTotalPrice = price.multiply(new BigDecimal(this.qty));
    }

}
