package ToyProject.KoFestifo.controller;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ToyProject.KoFestifo.domain.Event;
import ToyProject.KoFestifo.service.KofestifoService;
import ToyProject.KoFestifo.util.SeoulOpenAPIManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {
	private final KofestifoService<Event> eventService;
	private final SeoulOpenAPIManager seoulOpenAPIManager;

	@GetMapping("/")
	public String index(Model model) throws IOException, ParseException {
		seoulOpenAPIManager.readJson();
		List<Event> events = eventService.findMembers();
		model.addAttribute("events", events);
		return "home";
	}
}
