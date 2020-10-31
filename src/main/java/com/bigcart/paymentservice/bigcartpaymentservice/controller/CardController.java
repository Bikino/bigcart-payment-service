package com.bigcart.paymentservice.bigcartpaymentservice.controller;

import com.bigcart.paymentservice.bigcartpaymentservice.model.CardDTO;
import com.bigcart.paymentservice.bigcartpaymentservice.service.MasterCardService;
import com.bigcart.paymentservice.bigcartpaymentservice.service.VisaCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private MasterCardService masterCardService;
    @Autowired
    private VisaCardService visaCardService;
    @PostMapping
    public ResponseEntity<CardDTO> addCard(@RequestBody CardDTO card) {
        CardDTO cardDTO = null;
        if(!card.getCardNumber().startsWith("4")) {
            cardDTO = masterCardService.addCard(card);
        } else {
            cardDTO = visaCardService.addCard(card);
        }
        return new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
    }
    @DeleteMapping
    public ResponseEntity removeCard(@RequestBody CardDTO card) {
        CardDTO cardDTO = null;
        if(!card.getCardNumber().startsWith("4")) {
            masterCardService.removeCard(card);
        } else {
            visaCardService.removeCard(card);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
