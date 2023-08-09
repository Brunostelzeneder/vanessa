package com.desafio.desafiops.controller;

import com.desafio.desafiops.domain.Dto.SellerDto;
import com.desafio.desafiops.domain.Model.Seller;
import com.desafio.desafiops.service.SellerService;
import com.desafio.desafiops.utils.DTOsConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {


    @Autowired
    private SellerService sellerService;


    @PostMapping()
    public ResponseEntity<Seller> createSeller(@RequestBody SellerDto seller) {
        Seller createNewSeller = DTOsConverter.converterDtoToSeller(seller);
        return ResponseEntity.status(HttpStatus.CREATED).body(sellerService.createSellerService(createNewSeller));
    }

}
