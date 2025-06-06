package jp.co.sss.shop.controller.client.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jp.co.sss.shop.repository.UserRepository;

@Controller
public class ClientUserShowController {
	@Autowired
	UserRepository userRepository;

	@Autowired
	HttpSession session;
	
	@RequestMapping(path = "/client/user/detail")
	public String information(Model model) {
		model.addAttribute("info", session.getAttribute("user"));
		return "client/user/detail";
	}
}
