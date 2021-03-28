package cn.itcast.eshop.user.action;

import cn.itcast.eshop.common.action.BaseAction;

/*
* 用户控制器类
* 处理用户后台操作，返回json
*
* */
public class UserAction extends BaseAction {
    private String username;
    private String password;

    /**
     * 用户登录模块
     * @return
     */
    public String login(){
        return "";
    }
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
