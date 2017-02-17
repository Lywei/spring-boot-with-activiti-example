package com.gogen.controls;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 *
 *  区间时间控件
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@NoArgsConstructor
@Getter
@Setter
public class DoubleTimeControls extends AbstractControls {


    @NotNull(message = "日期为必填项")
    private Date start; //开始时间

    @NotNull(message = "日期为必填项")
    private Date end; //结束时间

    @NotNull(message = "标题不能为空")
    @Max(value = 10,message = "最多10个字")
    private String endTimeTitle;//结束时间 显示标题

    /** 标题提示*/
    @Max(value = 20,message = "最多10个字")
    private String endTimeTitleTips;//标题提示

    @NotNull(message = "时间表达式不能为空")
    private String patternName;//正则表达式



}
