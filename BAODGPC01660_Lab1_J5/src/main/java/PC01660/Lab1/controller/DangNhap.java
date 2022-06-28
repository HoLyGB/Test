package PC01660.Lab1.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DangNhap {
@Autowired
ServletContext application;
@Autowired
HttpSession session;
@Autowired
HttpServletRequest req;
@Autowired
HttpServletResponse resp;
@RequestMapping("/dangnhap")
public String nhap() {
	req.getSession().removeAttribute("user");
	return "nhap";
}


@RequestMapping("/index3")
public String HoLy( ) {
	String user = req.getParameter("username");
	req.getSession().setAttribute("user", user);
	System.out.println("Username: "+user);

	return "index3";
}
}
