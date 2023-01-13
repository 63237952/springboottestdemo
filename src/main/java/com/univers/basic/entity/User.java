package com.univers.basic.entity;

import java.util.Date;

public class User {
    private Long id;
    private Long database_id;
    private String name;
    private Integer age;
    private Date gmt_create;
    private Date gmt_modified;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Long getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Long database_id) {
        this.database_id = database_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", database_id=" + database_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                '}';
    }

}
