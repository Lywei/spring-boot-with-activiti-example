package com.gogen.controls.definition;

import java.util.List;

/**
 *
 *  下拉框
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
public class SelectControlsDefinition {

    private final Integer MAX_OPTIONS=20;

    List<OptionDefinition> definitionList;

    //是否可以继续添加选项
    public boolean verifyCount(){
        if(definitionList !=null && definitionList.size()>MAX_OPTIONS){
            return false;
        }
        return true;
    }


}
