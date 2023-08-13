package ToyProject.KoFestifo.domain.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ToyProject.KoFestifo.domain.member.controller.dto.MemberDTO;
import ToyProject.KoFestifo.domain.member.entity.Member;
import ToyProject.KoFestifo.domain.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@GetMapping("/new")
	public String createForm(Model model) {
		model.addAttribute("memberDTO", new MemberDTO());
		return "members/createMemberForm";
	}

	@PostMapping("/new")
	public String create(@Valid MemberDTO form, BindingResult result) {

		if (result.hasErrors()) {
			return "members/createMemberForm";
		}
		Member member = new Member(form.getUsername(), form.getPassword(), form.getEmail());
		memberService.join(member);
		return "redirect:/";
	}

	@GetMapping
	public String showList(Model model) {
		List<Member> members = memberService.findMembers();
		model.addAttribute("members", members);
		return "members/memberList";
	}
}
