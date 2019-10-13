package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "mst_product")
public class Product {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String productName;
    private Integer qty;
    private BigDecimal price;

    /*
    * One product From Store
    * */
    @ManyToOne()
    @JoinColumn(name = "store_id")
    @JsonIgnore
    private Store storeId;

    @Transient
    private Integer pasangIdStore;

    public Product() {
    }
    public Product(String productName, Integer qty, BigDecimal price) {
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getQty() {
        return qty;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Store getStoreId() {
        return storeId;
    }
    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }
    public Integer getPasangIdStore() {
        return pasangIdStore;
    }
    public void setPasangIdStore(Integer pasangIdStore) {
        this.pasangIdStore = pasangIdStore;
    }
    public void deductQuantity(Integer qty){
        this.qty= this.qty - qty;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(qty, product.qty) &&
                Objects.equals(price, product.price) &&
                Objects.equals(storeId, product.storeId) &&
                price.compareTo(product.price)==0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, productName, qty, price, storeId, pasangIdStore);
    }
}
