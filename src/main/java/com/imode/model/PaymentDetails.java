package com.imode.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PaymentDetails")
@Data
@Entity
public class PaymentDetails {

    @Id
    @Column(name = "PaymentDetailId")
    private int paymentDetailId;

    @Column(name = "CardName")
    private String cardName;

    @Column(name = "CardNumber")
    private String cardNumber;

    @Column(name = "expirationDate")
    private String expirationDate;

    @Column(name = "SecurityCode")
    private String securityCode;

}
