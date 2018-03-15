package chapter05.practise.org.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/api/v1/haa", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
