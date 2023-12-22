package com.pluralsight.dealership.models;

public class SalesContract extends Contract{
    private double salesTax = .05;
    private double recordingFee = 100;
    private double processingFee;
    private boolean finance;
    private double monthlyPayment;

    public SalesContract(String date, String customerName, String email, Vehicle carSold, boolean finance) {
        super(date, customerName, email, carSold);
        this.finance = finance;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }
    public double getTotalPrice(){


        double recordingFee = 100;
        if(carSold.getPrice() < 10000){
            processingFee = 295;
        }
        else {
            processingFee = 495;
        }
        totalPrice = carSold.getPrice() + processingFee + (salesTax * carSold.getPrice()) + recordingFee;
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        double rate = 0;
        double term = 0;
        double power = Math.pow(1 + rate,term);
        if(isFinance()){
            if(carSold.getPrice() > 10000){
                rate = .0425;
                term = 48;
                power = Math.pow(1 + (rate/12),term);
                monthlyPayment = getTotalPrice() * ((rate/12) * power) / (power - 1);
            }
            else{
                rate = .0525;
                term = 24;
                power = Math.pow(1 + rate,term);
                monthlyPayment = getTotalPrice() * ((rate/12) * power) / (power - 1);
            }
        }
        else return 0;

        return monthlyPayment;
    }
    public double getTaxes() {
        return carSold.getPrice() * salesTax;
    }
}
