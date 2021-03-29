package cn.itcast.eshop.client;

import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;
import cn.itcast.eshop.user.action.UserAction;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
*  用户操作界面,用户相关操作
* */
public class UserClient extends Client{
   /**
    * 用户登录操作页面
    * 1.输入用户名，密码
    * 2.向服务端发送请求，并接收返回消息字符串
    * 使用setter方法将数据传递给Action
    * 3.解析消息，提示用户西悉尼
    *  调用登录功能功能
    *  4.页面跳转**/
    public String showLogin(){
// 第一步
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username =sc.nextLine();
        System.out.println("请输入密码：");
        String password =sc.nextLine();
    //第二步
        UserAction userAction=new UserAction();
        userAction.setUsername(username);
        userAction.setPassword(password);

        String result =userAction.login();
        //第三

        Msg msg= JSONUtil.JSON2Entity(result, Msg.class);
        if(msg.getType().equals(Msg.SUCCESS)){
            System.out.println(msg);
            return HISTORY;
        }else {
            System.out.println(msg);
            return LOGIN;
        }
    }
}
