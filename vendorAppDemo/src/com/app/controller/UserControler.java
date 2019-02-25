package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserService;
import com.app.util.CoDecUtil;
import com.app.util.CodeUtil;
import com.app.util.CommonUtil;

@Controller
public class UserControler {
	@Autowired
	private IUserService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CoDecUtil coDecUtil;
	@Autowired
	private CommonUtil commonUtil;

	@RequestMapping("/showUser")
	public String showUser() {
		return "UserRegister";

	}

	@RequestMapping(value = "/saveUser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user, ModelMap map) {

		String pwd = codeUtil.genPwd();

		String epwd = coDecUtil.doEncode(pwd);

		user.setuPwd(epwd);

		service.sveUser(user);
		String text = "Your Email id==" + user.getUemail() + "  Your Contact number is==" + user.getuContact()
				+ "  your password is==" + pwd;

		commonUtil.sendEmail(user.getUemail(), "Register as User", text, null);

		String msg = user.getuName() + " you did sucessfully your work! and tour id is===" + user.getuId();
		map.addAttribute("msg", msg);
		return "UserRegister";

	}

	@RequestMapping("getAllUser")
	public String getAllUser(ModelMap map) {
		List<User> list = service.getAllUser();
		map.addAttribute("list", list);
		return "UserData";

	}

	@RequestMapping("/login")
	public String showLogin() {
		return "UserLogin";

	}

}
