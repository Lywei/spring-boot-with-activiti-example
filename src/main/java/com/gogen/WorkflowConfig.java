package com.gogen;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 系统配置
 * Created by Slahser on 8/16/16 11:43 in gogen-nirvana
 */
@Configuration
@ComponentScan("com.gogen")
@Import({

//  ESConfig.class
})
public class WorkflowConfig {


}
