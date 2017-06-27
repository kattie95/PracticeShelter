package model;

import java.util.Date;

/**
 * @author kattie95
 */
public class Animal //tabela: "animals"
{
    private int id;
    private String name;
    private String type;
    private String sex;
    private int age;
    private Date arrival;
    //TODO: add relation:
    //private Employee patron; @ManyToOne

    public Animal() {
    }

    public Animal(String type, String sex, Date arrival) {
        this.type = type;
        this.sex = sex;
        this.arrival = arrival;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }
}
