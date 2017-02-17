package com.gogen.controls.definition;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *  控件名称
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */

@Getter
@Setter
public class ControlsDefinition {

    private String code;
    private String name;

    public static Map<String,String> controlsMap=new HashMap<String, String>();

    static {
                controlsMap.put("Input","单行文本输入框");
                controlsMap.put("DoubleInput","双行文本输入框");
                controlsMap.put("Number","数字输入框");
                controlsMap.put("Text","说明文字");
                controlsMap.put("Image","图片附件");
                controlsMap.put("Attachment","附件");
                controlsMap.put("Select","单选框");
                controlsMap.put("DoubleSelect","多选框");
                controlsMap.put("Date","日期");
                controlsMap.put("DateTime","日期区间");
                controlsMap.put("Button","按钮");
    }


    public static Map<String,String> getControlsMap(){
        return controlsMap;
    }



}
