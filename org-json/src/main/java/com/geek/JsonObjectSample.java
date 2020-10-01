package com.geek;

import com.geek.bean.Diaosi;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonObjectSample {

    public static void main(String[] args) {
//        jSONObject();
//        createJsonByMap();
        createJsonByBean();
    }

    private static void createJsonByBean() {
        Diaosi diaosi = new Diaosi();
        diaosi.setName("王小二");
        diaosi.setAge(25.2);
        diaosi.setBirthday("1990-01-01");
        diaosi.setSchool("蓝翔");
        diaosi.setMajor(new String[]{"理发", "挖掘机"});
        diaosi.setHas_girlfriend(false);
        diaosi.setCar(null);
        diaosi.setHouse(null);
        diaosi.setComment("这是一个注释。");
        System.out.println(new JSONObject(diaosi));
        // {"birthday":"1990-01-01","major":["理发","挖掘机"],"school":"蓝翔","name":"王小二","has_girlfriend":false,"comment":"这是一个注释。","age":25.2}
    }

    // 通过 HashMap 创建。
    private static void createJsonByMap() {
        Object nullObj = null;
        Map<String, Object> map = new HashMap<>();
        map.put("name", "王小二");
        map.put("age", 25.2);
        map.put("birthday", "1990-01-01");
        map.put("school", "蓝翔");
        map.put("major", new String[]{"理发", "挖掘机"});
        map.put("has_girlfriend", false);
        map.put("car", nullObj);
        map.put("house", nullObj);
        map.put("comment", "这是一个注释。");
        System.out.println(new JSONObject(map).toString());
    }

    private static void jSONObject() {
        Object nullObj = null;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "王小二");
        jsonObject.put("age", 25.2);
        jsonObject.put("birthday", "1990-01-01");
        jsonObject.put("school", "蓝翔");
        jsonObject.put("major", new String[]{"理发", "挖掘机"});
        jsonObject.put("has_girlfriend", false);
        jsonObject.put("car", nullObj);
        jsonObject.put("house", nullObj);
        jsonObject.put("comment", "这是一个注释。");
        System.out.println(jsonObject.toString());
        // {"birthday":"1990-01-01","major":["理发","挖掘机"],"school":"蓝翔","name":"王小二","has_girlfriend":false,"comment":"这是一个注释。","age":25.2}
    }

}
