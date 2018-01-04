package service;

import dao.LoginLogDao;
import dao.UserDao;
import domain.LoginLog;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import units.Encryption;

//将userService标注为一个服务层的bean
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;
    @Autowired
    private Encryption encryption;

    /**
     * 判断用户名和密码是否正确,用于登陆
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    public boolean hasMatchUser(String userName, String password){
//        int matchCount = userDao.getMatchCount(userName, password);
//        return matchCount > 0;
        User user = userDao.findUserByUserName(userName);
        if (user.getPassword() == null){
            return false;
        }else{
            return encryption.match(password, user.getPassword());
        }

    }

    /**
     * 注册用户
     * @param user
     * @return 是否插入成功
     */
    public boolean registerUser(User user){
        user.setPassword(encryption.encrypt(user.getPassword()));
        int status = userDao.insertUser(user);
        return status > 0;
    }

    /**
     * 根据用户名查找username,password
     * @param userName
     * @return
     */
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
