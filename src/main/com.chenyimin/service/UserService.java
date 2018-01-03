package service;

import dao.LoginLogDao;
import dao.UserDao;
import domain.LoginLog;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//将userService标注为一个服务层的bean
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(String userName, String password){
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    public User findUserNames(String userName){
        return userDao.findUserByUserName(userName);
    }

    public void loginSuccess(User user){
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());
        //更新积分
        userDao.updateLoginInfo(user);
        //更新登陆日志
        loginLogDao.insertLoginLog(loginLog);
    }
}
