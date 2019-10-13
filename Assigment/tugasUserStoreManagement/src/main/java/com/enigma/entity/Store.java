package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "mst_store")
public class Store {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String storeName;
    private String address;
    private String description;
    private String phoneNumber;

    /*
    * One Store many of products
    * */
    @OneToMany(mappedBy = "storeId", cascade = CascadeType.PERSIST)
    List<Product> products = new ArrayList<>();

    public Store() {
    }
    public Store(String storeName, String address, String description, String phoneNumber) {
        this.storeName = storeName;
        this.address = address;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }
    public String  getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(storeName, store.storeName) &&
                Objects.equals(address, store.address) &&
                Objects.equals(description, store.description) &&
                Objects.equals(phoneNumber, store.phoneNumber) &&
                Objects.equals(products, store.products);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, storeName, address, description, phoneNumber, products);
    }
}
