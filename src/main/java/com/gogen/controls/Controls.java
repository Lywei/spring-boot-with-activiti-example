package com.gogen.controls;

/**
 *
 *  控件值对象
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
public interface Controls<V> {

    //控件编码
    String getControlsCode();

    //字段名称
    String getFeildName();

    //字段值
    V getValue();


}
