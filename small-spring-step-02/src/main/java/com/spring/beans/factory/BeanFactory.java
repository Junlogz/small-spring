package com.spring.beans.factory;

import com.spring.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}

