package ToyProject.KoFestifo.basic;

import ToyProject.KoFestifo.Repository.UserSetEventInfoRepository;
import ToyProject.KoFestifo.domain.Information.EventInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basic/events")
//@RequiredArgsConstructor
public class UserSetEventController {


    private final UserSetEventInfoRepository userSetRepository;

//    @Autowired
    public UserSetEventController(UserSetEventInfoRepository userSetRepository) {
        this.userSetRepository = userSetRepository;
    }


    @GetMapping
    public String events(Model model) {
        List<EventInfo> eventInfoList = userSetRepository.findAll();
        model.addAttribute("events", events);
        return "basic/events";
    }
}
