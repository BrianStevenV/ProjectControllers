package com.example.Deliverable3.Modules;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String residencyAddress;
    private String cityLocation;

    public Customer(String id, String firstName, String lastName, String phone, String email, String residencyAddress, String cityLocation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.residencyAddress = residencyAddress;
        this.cityLocation = cityLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidencyAddress() {
        return residencyAddress;
    }

    public void setResidencyAddress(String residencyAddress) {
        this.residencyAddress = residencyAddress;
    }

    public String getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }
}
