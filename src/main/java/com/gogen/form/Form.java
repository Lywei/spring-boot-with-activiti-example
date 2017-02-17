package com.gogen.form;

import com.gogen.controls.Controls;

import java.util.List;

/**
 *
 *  表单
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
public interface Form {

    String getFormId();

     String getWorkflowDefinitionKey();

     List<Controls> getControlList();

}
