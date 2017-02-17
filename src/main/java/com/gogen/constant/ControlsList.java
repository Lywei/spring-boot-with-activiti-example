package com.gogen.constant;

import lombok.Getter;

/**
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
public enum ControlsList {

    Input("Input","单行文本输入框"),
    MutiInput("MutiInput","多行行文本输入框"),
    Number("Number","数字输入框"),
    Button("Button","按钮"),
    Text("Text","说明文字"),
    Image("Image","图片附件"),
    Attachment("Attachment","附件"),
    Select("Select","单选框"),
    MutiSelect("MutiSelect","多选框"),
    Date("Date","日期"),
    MutiDate("MutiDate","日期区间");

    private String code;
    private String name;

    private ControlsList(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
