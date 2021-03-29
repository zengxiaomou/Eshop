package cn.itcast.eshop.user.entity;

public class User extends Person {
    //用户
    private String username;
    //密码
    private String password;

    private String role="NORMAL";


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
