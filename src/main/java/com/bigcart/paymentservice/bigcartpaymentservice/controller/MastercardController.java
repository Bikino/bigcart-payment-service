package com.bigcart.paymentservice.bigcartpaymentservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MastercardController {

	@PostMapping("/addPayment")
	public String addPayment(){
		return "";
	}

}
