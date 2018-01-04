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
public class UserDaoImpl implements UserDao{

    //自动注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;



    //读账号密码
    //不为空
    //匹配


    //根据用户名查询用户
    public User findUserByUserName(final String userName){
        String sqlStr = " SELECT user_id,user_name,password,credits FROM t_user WHERE user_name =?";
        final User user = new User();
        jdbcTemplate.query(sqlStr, new Object[]{userName},
                //匿名内部类实现的回调方法
                new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUserName(userName);
                        user.setPassword(resultSet.getString("password"));
                    }
                });
        return user;
    }

    public void updateLoginInfo(User user){
        String sqlStr = " UPDATE t_user SET last_visit=?,last_ip=? WHERE user_id=? ";
        jdbcTemplate.update(sqlStr,new Object[]{user.getLastVisit(), user.getLastIp(), user.getUserId()});
    }

    /**
     * 插入用户
     * @param user
     * @return 插入影响列
     */
    @Override
    public int insertUser(final User user) {
        final String sqlStr = " INSERT INTO t_user( user_name, password, " +
                " last_ip, phone, sex, dob, email, country, work_time, jiaoyu, self_me)  " +
                " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        Object[] args = new Object[]{user.getUserName(),user.getPassword(),user.getLastIp(),
                user.getPhone(), user.getSex(), user.getDob(), user.getEmail(), user.getCountry(),
                user.getWork_time(), user.getJiaoyu(), user.getSelf_me()};
        return jdbcTemplate.update(sqlStr, args);
    }
}
