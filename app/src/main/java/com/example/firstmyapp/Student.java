package com.example.firstmyapp;

// builder 패턴
public class Student {

    private String name;
    private int grade;

    //1. 빌드패턴을 만드는 방법
    private Student(){

    }

    //2. 내부 정적 클래스를 만들어준다.
    public static class MyBuilder {
        private String name;
        private int grade;

        //3. 자기 자신을 리턴하는 메서드를 만들어야 한다.
        public MyBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MyBuilder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        //4. 핵심
        public Student build(){

            Student student = new Student();
            student.name = name;
            student.grade = grade;
            return student;

        }
    }

    public static void main(String[] args) {

    }
}
