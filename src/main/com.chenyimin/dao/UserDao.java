package dao;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

//通过注解定义一个dao
@Repository
public class UserDao {

    //自动注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //匹配密码
    public int getMatchCount(String userName, String password){
        String sqlStr = " SELECT count(*) FROM t_user WHERE user_name=? and password=? ";
        return jdbcTemplate.queryForInt(sqlStr,new Object[]{userName,password});
    }

    //根据用户名查询用户
    public User findUserByUserName(final String userName){
        String sqlStr = " SELECT user_id,user_name,credits FROM t_user WHERE user_name =?";
        final User user = new User();
        jdbcTemplate.query(sqlStr, new Object[]{userName},
                //匿名内部类实现的回调方法
                new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUserName(userName);
                        user.setCredits(resultSet.getInt("credits"));
                    }
                });
        return user;
    }

    public void updateLoginInfo(User user){
        String sqlStr = " UPDATE t_user SET last_visit=?,last_ip=?,credits=? WHERE user_id=? ";
        jdbcTemplate.update(sqlStr,new Object[]{user.getLastVisit(), user.getLastIp(), user.getCredits(), user.getUserId()});
    }
}
