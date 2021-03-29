package cn.itcast.eshop.client;

public class Client {
    /**登录的全局操作*/
    public static final String LOGIN="L";
    /** 上一次操作*/
    public static final String HISTORY="I";
    /**首页操作*/
    public static final String INDEX="I";

    public static void main(String[] args) {
        Client c=new Client();
        c.start();
    }

    public void start(){
        UserClient userClient=new UserClient();
        String result=userClient.showLogin();
        if (result.equals(INDEX)){
            System.out.println("这里是首页");
        }else if (result.equals(LOGIN)){
            System.out.println("登录页面");
        }else if (result.equals(HISTORY)){
            System.out.println("这里是历史页面");
        }else{
            System.out.println("出错了");
        }
    }
}
