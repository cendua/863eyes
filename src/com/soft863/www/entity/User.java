package com.soft863.www.entity;

import java.io.Serializable;

public class User implements Serializable {
    /*
     1.数据库字段列信息拷贝到文本编辑器中  （例如notepad++  UE  Eedit等）  如果只需要字段列可以使用alt向下选中
     2.微调命名规范  可以利用文本编辑器中  ctrl+h 替换某个固定的整体例如：f_  ,调整大小写（小驼峰原则）
     3.粘贴到idea中
         一次性补全代码
             补左边：atl 拖动定位添加代码的位置  增加private String(之后微调)
             补右边：alt+选中  点击右箭头取消选中 补充;

     4.备注
        字段或者属性对齐技巧  shift+tab居左对齐    tab缩进



     */
    private Integer id;
    private String faceId;
    private String name;
    private Integer sex;
    private String tel;
    private String card;
    private Integer age;
    private Double height;
    private Double weight;
    private String bloodType;
    private String occupation;
    private String education;
    private String address;
    private Integer isMarry;
    private String birthday;
    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(Integer isMarry) {
        this.isMarry = isMarry;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
