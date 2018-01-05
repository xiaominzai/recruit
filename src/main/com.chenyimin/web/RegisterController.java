package web;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "register_click.html")
    public ModelAndView RegisterPage(HttpServletRequest request, User user) {
        user.setLastIp("127.0.0.1");
        user.setLastVisit(new Date());
        boolean isInsert = userService.registerUser(user);
        if (isInsert == true) {
            return new ModelAndView("index");
        } else {
            return new ModelAndView("register", "error", "信息没有填写完整");
        }
    }
}
