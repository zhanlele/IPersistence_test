package com.quanle.mapper;

import com.quanle.pojo.User;

import java.util.List;

/**
 * @author quanle
 * @date 2020/3/2 10:44 PM
 */
public interface IUserMapper {

    /**
     *  查询所有用户
     * @return
     */
    public List<User> findAllUser();

    /**
     * 通过用户id查询用户
     * @return
     */
    public User findUserById(User user);

    /**
     * 通过用户id删除用户
     */
    public void deleteUserById(User user);

    /**
     * 新增用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 修改用户
     * @param user
     */
    public void updateUser(User user);
}
