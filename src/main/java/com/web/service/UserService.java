package com.web.service;

import java.util.List;

import com.web.dto.UserDTO;
import com.web.repository.UserRepository;

public class UserService {
	private UserRepository gr = new UserRepository();

	public List<UserDTO> selectUsers(UserDTO user) {
		return gr.selectUsers(user);
	}
	public UserDTO selectUser(int uiNum) {
		return gr.selectUser(uiNum);
	}
	public UserDTO login(String uiId,String uiPwd) {
		UserDTO user = gr.selectUserbyUiId(uiId);
		if(user!=null && uiPwd.equals(user.getUiPwd())) {
			return user;
		}
		return null;
	}
	public int insertUser(UserDTO user) {
		return gr.insertUser(user);
	}
	public int updateUser(UserDTO user) {
		return gr.updateUser(user);
	}
	public int deleteUser(int uiNum) {
		return gr.deleteUser(uiNum);
	}
}
