package com.rewardService.rewardservice.web;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.rewardService.rewardservice.service.RewardService;

class ControllerTest {
	@InjectMocks
	private Controller controller;
	
	@Mock
	private RewardService rewardService;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testCalculateRewards() {
		Mockito.when(rewardService.calculateRewards(anyInt())).thenReturn(54);
		int rewardPoints = controller.calculateRewards(102);
	}

}
