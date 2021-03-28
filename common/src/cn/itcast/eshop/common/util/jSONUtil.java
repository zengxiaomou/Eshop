package cn.itcast.eshop.common.util;
/**/

import cn.itcast.eshop.common.entity.Entity;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class jSONUtil {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId("10");
        entity.setCreateTime("18:06");
        String json=entity2Json(entity);
        System.out.println(json);
        System.out.println("=------");
        System.out.println(json );
        List<Entity> entityList =new ArrayList<>();
        entityList.add(entity);
        String jsonlist=entityList2Json(entityList);
        System.out.println(jsonlist);
    }

    /*
    * 将对象转换成JSON
    * */
  public static String entity2Json(Object entity){
      return JSON.toJSONString(entity);
  }
  public static String entityList2Json(List<?> entityList){
      return entityList2Json(entityList);
  }

/*
* json转换成对象
* clazz指定类型
* 返回object对象
* */

  public static Object JSON2Entity(String json,Class<?> clazz){
      Object obj= JSON.parseObject(json,clazz);
      return obj;
  }
    public static List<?> JSON2ArrayList(String json,Class<?> clazz){

        return JSON.parseArray(json,clazz) ;
    }




}
