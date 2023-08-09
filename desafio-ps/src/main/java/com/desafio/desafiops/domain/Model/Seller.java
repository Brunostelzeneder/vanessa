package com.desafio.desafiops.domain.Model;


import com.desafio.desafiops.domain.Dto.SellerDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Vendedor")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seller_code;

    @Column(name = "nomeVendedor", length = 50, nullable = false)
    private String name;

    public Seller(String nomeVendedor) {

        this.name = nomeVendedor;
    }

    public Seller() {

    }

    public Long getSeller_code() {
        return seller_code;
    }

    public void setSeller_code(Long seller_code) {
        this.seller_code = seller_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }
