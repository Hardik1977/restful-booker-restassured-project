package com.restful.booker.model;

public class RestFulBookerPojo {

    private String firstName;
    private String lastName;
    private double totalprice;
    private boolean depositpaid;
    private String checkin;

    private String checkout;

    private String additionalneeds;

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

    public double getTotalprice(){
        return totalprice;
    }
    public void setTotalPrice(double totalprice) {
        this.totalprice = totalprice;
    }


    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public boolean getDepositpaid(){
        return depositpaid;
    }

    public String getCheckIn() {
        return checkin;
    }
    public void setCheckIn (String checkin) {
        this.checkin = checkin;
    }

    public String getCheckOut() {
        return checkout;
    }
    public void getCheckOut (String checkout) {
        this.checkout = checkout;
    }

    public void setAdditionalNeeds (String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
    public String getAdditionalNeeds () {
        return additionalneeds;
    }

}
