package com.bigcart.paymentservice.bigcartpaymentservice.repository;

import model.Mastercard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MastercardRepository extends JpaRepository<Mastercard,Long> {
}
