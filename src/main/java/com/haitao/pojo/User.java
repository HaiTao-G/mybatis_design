package com.haitao.pojo;

/**
 * @version 1.0.0
 * @ClassName User
 * @Description TODO
 * @Author Tao
 * @Date 2020/2/20 16:18
 */
public class User {

    private Integer id;

    private String userName;

    private Integer sex;

    private Integer addRess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAddRess() {
        return addRess;
    }

    public void setAddRess(Integer addRess) {
        this.addRess = addRess;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", addRess=" + addRess +
                '}';
    }
}
