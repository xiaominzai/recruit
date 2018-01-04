package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("login1.html")
    public String loginPage() {
        return "login1";
    }

}
