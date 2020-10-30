package com.bigcart.paymentservice.bigcartpaymentservice.service.imp;

import com.bigcart.paymentservice.bigcartpaymentservice.model.CardDTO;
import com.bigcart.paymentservice.bigcartpaymentservice.model.MasterCard;
import com.bigcart.paymentservice.bigcartpaymentservice.model.VisaCard;
import com.bigcart.paymentservice.bigcartpaymentservice.repository.MasterCardRepository;
import com.bigcart.paymentservice.bigcartpaymentservice.service.MasterCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterCardServiceImp implements MasterCardService {
    @Autowired
    private MasterCardRepository masterCardRepository;
    @Override
    public CardDTO addCard(CardDTO cardDTO) {
        MasterCard masterCard = new MasterCard(cardDTO.getCardNumber(),cardDTO.getCvs(),
                cardDTO.getExpirationDate(),cardDTO.getNameOnCard(),cardDTO.getUserId());
        masterCard = masterCardRepository.save(masterCard);
        cardDTO.setId(masterCard.getId());
        return cardDTO;
    }
}
