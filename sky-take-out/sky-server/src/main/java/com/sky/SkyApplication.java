package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理 没有它，@Transactional 写了也白写，事务不生效！ 在 SpringBoot 里可写可不写，写了也不报错
@Slf4j
public class SkyApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SkyApplication.class, args);
        System.out.println( "Hello SkyApplication!" );
    }
}
