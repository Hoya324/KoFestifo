package ToyProject.KoFestifo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("basic/events")
    public String hello(Model model) {
        return "basic/events";
    }
}
