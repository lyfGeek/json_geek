package com.geek.bean;

import lombok.Data;

import java.util.Set;

@Data
public class Diaosi {

    //    @SerializedName("NAME")// 转换为 json 后为 NAME。
    private String name;
    private String school;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    //    private String[] major;
//    private List<String> major;
    private Set<String> major;
    private String birthday;
    private String comment;

    // transient 关键字。
    private transient String ignore;
}
