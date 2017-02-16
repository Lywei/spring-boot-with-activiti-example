package com.gogen.controls;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 *
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "workflow_controls_def")
public class Controls {



    private String name;
    private String icon;

    public Controls(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }
}
