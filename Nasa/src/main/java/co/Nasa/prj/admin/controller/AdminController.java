package co.Nasa.prj.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.Nasa.prj.admin.service.dbtestService;
import co.Nasa.prj.admin.service.dbtestVO;


@Controller
public class AdminController {
	@Autowired
	private dbtestService dbtestDao; 
	
	@RequestMapping("/go_admin.do")
	public String go_admin() {
		return "admin/adminHome";
	}
	@RequestMapping("/ajaxdbtest.do")
	@ResponseBody
	public List<dbtestVO> ajaxdbtest() {
		List<dbtestVO> list = dbtestDao.testSelect();
		return list;
	}
}
