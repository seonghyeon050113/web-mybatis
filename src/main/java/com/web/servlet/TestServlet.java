package com.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.web.dto.TestDTO;

@WebServlet(urlPatterns= "/test/*")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		TestDTO test = new TestDTO();
		try {
			BeanUtils.populate(test, request.getParameterMap());
		} catch (IllegalAccessException e) {		
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(test);
	}
}
	
		
		
		
		
		
		
		
		
		
		
		/*String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		String[] hobbies = request.getParameterValues("hobby");
		List<String> hobbyList = Arrays.asList(hobbies);
		String hobby = String.join(",", hobbies);
		String trans = request.getParameter("trans");
		String[] dreams = request.getParameterValues("dream");
		List<String> dreamList = Arrays.asList(dreams);
		String dream = String.join(",",dreams);
		String desc = request.getParameter("desc");
		
		TestDTO test = new TestDTO();
		test.setName(name);
		test.setAge(Integer.parseInt(ageStr));
		test.setHobby(hobbyList);
		test.setTrans(trans);
		test.setDream(dreamList);
		test.setDesc(desc);
		System.out.print(test);
		
		System.out.print("name:"+name);
		System.out.print("age:"+ ageStr);
		System.out.print("hobby:"+ hobby);
		System.out.print("trans:"+ trans);
		System.out.print("dream:"+ dream);
		System.out.print("desc:"+ desc);
		*/
		//파라메터의 데이터 형식 Map<String,String[]>
		
