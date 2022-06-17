package com.soft863.www.entity;

/**
 * 实体类：（一般用于前后台交互  和数据库表进行一一呼应  进行网络传输）
 *     entity   javaBean
 *     由属性和属性对应的get ,set方法组成
 *
 *     属性：名词  侧重事物的特点（公共特点） 属性一般私有化
 *     方法：动词  侧重事物的行为
 *
 *     快捷键：alt+insert  自动生成代码模板
 *
 */
public class Person {
    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
