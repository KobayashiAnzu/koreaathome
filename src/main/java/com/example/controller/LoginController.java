package com.example.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.Member;
import com.example.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService service;

	@GetMapping({"/", "/login"})
	public String login(Model model) {
       model.addAttribute("member", new Member());
		return "login";
	}

	@PostMapping({"/", "/login"})
	public String login(
			@Valid Member member,
			Errors errors,
			HttpSession session) throws Exception {
		//入力に不備がある
		if(errors.hasErrors()) {
			return "login";
		}

		//パスワードが正しくない
		if(!service.isCorrectIdAndPassword(member.getLoginId(), member.getLoginPass())) {
			errors.rejectValue("loginId", "error.incorrect_id_password");
			return "login";
		}

		//正しいログインIDとパスワード
		//⇒セッションにログインIDを格納しリダイレクト
		session.setAttribute("loginId", member.getLoginId());
		return "redirect:/home";
     }

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//セッションを破棄、トップページへ遷移
		session.invalidate();
		return "redirect:/";
	}





}