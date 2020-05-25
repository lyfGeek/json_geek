package com.geek;

import com.geek.bean.Diaosi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonRead {

    public static void main(String[] args) throws IOException {

        File file = new File(GsonRead.class.getResource("/wangxiaoer.json").getFile());
        String content = FileUtils.readFileToString(file);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        Diaosi diaosi = gson.fromJson(content, Diaosi.class);
        System.out.println(diaosi.getMajor());// [理发, 挖掘机]
        System.out.println(diaosi.getMajor().getClass());// class java.util.ArrayList

//        File file = new File(GsonRead.class.getResource("/wangxiaoer.json").getFile());
//        String content = FileUtils.readFileToString(file);
//
//        Gson gson = new Gson();
//        Diaosi diaosi = gson.fromJson(content, Diaosi.class);
//        System.out.println("diaosi = " + diaosi);
    }
}
