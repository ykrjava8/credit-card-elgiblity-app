package com.banking.wipro.creditcardelgiblity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.wipro.creditcardelgiblity.entity.PanDetails;
import com.banking.wipro.creditcardelgiblity.repositry.PanDetailsRepositry;
@Service
public class PanDetailsServiceImpl implements PanDetailsService {
	@Autowired
	private PanDetailsRepositry panDetailsRepositry;

	@Override
	public PanDetails getPlanDetails(String panNumber) {
		PanDetails panDetails = null;
		Optional<PanDetails> panDetailsFromDB = panDetailsRepositry.findById(panNumber);
		if (panDetailsFromDB.isPresent()) {
			panDetails = panDetailsFromDB.get();
		}
		return panDetails;

	}

}
