package org.lambaANDapistream.model;

public class Product {

    private Integer id;
    private String productName;
    private Long productPrice;

    public Product() {
    }

    public Product(Integer id, String productName, Long productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(String productName, Long productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
