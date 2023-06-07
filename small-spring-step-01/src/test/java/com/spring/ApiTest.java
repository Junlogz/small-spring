package com.spring;

import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 初始化Beanfactory
        BeanFactory beanFactory = new BeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }

}
