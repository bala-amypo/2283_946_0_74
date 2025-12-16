package com.example.demo.Entity;
public class StudentEntity
{
    private int Id;
    private String Name;
    private int Age;
    public int getId()
    {
        return Id;
    }
    public void setId(Id)
    {
        this.Id=Id;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(Name)
    {
        this.Name=Name;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(Age)
    {
        this.Age=Age;
    }
    public StudentEntity(int Id,String Name,int Age)
    {
        this.Id=Id;
        this.Name=Name;
        this.Age=Age;
    }
    public StudentEntity()
    {
        
    }
}