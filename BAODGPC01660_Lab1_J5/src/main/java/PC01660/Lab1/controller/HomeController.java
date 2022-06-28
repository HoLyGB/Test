package PC01660.Lab1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import PC01660.Lab1.Entity.NhanVien;


@Controller
public class HomeController {
	@Autowired
	HttpServletRequest req;
	
	@RequestMapping("/index1")
	public String index1(Model m) {
		NhanVien nv = new NhanVien();
		nv.setMaNV("NV001");
		nv.setTenNV("Dương Gia Bảo");
		m.addAttribute("nv",nv);
		return "index";
	}
}
