package Pojos;
// Generated Nov 29, 2018 10:15:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private Integer id;
     private Account account;
     private Address address;
     private Double shipping;
     private Double total;
     private String status;
     private Date datetime;
     private Set orderDetailses = new HashSet(0);

    public Orders() {
    }

	
    public Orders(Account account, Address address) {
        this.account = account;
        this.address = address;
    }
    public Orders(Account account, Address address, Double shipping, Double total, String status, Date datetime, Set orderDetailses) {
       this.account = account;
       this.address = address;
       this.shipping = shipping;
       this.total = total;
       this.status = status;
       this.datetime = datetime;
       this.orderDetailses = orderDetailses;
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
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Double getShipping() {
        return this.shipping;
    }
    
    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDatetime() {
        return this.datetime;
    }
    
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    public Set getOrderDetailses() {
        return this.orderDetailses;
    }
    
    public void setOrderDetailses(Set orderDetailses) {
        this.orderDetailses = orderDetailses;
    }




}


