package com.gogen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统启动类
 * Created by Liang on 8/16/16 11:43 in gogen-nirvana
 */
@Slf4j
@SpringBootApplication
public class WorkflowApplication {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(WorkflowConfig.class);
    }
}
