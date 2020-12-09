package Pojos;
// Generated Nov 29, 2018 10:15:08 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Request generated by hbm2java
 */
public class Request  implements java.io.Serializable {


     private Integer id;
     private Account account;
     private Product product;
     private Double price;
     private String colour;
     private String size;
     private Date dateTime;
     private String status;

    public Request() {
    }

	
    public Request(Account account, Product product) {
        this.account = account;
        this.product = product;
    }
    public Request(Account account, Product product, Double price, String colour, String size, Date dateTime, String status) {
       this.account = account;
       this.product = product;
       this.price = price;
       this.colour = colour;
       this.size = size;
       this.dateTime = dateTime;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getColour() {
        return this.colour;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    public Date getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


