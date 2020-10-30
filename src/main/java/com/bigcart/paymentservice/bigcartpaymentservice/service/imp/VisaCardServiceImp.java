package com.bigcart.paymentservice.bigcartpaymentservice.service.imp;

import com.bigcart.paymentservice.bigcartpaymentservice.model.CardDTO;
import com.bigcart.paymentservice.bigcartpaymentservice.model.VisaCard;
import com.bigcart.paymentservice.bigcartpaymentservice.repository.VisaCardRepository;
import com.bigcart.paymentservice.bigcartpaymentservice.service.VisaCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisaCardServiceImp implements VisaCardService {
    @Autowired
    private VisaCardRepository visaCardRepository;
    @Override
    public CardDTO addCard(CardDTO cardDTO) {
        VisaCard visaCard = new VisaCard(cardDTO.getCardNumber(),cardDTO.getCvs(),
                cardDTO.getExpirationDate(),cardDTO.getNameOnCard(),cardDTO.getUserId());
         visaCard = visaCardRepository.save(visaCard);
         cardDTO.setId(visaCard.getId());
         return cardDTO;
    }
}
