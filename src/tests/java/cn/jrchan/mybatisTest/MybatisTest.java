package cn.jrchan.mybatisTest;

import cn.hkxj.mapper.UserMapper;
import cn.hkxj.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MybatisTest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void test() {
        // 获取Mapper
        UserMapper userMapper = this.context.getBean(UserMapper.class);
        User u = new User();
        u.setId(1);
        List<User> user = userMapper.queryUserByWhere(u);
        System.out.println(user);
    }

}
