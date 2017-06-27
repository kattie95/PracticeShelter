package model;

import java.util.Date;

/**
 * @author kattie95
 */
public class Employee   //tabela: "employees
{
    private int id;
    private String fullName;
    private int age;
    private String position;
    private Date startedOn;
    private String details;

    public Employee() {
    }

    public Employee(String fullName, String position, Date startedOn) {
        this.fullName = fullName;
        this.position = position;
        this.startedOn = startedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(Date startedOn) {
        this.startedOn = startedOn;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
