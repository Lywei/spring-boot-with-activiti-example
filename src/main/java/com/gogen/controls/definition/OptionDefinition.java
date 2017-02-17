package com.gogen.controls.definition;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 *  选项定义
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
@Setter
public class OptionDefinition {

        @Max(value = 20,message = "最多20个字")
        @NotNull(message = "选项内容不为空")
        private String name;
}
