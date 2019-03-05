package entity;

public class Pets {
     private String name;
     private int sex;
     private String Type;

    public String getName() {
        return name;
    }
    public Pets(){
        System.out.println("the pet's constructor");
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSexl(int sex) {
        this.sex = sex;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


}
