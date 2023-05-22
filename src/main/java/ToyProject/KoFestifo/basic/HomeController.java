package ToyProject.KoFestifo.basic;

import ToyProject.KoFestifo.Repository.InfoRepository;
import ToyProject.KoFestifo.domain.Information.Info;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

//    @Autowired
    private InfoRepository infoRepository;

    @GetMapping("/api")
    public String index() {
        return "basic/index";
    }

    @PostMapping("/api")
    public String load_save(@ModelAttribute Info info){
        StringBuilder result = new StringBuilder();

        

        return "basic/index";
    }
}
