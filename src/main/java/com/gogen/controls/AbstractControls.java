package com.gogen.controls;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 *
 *  控件
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractControls {

    //控件id
    private Integer id;

    /** 标题*/
    @NotNull(message = "标题不能为空")
    @Max(value = 10,message = "最多10个字")
    private String title;

    /** 标题提示*/
    @Max(value = 20,message = "最多10个字")
    private String titleTips;

    /** 是否为必填项*/
    private boolean required;


}
