package com.desafio.desafiops.domain.Model;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_code;

    @Column(name = "documentoPagador", length = 50, nullable = false)
    private String doc_payer;

    @Column(name = "statusPagamento")
    private String status;

    public Payment(String doc_payer, String status) {
        this.doc_payer = doc_payer;
        this.status = status;
    }

    public Payment() {
    }

    public Long getPayment_code() {
        return payment_code;
    }

    public void setPayment_code(Long payment_code) {
        this.payment_code = payment_code;
    }

    public String getDoc_payer() {
        return doc_payer;
    }

    public void setDoc_payer(String doc_payer) {
        this.doc_payer = doc_payer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}