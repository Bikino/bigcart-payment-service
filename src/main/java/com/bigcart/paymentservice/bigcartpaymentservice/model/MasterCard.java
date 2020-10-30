package com.bigcart.paymentservice.bigcartpaymentservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class MasterCard{
    @Id
    @GeneratedValue
    private long id;
    private String cardNumber;
    private String cvs;
    private LocalDate expirationDate;
    private String nameOnCard;
    private long userId;

    public long getId() {
        return id;
    }

    public MasterCard() {
    }
    public MasterCard(String cardNumber, String cvs, LocalDate expirationDate, String nameOnCard, long userId) {
        this.cardNumber = cardNumber;
        this.cvs = cvs;
        this.expirationDate = expirationDate;
        this.nameOnCard = nameOnCard;
        this.userId=userId;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
