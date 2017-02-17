package com.gogen.controls;

import java.util.Date;

/**
 *
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
public class TimeControls {


    private Date date;//日期
    private String pattern;//正则表达式


    private static enum Pattern{

        Date("Date","yyyy-MM-dd-HH"),
        DateTime("DateTime","yyyy-MM-dd-HH-mm:ss");

        private String name;
        private String value;

        private Pattern(String name,String value){
            this.name=name;
            this.value=value;
        }
    }
}
