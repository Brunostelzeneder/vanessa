package com.desafio.desafiops.service;


import com.desafio.desafiops.domain.Model.Seller;
import com.desafio.desafiops.repository.SellerRepository;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    private final SellerRepository sellerRepository;

    public Seller createSellerService(Seller seller) {

        return sellerRepository.save(seller);
    }
}
