package com.masai.a1063aug_fragmentscommunicationandbackstack_we1;

import java.io.Serializable;

public class Model implements Serializable {
    String name;
    String grade;
    String percentage;
    int age;

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getPercentage() {
        return percentage;
    }

    public int getAge() {
        return age;
    }

    public Model(String name, String grade, String percentage, int age) {
        this.name = name;
        this.grade = grade;
        this.percentage = percentage;
        this.age = age;
    }
}
