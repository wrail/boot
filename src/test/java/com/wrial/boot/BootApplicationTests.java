package com.wrial.boot;

import com.wrial.boot.bean.Person;
import com.wrial.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BootApplicationTests {

    @Autowired
    private User user;

    @Autowired
    ApplicationContext application;

    @Test
    public void testUser() {
        log.info("UserInfo->{}", user.toString());
    }

    @Test
    public void testSpringXml() {
        boolean b = application.containsBean("service");
        log.info("SpringXml--->{}", b);
        boolean b1 = application.containsBean("testSpringXmlService");
        log.info("SpringBootBeanConfiguration-->{}", b1);
//        Person person = (Person) application.getBean("person");
//        log.info("Person-->{}", person.toString());
    }

    @Test
    public void contextLoads() {


    }

}
