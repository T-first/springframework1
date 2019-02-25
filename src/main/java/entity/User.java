package entity;

public class User {
    private long id;
    private  String  userName;
    private int level;
    private String nickname;
    private int sex;
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(long id, String userName, int level, String nickname, int sex, String phone) {
        this.id = id;
        this.userName = userName;
        this.level = level;
        this.nickname = nickname;
        this.sex = sex;
        this.phone = phone;
    }

    public int getLevel() {
        return level;

    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
