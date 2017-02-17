package com.gogen.controls.definition;

import lombok.Getter;

import javax.validation.constraints.Max;

/**
 *
 *  数字输入框定义
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
public class NumberInputControlsDefinition extends InputControlsDefinition {

    @Max(value =20,message = "最多20个字")
    private String unit;
}
