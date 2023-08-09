package com.desafio.desafiops.utils;

import com.desafio.desafiops.domain.Dto.PaymentDto;
import com.desafio.desafiops.domain.Dto.SellerDto;
import com.desafio.desafiops.domain.Model.Payment;
import com.desafio.desafiops.domain.Model.Seller;

public class DTOsConverter {

    public static Seller converterDtoToSeller(SellerDto sellerDto) {

        Seller seller = new Seller();
        seller.setName(sellerDto.getName());
      return seller;
    }

    public static Payment converterDtoToSeller(PaymentDto paymentDto) {

        Payment payment = new Payment();
        payment.setDoc_payer(paymentDto.getDoc_payer());
        payment.setStatus(paymentDto.getStatus());
        return payment;
    }


}
