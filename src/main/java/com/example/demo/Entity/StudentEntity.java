package com.example.demo.Entity;
import jakarta.persistence.*;
@Entity
@Table(name="Student")
public class StudentEntity
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private int Age;
    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id=Id;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        this.Age=Age;
    }
    public StudentEntity(int Id,String Name,int Age)
    {
        this.Name=Name;
        this.Age=Age;
    }
    public StudentEntity()
    {

    }
}