package ParkingLot.Models;

import ParkingLot.Enums.PaymentStatus;
import ParkingLot.Enums.PaymentType;

public class Payment extends BaseModel{
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    private int transactionnumber;
    private int amount;
    private Bill bill;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getTransactionnumber() {
        return transactionnumber;
    }

    public void setTransactionnumber(int transactionnumber) {
        this.transactionnumber = transactionnumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
