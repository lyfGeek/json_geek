package com.geek;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) throws IOException {
//        URL resource = ReadJson.class.getResource("/");
//        System.out.println("resource = " + resource);
        File file = new File(ReadJson.class.getResource("/wangxiaoer.json").getFile());
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);

        if (!jsonObject.isNull("name")) {
            System.out.println("姓名是：" + jsonObject.getString("name"));
        }

        System.out.println("jsonObject = " + jsonObject);
        // jsonObject = {"birthday":"1990-01-01","major":["理发","挖掘机"],"school":"蓝翔","car":null,"name":"王小二","has_girlfriend":false,"comment":"这是一个注释。","house":null,"age":25.2}
        System.out.println("姓名是：" + jsonObject.getString("name"));
        // ...
        JSONArray jsonArray = jsonObject.getJSONArray("major");
        System.out.println("jsonArray = " + jsonArray);
        for (Object o : jsonArray) {
            System.out.println(o);
        }
    }

}
