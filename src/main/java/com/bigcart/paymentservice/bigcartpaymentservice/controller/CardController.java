package com.bigcart.paymentservice.bigcartpaymentservice.controller;

import com.bigcart.paymentservice.bigcartpaymentservice.model.CardDTO;
import com.bigcart.paymentservice.bigcartpaymentservice.service.MasterCardService;
import com.bigcart.paymentservice.bigcartpaymentservice.service.VisaCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class CardController {
    @Autowired
    private MasterCardService masterCardService;
    @Autowired
    private VisaCardService visaCardService;
    @PostMapping("/addCard")
    public ResponseEntity<CardDTO> addCard(@RequestBody CardDTO card) {
        CardDTO cardDTO = null;
        if(!card.getCardNumber().startsWith("4")) {
            cardDTO = masterCardService.addCard(card);
        } else {
            cardDTO = visaCardService.addCard(card);
        }
        return new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
    }
}
