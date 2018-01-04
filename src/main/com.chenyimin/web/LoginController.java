package web;

import domain.LoginCommand;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "index.html")
    public String loginPage() {
        return "index";
    }

    @RequestMapping(value = "resume.html")
    public String resumePage() {
        return "resume";
    }

    @RequestMapping(value = "register.html")
    public String registerPage() {
        return "register";
    }

    @RequestMapping(value = "loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
//        request.getParameter("")
        boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(), loginCommand.getPassword());
        if (!isValidUser) {
            return new ModelAndView("login1", "error", "用户名或密码错误");
        } else {
            User user = userService.findUserNames(loginCommand.getUserName());
            user.setLastIp(request.getRemoteAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("index");
        }
    }
}
