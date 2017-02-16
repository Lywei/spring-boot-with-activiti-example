package com.gogen.Repository;

import com.gogen.controls.Controls;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Yuanwei.Liang
 * @date 17/2/17
 */
public interface ControlsRepository extends MongoRepository<Controls, Long> {

    Controls findByname(String name);
}
