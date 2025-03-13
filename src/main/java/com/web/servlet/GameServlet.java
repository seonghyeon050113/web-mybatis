package com.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.web.dto.GameDTO;
import com.web.service.GameService;

@WebServlet(urlPatterns = "/game/*")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GameService gameService = new GameService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI(); // /game/game-list , 실제경로
		int idx = uri.lastIndexOf("/") + 1;
		String cmd = uri.substring(idx);
		
		if("game-list".equals(cmd)) {
			String search = request.getParameter("search");
			String searchStr = request.getParameter("searchStr");
			Map<String,String> param = new HashMap<>();
			param.put("search", search);
			param.put("searchStr", searchStr);
			List<GameDTO> games = gameService.selectGames(param);
			request.setAttribute("games", games);
		}else if("game-view".equals(cmd)) {
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views"+uri+".jsp"); // /game/game-list
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		GameDTO game = new GameDTO();
		int idx = uri.lastIndexOf("/") + 1;
		String cmd = uri.substring(idx);
		try {
			BeanUtils.populate(game, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(game);
		if("insert".equals(cmd)) {
			
		}else if("update".equals(cmd)) {
			
		}else if("delete".equals(cmd)) {
			
		}
	}

}
