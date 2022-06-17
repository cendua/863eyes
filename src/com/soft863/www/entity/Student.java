package com.soft863.www.entity;

/**
 * 学生类
 * （包括学生学号，学生姓名，性别以及它们的get set方法）
 * 类：具备事物的共性（属性：特点，名词     方法：行为动作，动词，动宾）
 *  （1）实体类  属性+get,set
 *  （2）非实体类 侧重业务处理  :控制层   业务层   持久层   工具类
 *
 */
public class Student {
    private String  stuId;// xx号   xxId  xxNo   唯一代表一条数据，信息，类的对象
    private String name;
    private int sex;
    private String isPass;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIsPass() {
        return isPass;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }
}
