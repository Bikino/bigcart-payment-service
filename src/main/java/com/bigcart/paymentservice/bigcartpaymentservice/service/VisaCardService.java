package com.bigcart.paymentservice.bigcartpaymentservice.service;

import com.bigcart.paymentservice.bigcartpaymentservice.model.CardDTO;
import org.springframework.stereotype.Service;

public interface VisaCardService {
    CardDTO addCard(CardDTO cardDTO);
    void removeCard(CardDTO cardDTO);
}
