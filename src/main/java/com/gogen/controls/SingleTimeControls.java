package com.gogen.controls;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
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

    @NotNull(message = "日期为必填项")
    private Date date;//日期

    @NotNull(message = "时间表达式为必填项")
    private String patternName;//正则表达式
}
