package com.desafio.desafiops.controller;

import com.desafio.desafiops.domain.Dto.PaymentDto;
import com.desafio.desafiops.domain.Model.Payment;
import com.desafio.desafiops.service.PaymentService;
import com.desafio.desafiops.utils.DTOsConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/createPaymentTest")
    public ResponseEntity<Payment> createPayment(@RequestBody PaymentDto paymentDto) {
        Payment createPayment = DTOsConverter.converterDtoToSeller(paymentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.createPayment(createPayment));
    }
}
