package cn.itcast.eshop.common.util;
/**/

import cn.itcast.eshop.common.entity.Entity;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class JSONUtil {

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

  public static <T> T JSON2Entity(String json,Class<T> clazz){

      return JSON.parseObject(json,clazz);
  }
    public static <T> List<T> JSON2ArrayList(String json,Class<T> clazz){

        return JSON.parseArray(json,clazz) ;
    }




}
