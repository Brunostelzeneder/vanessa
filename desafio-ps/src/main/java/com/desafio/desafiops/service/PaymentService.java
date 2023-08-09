package com.desafio.desafiops.service;

import com.desafio.desafiops.domain.Dto.PaymentDto;
import com.desafio.desafiops.domain.Model.Payment;
import com.desafio.desafiops.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    private PaymentRepository paymentRepository;


    public Payment createPayment(Payment payment) {

        return paymentRepository.save(payment);
    }
}
