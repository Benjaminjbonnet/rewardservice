package com.rewardService.rewardservice.web;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewardService.rewardservice.service.RewardService;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	public RewardService rewardService;
	
	@GetMapping("/rewards/{totalSpent}")
	public int calculateRewards(@PathVariable int totalSale) {
		org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);
		return rewardService.calculateRewards(totalSale);
		
	}
}
