package PC01660.Lab1.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import PC01660.Lab1.Entity.NhanVien;

@Controller
public class MyController {
@Autowired
ServletContext application;
@Autowired
HttpSession session;
@Autowired
HttpServletRequest req;
@Autowired
HttpServletResponse resp;
@RequestMapping("/index2")
public String HoLy() {
	req.setAttribute("message", "Sử dụng HttpServletRequest");
	return "index";
}
}

