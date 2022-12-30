package com.Shadi_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Shadi_Dao.UserDao;
import com.Shadi_Model.UserBean;

@WebServlet("/User")
public class UserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("shadi");
		if (action.equals("user")) {
			createAccount(req, resp);
		} else if (action.equals("userFind")) {
			UserDao dao = new UserDao();
			// dao.findbyUser(0)
			int id = Integer.parseInt(req.getParameter("userId"));
			UserBean udI = dao.findbyUser(id);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h1>find don</h1>" + udI);
		} else if (action.equals("user_Delete")) {
			UserDao dao = new UserDao();
			int id = Integer.parseInt(req.getParameter("userId"));
			UserBean userDelete = dao.userDelete(id);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h1>userDelete</h1>" + userDelete);
		} else if (action.equals("user_Update")) {
			UserDao dao = new UserDao();
			//int id = Integer.parseInt(req.getParameter("userId"));
			//UserBean user_Update = dao.user_Update(id);
			userUpdate(req, resp);
			
		}

	}

	public void createAccount(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		int age = Integer.parseInt(req.getParameter("age"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String number = req.getParameter("number");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		UserBean bean = new UserBean();
		bean.setAge(age);
		bean.setName(name);
		bean.setNumber(number);
		bean.setGender(gender);
		bean.setPassword(password);
		bean.setEmail(email);
		bean.setCity(city);
		bean.setCountry(country);
		UserDao dao = new UserDao();
		dao.save(bean);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>create account</h1>");
	}

	public void userUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//req.getParameter("");
		int id = Integer.parseInt(req.getParameter("userId"));
		int age = Integer.parseInt(req.getParameter("age"));
		String number = req.getParameter("number");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		UserBean bean = new UserBean();
		bean.setId(id);
		bean.setAge(age);
		bean.setNumber(number);
		bean.setPassword(password);
		bean.setEmail(email);
		bean.setCity(city);
		bean.setCountry(country);
		UserDao dao=new UserDao();
		//dao.user_Update(age);
		 UserBean user_Update = dao.user_Update(bean);
		 
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
	    out.print("user is Updating"+user_Update);
	
	}
}
