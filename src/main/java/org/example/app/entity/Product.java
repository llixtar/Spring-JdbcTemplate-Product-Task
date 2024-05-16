package org.example.app.entity;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Product {

    private Long id;

    private String name;
    private Integer quota;
    private Double price;

    public Product() {
    }

    public Product(String name, Integer quota, Double price) {
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    public Product(Long id, String name, Integer quota, Double price) {
        this.id = id;
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(quota, product.quota) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quota, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "id: " + this.getId() +
                "; product name: " + this.getName() +
                "; quota,pcs: " + this.getQuota() +
                "; price,USD: " + this.getPrice() + "\n";
    }
}
