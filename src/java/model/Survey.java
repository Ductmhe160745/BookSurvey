/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tranm
 */
public class Survey {

    int id;
    private String firstName;
    private String lastName;
    private String emial;
    private String address;
    private String citty;
    private String country;
    private int zip;
    private String bookStore;
    private String shopIn;
    private String shopOnline;
    private String comment;

    public Survey() {
    }

    public Survey(int id, String firstName, String lastName, String emial, String address, String citty, String country, int zip, String bookStore, String shopIn, String shopOnline, String comment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emial = emial;
        this.address = address;
        this.citty = citty;
        this.country = country;
        this.zip = zip;
        this.bookStore = bookStore;
        this.shopIn = shopIn;
        this.shopOnline = shopOnline;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitty() {
        return citty;
    }

    public void setCitty(String citty) {
        this.citty = citty;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getBookStore() {
        return bookStore;
    }

    public void setBookStore(String bookStore) {
        this.bookStore = bookStore;
    }

    public String getShopIn() {
        return shopIn;
    }

    public void setShopIn(String shopIn) {
        this.shopIn = shopIn;
    }

    public String getShopOnline() {
        return shopOnline;
    }

    public void setShopOnline(String shopOnline) {
        this.shopOnline = shopOnline;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    
    

}
