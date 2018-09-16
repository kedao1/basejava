package cn.dl.jcdz.annotation;
@AnnoTest("张三")
public class Person extends Object{
    String id;
    String sex;
    @AnnoTest("28")
    int age;
    @AnnoTest("只能获取张三ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("talk");
    }

    @Deprecated
    public void say(){
        System.out.println("talk");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
