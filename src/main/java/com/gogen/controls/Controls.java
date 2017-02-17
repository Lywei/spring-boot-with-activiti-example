package com.gogen.controls;

import com.gogen.constant.MongoCollectionNamespace;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 *
 *  控件名称
 *
 * @author Yuanwei.Liang
 * @date 17/2/17
 */

@Getter
@Setter
@NoArgsConstructor
@Document(collection = MongoCollectionNamespace.controls)
public class Controls {

    @Id
    private String ObjectId;

    private String name;
    private String icon;

    public Controls(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }
}
