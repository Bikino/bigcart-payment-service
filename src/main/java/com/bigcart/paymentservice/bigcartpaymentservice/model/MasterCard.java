package com.bigcart.paymentservice.bigcartpaymentservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class MasterCard{
    @Id
    @GeneratedValue
    int id;
    String cardNumber;
    String cvs;
    LocalDate expirationDate;
    String nameOnCard;

    public MasterCard(String cardNumber, String cvs, LocalDate expirationDate, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.cvs = cvs;
        this.expirationDate = expirationDate;
        this.nameOnCard = nameOnCard;
    }

    public MasterCard() {

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvs() {
        return cvs;
    }

    public void setCvs(String cvs) {
        this.cvs = cvs;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

}
