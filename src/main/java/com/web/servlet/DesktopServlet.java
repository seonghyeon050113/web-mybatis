package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.common.CommonCMD;
import com.web.dto.CPUDTO;
import com.web.service.CPUService;


@WebServlet("/desktop/")
public class DesktopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CPUService cpuService = new CPUService();   
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = CommonCMD.getCmd(request);
		if("desktop-insert".equals(cmd)) {
			List<CPUDTO> cpus = cpuService.selectCPUs(null);
			request.setAttribute("cpus", cpus);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
