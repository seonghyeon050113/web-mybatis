package com.web.service;

import java.util.List;

import com.web.dto.FoodDTO;
import com.web.repository.FoodRepository;

public class FoodService {
	FoodRepository foodRepository = new FoodRepository();
	public List<FoodDTO> selectFoods(FoodDTO food){
		return foodRepository.selectFoods(null);
	}
	public FoodDTO selectFood(int fiNum) {
		return foodRepository.selectFood(fiNum);
	}
	public int insertFood(FoodDTO food) {
		return foodRepository.insertFood(food);
	}
	public int updateFood(FoodDTO food) {
		return foodRepository.updateFood(food);
	}
	public int deleteFood(int fiNum) {
		return foodRepository.deleteFood(fiNum);
	}
}
