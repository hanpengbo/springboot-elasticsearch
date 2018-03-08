package com.jx.es.elasticsearch.domain;

import java.io.Serializable;

/**
 * Created by hpb on 2018-03-07.
 */
public class Author implements Serializable {
    private Long id;

    // 作者姓名
    private String name;

    // 作者简介
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name='" + name + '\'' + ", remark='" + remark + '\'' + '}';
    }
}
