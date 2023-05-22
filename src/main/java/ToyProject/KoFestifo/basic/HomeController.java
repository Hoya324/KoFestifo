package ToyProject.KoFestifo.basic;

import ToyProject.KoFestifo.Repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private InfoRepository infoRepository;

    @GetMapping("/api")
    public String index() {
        return "index";
    }
}
