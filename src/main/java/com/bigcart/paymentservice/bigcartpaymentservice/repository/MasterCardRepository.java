package com.bigcart.paymentservice.bigcartpaymentservice.repository;


import com.bigcart.paymentservice.bigcartpaymentservice.model.MasterCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterCardRepository extends JpaRepository<MasterCard,Long> {
}
