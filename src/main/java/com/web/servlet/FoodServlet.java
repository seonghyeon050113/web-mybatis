package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.common.CommonCMD;
import com.web.dto.FoodDTO;
import com.web.service.FoodService;


@WebServlet(urlPatterns = "/food/*")
public class FoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    FoodService foodService = new FoodService();   


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = CommonCMD.getCmd(request);
		if("food-list".equals(cmd)) {
			List<FoodDTO> selectList = foodService.selectFoods(null);
			request.setAttribute("selectList", selectList);
		}else if("food-view".equals(cmd)) {
			
		}
		CommonCMD.viewsForward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
