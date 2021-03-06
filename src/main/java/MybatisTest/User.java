package MybatisTest;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String username;
    private String passwd;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }



    @Override
    public String toString(){
        return "MybatisTest.User:{" +
                "id = " + id + " " +
                "username = " + username + " " +
                "passwd = " + passwd + " " +
                "}";
    }


    public static void main(String[] args){
        User user = new User();
        user.setId(1);
        user.setUsername("wp");
        user.setPasswd("123");
        System.out.println(user.toString());
    }


}
