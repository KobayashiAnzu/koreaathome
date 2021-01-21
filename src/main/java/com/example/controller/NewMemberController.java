package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.service.MemberService;

@Controller
@RequestMapping("/new")
public class NewMemberController {

	@Autowired
	MemberService service;

	@GetMapping
	public String newMember(Model model) {
		model.addAttribute("member", new Member());
		return "newMember";
	}

	@PostMapping
	public String addMember(
			@Valid Member member,
			Errors errors) throws Exception {
		if(errors.hasErrors()) {
			return "newMember";
		}

		service.addMember(member);
		return "redirect:/";
	}
}
