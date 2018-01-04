package web;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping("register_click.html")
    public ModelAndView RegisterPage(HttpServletRequest request, User user) {
        boolean isInsert = userService.registerUser(user);
        if (isInsert == true) {
            return new ModelAndView("index");
        } else {
            return new ModelAndView("register", "error", "信息没有填写完整");
        }
    }
}
