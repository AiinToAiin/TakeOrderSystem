package com.Order.test;

public class User extends Person{
    //客户类(客户名，性别，账号，密码，送餐地址，手机号，创建时间)
    private String UserName;

    public User(String username, String userpassword, String userName, String userPassWord) {
        super(username, userpassword);
        UserName = userName;
        UserPassWord = userPassWord;
    }

    private String UserSex;
    private String UserId;
    private String UserPassWord;
    private String UserAdd;
    private String UserPhoneNumber;
    private String CreateTime;

    public User() {
    }

    public User(String userName, String userSex, String userId, String userPassWord, String userAdd, String userPhoneNumber, String createTime) {
        UserName = userName;
        UserSex = userSex;
        UserId = userId;
        UserPassWord = userPassWord;
        UserAdd = userAdd;
        UserPhoneNumber = userPhoneNumber;
        CreateTime = createTime;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserSex() {
        return UserSex;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserPassWord() {
        return UserPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        UserPassWord = userPassWord;
    }

    public String getUserAdd() {
        return UserAdd;
    }

    public void setUserAdd(String userAdd) {
        UserAdd = userAdd;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserSex='" + UserSex + '\'' +
                ", UserId='" + UserId + '\'' +
                ", UserPassWord='" + UserPassWord + '\'' +
                ", UserAdd='" + UserAdd + '\'' +
                ", UserPhoneNumber='" + UserPhoneNumber + '\'' +
                ", CreateTime='" + CreateTime + '\'' +
                '}';
    }
}
