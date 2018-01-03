package dao;

import domain.User;

public interface UserDao {
    public User findUserByUserName(final String userName);
    public void updateLoginInfo(User user);
    public int insertUser(User user);
}
