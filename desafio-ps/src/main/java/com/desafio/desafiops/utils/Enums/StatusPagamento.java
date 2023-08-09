package com.desafio.desafiops.utils.Enums;

public enum StatusPagamento {

    PAGO("PAGO"),
    NAO_PAGO("NÃO PAGO"),
    CANCELADO("CANCELADO");
    private java.lang.String descricao;


    StatusPagamento(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


