package Pojos;
// Generated Nov 29, 2018 10:15:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer id;
     private ProductCategory productCategory;
     private ProductColour productColour;
     private ProductRequest productRequest;
     private ProductSize productSize;
     private ProductSubcategory productSubcategory;
     private String name;
     private String code;
     private Double price;
     private Double shipping;
     private Integer qty;
     private String status;
     private Set bags = new HashSet(0);
     private Set orderDetailses = new HashSet(0);
     private Set productImages = new HashSet(0);
     private Set requests = new HashSet(0);

    public Product() {
    }

	
    public Product(ProductCategory productCategory, ProductColour productColour, ProductRequest productRequest, ProductSize productSize, ProductSubcategory productSubcategory) {
        this.productCategory = productCategory;
        this.productColour = productColour;
        this.productRequest = productRequest;
        this.productSize = productSize;
        this.productSubcategory = productSubcategory;
    }
    public Product(ProductCategory productCategory, ProductColour productColour, ProductRequest productRequest, ProductSize productSize, ProductSubcategory productSubcategory, String name, String code, Double price, Double shipping, Integer qty, String status, Set bags, Set orderDetailses, Set productImages, Set requests) {
       this.productCategory = productCategory;
       this.productColour = productColour;
       this.productRequest = productRequest;
       this.productSize = productSize;
       this.productSubcategory = productSubcategory;
       this.name = name;
       this.code = code;
       this.price = price;
       this.shipping = shipping;
       this.qty = qty;
       this.status = status;
       this.bags = bags;
       this.orderDetailses = orderDetailses;
       this.productImages = productImages;
       this.requests = requests;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public ProductCategory getProductCategory() {
        return this.productCategory;
    }
    
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    public ProductColour getProductColour() {
        return this.productColour;
    }
    
    public void setProductColour(ProductColour productColour) {
        this.productColour = productColour;
    }
    public ProductRequest getProductRequest() {
        return this.productRequest;
    }
    
    public void setProductRequest(ProductRequest productRequest) {
        this.productRequest = productRequest;
    }
    public ProductSize getProductSize() {
        return this.productSize;
    }
    
    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }
    public ProductSubcategory getProductSubcategory() {
        return this.productSubcategory;
    }
    
    public void setProductSubcategory(ProductSubcategory productSubcategory) {
        this.productSubcategory = productSubcategory;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getShipping() {
        return this.shipping;
    }
    
    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getBags() {
        return this.bags;
    }
    
    public void setBags(Set bags) {
        this.bags = bags;
    }
    public Set getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set orderDetailses) {
        this.orderDetailses = orderDetailses;
    }
    public Set getProductImages() {
        return this.productImages;
    }
    
    public void setProductImages(Set productImages) {
        this.productImages = productImages;
    }
    public Set getRequests() {
        return this.requests;
    }
    
    public void setRequests(Set requests) {
        this.requests = requests;
    }




}


