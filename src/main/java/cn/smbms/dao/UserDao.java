package cn.smbms.dao;

import cn.smbms.beans.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);

    public List<User> getUserList(User user);

}
