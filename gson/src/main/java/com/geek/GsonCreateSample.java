//package com.geek;
//
//import com.geek.bean.Diaosi;
//import com.google.gson.FieldNamingStrategy;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.lang.reflect.Field;
//
//public class GsonCreateSample {
//
//    public static void main(String[] args) {
//        Diaosi diaosi = new Diaosi();
//        diaosi.setName("王小二");
//        diaosi.setAge(25.2);
//        diaosi.setBirthday("1990-01-01");
//        diaosi.setSchool("蓝翔");
//        diaosi.setMajor(new String[]{"理发", "挖掘机"});
//        diaosi.setHas_girlfriend(false);
//        diaosi.setCar(null);
//        diaosi.setHouse(null);
//        diaosi.setComment("这是一个注释。");
//
//        diaosi.setIgnore("看不见我。");
//
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setPrettyPrinting();
//        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
//            @Override
//            public String translateName(Field field) {
//                if (field.getName().equals("name")) {
//                    return "NAME";
//                }
//                return field.getName();
//            }
//        });
//        Gson gson = gsonBuilder.create();
//
////        Gson gson = new Gson();
//        String s = gson.toJson(diaosi);
//        System.out.println("s = " + s);
//        // s = {"name":"王小二","school":"蓝翔","has_girlfriend":false,"age":25.2,"major":["理发","挖掘机"],"birthday":"1990-01-01","comment":"这是一个注释。"}
//    }
//}
