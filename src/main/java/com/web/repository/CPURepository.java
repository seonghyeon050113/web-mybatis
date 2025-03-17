package com.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.common.CommonFactory;
import com.web.dto.CPUDTO;

public class CPURepository {
	public List<CPUDTO> selectCPUs(CPUDTO cpu){
		try(SqlSession session = CommonFactory.getSSF().openSession()){
			return session.selectList("CPUMapper.selectCPUs",cpu);
		}
	}
	public static void main(String[]args) {
		CPURepository cpus = new CPURepository();
		System.out.print(cpus.selectCPUs(null));
		
	}
}
