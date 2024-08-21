package com.rewardService.rewardservice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class RewardService {
	
	public int calculateRewards(int totalSpent) {
		int totalRewards = 0;
		if(totalSpent <= 100 && totalSpent >= 50) {
			return totalRewards = totalSpent -50;
		}else if(totalSpent >= 100) {
			return totalRewards = (totalSpent -100) * 2 + 50;
		} else if (totalSpent <= 50) {
			return totalRewards;
		}
		return totalRewards;
	}

}
