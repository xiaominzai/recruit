package web;

import domain.Job;
import domain.LoginCommand;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.JobService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private JobService jobService;


    @RequestMapping(value = "index.html")
    public ModelAndView loginPage() {
        List<Job> jobs=new ArrayList<Job>();
        jobs=jobService.queryAllJob();
        ModelAndView mm=new ModelAndView();
        mm.addObject("jobs",jobs);
        mm.addObject("index");
        return mm;
    }

    @RequestMapping(value = "resume.html")
    public String resumePage() {
        return "resume";
    }

    @RequestMapping(value = "companyJob.html")
    public String companyJobPage() {
        return "single";
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
