package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/***
 * @auther zhuyunsheng
 * @Date
 * 配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class LeyouConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouConfigApplication.class, args);
    }

}
