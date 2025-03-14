package com.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.common.CommonFactory;
import com.web.dto.UserDTO;

public class UserRepository {
	public List<UserDTO> selectUsers(UserDTO user){
		try(SqlSession session = CommonFactory.getSSF().openSession()){
			return session.selectList("UserMapper.selectUsers",user);
		}
	}
	public UserDTO selectUser(int uiNum){
		try(SqlSession session = CommonFactory.getSSF().openSession()){
			return session.selectOne("UserMapper.selectUser",uiNum);
		}
	}
	public UserDTO selectUserbyUiId(String uiId){
		try(SqlSession session = CommonFactory.getSSF().openSession()){
			return session.selectOne("UserMapper.selectUserByUiNum",uiId);
		}
	}
	public int insertUser(UserDTO user){
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.insert("GameMapper.insertUsers",user);
		}
	}
	public int updateUser(UserDTO user){
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.update("GameMapper.updateUsers",user);
		}
	}
	public int deleteUser(int giNum){
		try(SqlSession session = CommonFactory.getSSF().openSession(true)){
			return session.delete("GameMapper.deleteUsers",giNum);
		}
	}
	public static void main(String[]args) {
		UserRepository gr = new UserRepository();
		List<UserDTO> list = gr.selectUsers(null);
	
		System.out.println(list);
	
	}
}
