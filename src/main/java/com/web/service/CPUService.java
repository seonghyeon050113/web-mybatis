package com.web.service;

import java.util.List;

import com.web.dto.CPUDTO;
import com.web.repository.CPURepository;

public class CPUService {
	private CPURepository cpuRepo = new CPURepository();
	
	public List<CPUDTO> selectCPUs(CPUDTO cpu){
		return cpuRepo.selectCPUs(null);
	}
}
