package com.univers.basic;
/*
* 使用接口创建常量，无需添加上static final关键字，接口被编译过后会自动被加上的
* 常量接口存在的一些缺陷：
* 1.可被子类继承，并修改常量的定义
* 2.
* */
public interface Constant_Interface {
    String constant="demotest_1";
}
