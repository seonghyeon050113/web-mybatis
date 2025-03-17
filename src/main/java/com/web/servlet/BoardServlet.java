package com.web.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import com.web.common.CommonCMD;
import com.web.dto.BoardDTO;
import com.web.service.BoardService;

@WebServlet(urlPatterns = "/board/*")
@MultipartConfig(
		fileSizeThreshold = 1024*100,
		maxFileSize = 1024*1024&100,
		maxRequestSize = 1024*1024*500
		)

public class BoardServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	BoardService boardService = new BoardService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = CommonCMD.getCmd(request);
		if ("board-list".equals(cmd)) {
			List<BoardDTO> boards;
			boards = boardService.selectBoards(null);
			request.setAttribute("boards", boards);

		} else if ("board-view".equals(cmd)) {
			String binumStr = request.getParameter("biNum");
			int biNum = Integer.parseInt(binumStr);
			BoardDTO boardDTO;
			boardDTO = boardService.selectBoard(biNum);
			request.setAttribute("boardDTO", boardDTO);
		}
		CommonCMD.viewsForward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uploadPath = request.getServletContext().getRealPath("")+"/upload";
		File root = new File(uploadPath);
		if(!root.exists()) {
			root.mkdir();
		}
		Collection<Part> parts =request.getParts();
			for (Part part: parts) {
				String name = part.getName();
				String submittedFilename = part.getSubmittedFileName();
				out.println("name:"+name+", submittedFilename:"+submittedFilename+"<br>");
			}
		
		
		String cmd = CommonCMD.getCmd(request);
		BoardDTO board = new BoardDTO();
		try {
			BeanUtils.populate(board, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = "";
		String url = "/board/board-list";
		if ("insert".equals(cmd)) {
			int result = boardService.insertBoard(board);
			msg = "입력실패";
			if (result == 1) {
				msg = "입력성공";
			}
		} else if ("update".equals(cmd)) {
			int result = boardService.updateBoard(board);
			msg = "수정실패";
			if (result == 1) {
				msg = "수정성공";
			} else if ("delete".equals(cmd)) {

				msg = "삭제실패";
				if (boardService.deleteBoard(board.getBiNum()) == 1) {
					msg = "삭제성공";
				}
				request.setAttribute("msg", msg);
				request.setAttribute("url", url);
				CommonCMD.msgForward(request, response);
			}
		}
	}
}
