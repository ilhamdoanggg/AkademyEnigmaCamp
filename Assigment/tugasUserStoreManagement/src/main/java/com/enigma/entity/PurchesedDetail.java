package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "trx_purchesed_detail")
public class PurchesedDetail {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "purchesedId")
    @JsonIgnore
    private Purchesed purchesed;

    @ManyToOne
    @JoinColumn(name = "productId")
    @JsonIgnore
    private Product product;
    private Integer qty;
    private BigDecimal totalPriceSub;

    @Transient
    private String productId;
    @Transient
    private String purchesedId;

    public PurchesedDetail() {
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

    public BigDecimal getTotalPriceSub() {
        return totalPriceSub;
    }

    public void setTotalPriceSub(BigDecimal totalPriceSub) {
        this.totalPriceSub = totalPriceSub;
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
}
