package com.wrial.boot.config;

import com.wrial.boot.bean.Person;
import com.wrial.boot.service.TestSpringXmlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 也就是来替换Spring中的添加组件（以前是xml）
 * */
//@Configuration
@Slf4j
public class SpringBootConfiguration {


    //注入此bean的id就为方法名：testSpringXmlService
    @Bean
    public TestSpringXmlService testSpringXmlService(){
      log.info("TestSpringXmlService已经被加载进去");
        return new TestSpringXmlService();
    }
    @Bean
    public Person person(){
        Person p = new Person();
        p.setName("wrial");
        p.setMan(true);
        log.info("PersonSpringBootConfiguration被加载{}，{}",p.getName(),p.getMan());
        return p;
    }


}
