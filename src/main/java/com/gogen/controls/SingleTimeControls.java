package com.gogen.controls;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 *  时间控件
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
@Setter
public class SingleTimeControls extends Controls {

    private Date date;//日期
    private String pattern;//正则表达式
}
