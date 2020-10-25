package com.bigcart.paymentservice.bigcartpaymentservice.controller;

import com.bigcart.paymentservice.bigcartpaymentservice.model.CardType;
import com.bigcart.paymentservice.bigcartpaymentservice.model.MasterCard;
import com.bigcart.paymentservice.bigcartpaymentservice.model.VisaCard;
import com.bigcart.paymentservice.bigcartpaymentservice.repository.MasterCardRepository;
import com.bigcart.paymentservice.bigcartpaymentservice.repository.VisaCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class CardController {
    @Autowired
    private MasterCardRepository masterCardRepository;
    @Autowired
    private VisaCardRepository visaCardRepository;
    @PostMapping("/addCard")
    public void addCard(@RequestBody Object card, CardType type) {
        if(type == CardType.MASTER_CARD){
            MasterCard masterCard = (MasterCard)card;
            masterCardRepository.save(masterCard);
        } else {
            VisaCard visaCard = (VisaCard) card;
            visaCardRepository.save(visaCard);
        }
    }
}
