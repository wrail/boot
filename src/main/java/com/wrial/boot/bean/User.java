package com.wrial.boot.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Data
@Component
@PropertySource(value = {"classpath:user.properties"})//加载特定的properties文件
@ConfigurationProperties(prefix = "user")//从配置文件中找前缀为person的配置信息
//@Valid
public class User {

//    @Email
//    @Value("${user.username}")
    private String username;
//    @Value("#{10*2}")
    private Integer age;
    private Date birth;
//    @Value("false")
    private Boolean man;
    private List<Object> list;
    private Map<String,Object> map;
    private MoreInfo moreInfo;

}
