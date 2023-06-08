package com.spring;

import com.spring.beans.factory.config.BeanDefinition;
import com.spring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 初始化Beanfactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
