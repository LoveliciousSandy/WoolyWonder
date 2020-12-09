package Pojos;
// Generated Nov 29, 2018 10:15:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ProductSubcategory generated by hbm2java
 */
public class ProductSubcategory  implements java.io.Serializable {


     private Integer id;
     private ProductCategory productCategory;
     private String subcategory;
     private String status;
     private Set products = new HashSet(0);

    public ProductSubcategory() {
    }

	
    public ProductSubcategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    public ProductSubcategory(ProductCategory productCategory, String subcategory, String status, Set products) {
       this.productCategory = productCategory;
       this.subcategory = subcategory;
       this.status = status;
       this.products = products;
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
    public String getSubcategory() {
        return this.subcategory;
    }
    
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}

