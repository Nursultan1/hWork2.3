package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if (name.length()>20){
            throw new IllegalException("Too long name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws RuntimeException{
        if (age >20){
            throw new RuntimeException("Too many numbers");
        }
        this.age = age;
    }
    @Override
    public String toString() {
        return "User " +
                "name " + name + '\'' +
                " age=" + age ;
    }
}
