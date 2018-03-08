package com.jx.es.elasticsearch.domain;

import java.io.Serializable;

/**
 * Created by hpb on 2018-03-07.
 */
public class Tutorial implements Serializable {
    private Long id;

    private String name;// 教程名称

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}