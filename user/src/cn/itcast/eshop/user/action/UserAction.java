package cn.itcast.eshop.user.action;

import cn.itcast.eshop.common.action.BaseAction;
import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;
import cn.itcast.eshop.user.entity.User;
import cn.itcast.eshop.user.service.UserService;
import cn.itcast.eshop.user.service.impl.UserServiceImpl;

/*
 * 用户控制器类
 * 处理用户后台操作，返回json
 *
 * */
public class UserAction extends BaseAction {
    //用户名
    private String username;
    //密码
    private String password;

    /**
     * 用户登录功能
     *
     * @return
     */
    public String login() {
        //System.out.println("username:"+username);
        //System.out.println("password:"+password);

        Msg msg = new Msg();
        try {

            // 封装数据
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            //调用

            UserService userService = new UserServiceImpl();
            userService.login(user);

            if (user != null) {
                msg.setType(Msg.SUCCESS);
            } else {
                msg.setType(Msg.FAIL);
                msg.setMsg("用户名或密码不正确");
            }

            return JSONUtil.entity2Json(msg);
        } catch (Exception e) {
            e.printStackTrace();


            msg.setType(Msg.FAIL);
            return JSONUtil.entity2Json(msg);
        }

    }

    /**
     * 1.封装数据，
     * 2.调用Userservice
     * 3.异常处理
     * 4.根据服务返回数据
     * 5.记录日志
     * 6.响应消息
     */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
