package web;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @RequestMapping("register_click.html")
    public String RegisterPage(HttpServletRequest request, User user) {

        return "resume";
    }
}
