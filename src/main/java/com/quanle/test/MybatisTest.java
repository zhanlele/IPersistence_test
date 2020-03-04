package com.quanle.test;

import com.quanle.io.Resources;
import com.quanle.mapper.IUserMapper;
import com.quanle.pojo.User;
import com.quanle.sqlSession.SqlSession;
import com.quanle.sqlSession.SqlSessionFactory;
import com.quanle.sqlSession.SqlSessionFactoryBuilder;

import org.dom4j.DocumentException;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;

/**
 * @author quanle
 * @date 2020/3/4 11:12 PM
 */
public class MybatisTest {

    //查
    @Test
    public void test1() throws PropertyVetoException, DocumentException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        List<User> allUser = mapper.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }

    //增
    @Test
    public void test2() throws PropertyVetoException, DocumentException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        User user = new User();
        user.setId(3);
        user.setUsername("test2");
        mapper.addUser(user);
    }
    //删
    @Test
    public void test3() throws PropertyVetoException, DocumentException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        User user = new User();
        user.setId(1);
        mapper.deleteUserById(user);
    }
    //改
    @Test
    public void test4() throws PropertyVetoException, DocumentException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        User user = new User();
        user.setId(2);
        user.setUsername("test4");
        mapper.updateUser(user);
    }
}
