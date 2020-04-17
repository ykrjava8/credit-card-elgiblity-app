package com.banking.wipro.creditcardelgiblity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.banking.wipro.creditcardelgiblity.entity.PanDetails;
import com.banking.wipro.creditcardelgiblity.service.PanDetailsService;
import com.banking.wipro.creditcardelgiblity.vo.PanDetailsVo;

@Controller
public class PanDetailsController {
	@Autowired
	private PanDetailsService panDetailsService;
	private static final double MIN_ELGIBLE_CIEBEL_SCORE=5;
	@GetMapping("/index")
	public String getPanDetails(){
		System.out.println("getPanDetails");
		return"index";
	}
	@PostMapping("/checkEligibility")
	public String checkEligibility(@ModelAttribute PanDetailsVo panDetailsVo){
		PanDetails panDetails=panDetailsService.getPlanDetails(panDetailsVo.getPanNumber().toUpperCase());
		if(panDetails !=null) {
			return panDetails.getCreditScore()>=MIN_ELGIBLE_CIEBEL_SCORE?"elgiblecreditcard":"notelgiblecreditcard";
		}
		else {
			return "invalidpanpage";
		}
	}


}
