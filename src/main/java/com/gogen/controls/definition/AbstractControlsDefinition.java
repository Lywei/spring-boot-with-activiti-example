package com.gogen.controls.definition;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 *
 *  控件定义
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractControlsDefinition {

    private final String defaultTitle="标题";
    private final String defaultTitleTips="请输入";

    //控件id
    protected Integer id;

    //controls code
    protected String code;

    /** 标题*/
    @NotNull(message = "标题不能为空")
    @Max(value = 10,message = "最多10个字")
    protected String title=defaultTitle;

    /** 标题提示*/
    @Max(value = 10,message = "最多10个字")
    protected String titleTips=defaultTitleTips;

    /** 是否为必填项*/
    protected boolean required;

    /** 是否有输入提示*/
    protected boolean needTitleTips;

}
