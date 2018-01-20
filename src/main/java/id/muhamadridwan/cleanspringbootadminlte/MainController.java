package id.muhamadridwan.cleanspringbootadminlte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    String index(){
        return "page1";
    }
}
