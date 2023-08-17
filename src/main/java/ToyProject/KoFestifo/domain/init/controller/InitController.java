package ToyProject.KoFestifo.domain.init.controller;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ToyProject.KoFestifo.domain.event.entity.Event;
import ToyProject.KoFestifo.domain.event.service.EventService;
import ToyProject.KoFestifo.domain.init.service.InitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class InitController {
	private final EventService eventService;
	private final InitService initService;

	@GetMapping("/")
	public String index(Model model) throws IOException, ParseException {
		List<Event> events = eventService.findEvents();
		model.addAttribute("events", events);
		return "home";
	}
}
