package Pojos;
// Generated Nov 29, 2018 10:15:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private Integer id;
     private Account account;
     private String firstname;
     private String lastname;
     private String address;
     private String city;
     private String district;
     private String phone;
     private Set orderses = new HashSet(0);

    public Address() {
    }

	
    public Address(Account account) {
        this.account = account;
    }
    public Address(Account account, String firstname, String lastname, String address, String city, String district, String phone, Set orderses) {
       this.account = account;
       this.firstname = firstname;
       this.lastname = lastname;
       this.address = address;
       this.city = city;
       this.district = district;
       this.phone = phone;
       this.orderses = orderses;
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
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }




}


