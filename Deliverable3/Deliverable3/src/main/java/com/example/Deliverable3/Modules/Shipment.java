package com.example.Deliverable3.Modules;

public class Shipment {
    private String idCustomer;
    private String originCity;
    private String destinationCity;
    private String destinationAddress;
    private String receptorName;
    private String phone;
    private String declaredValue;
    private String weigth;

    public Shipment(String idCustomer, String originCity, String destinationCity, String destinationAddress, String receptorName, String phone, String declaredValue, String weigth) {
        this.idCustomer = idCustomer;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.destinationAddress = destinationAddress;
        this.receptorName = receptorName;
        this.phone = phone;
        this.declaredValue = declaredValue;
        this.weigth = weigth;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getReceptorName() {
        return receptorName;
    }

    public void setReceptorName(String receptorName) {
        this.receptorName = receptorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(String declaredValue) {
        this.declaredValue = declaredValue;
    }

    public String getWeigth() {
        return weigth;
    }

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }
}
