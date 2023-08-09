package com.desafio.desafiops.domain.Dto;

public class PaymentDto {

    private String doc_payer;

    private String status;

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
