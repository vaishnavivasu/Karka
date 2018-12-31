package com.example.user.sample;

import java.util.ArrayList;

public class StudentDetails {

    String nme;
    String DOB;
    int mark=0;
    int current=0;
    int new_old=0;
    String e_mail;
    String city;
    String school;

    public String getCity() {
        return city;
    }

    public String getSchool() {
        return school;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    ArrayList<Integer> marks1 = new ArrayList<Integer>();
    ArrayList<Integer> marks2 = new ArrayList<Integer>();
    ArrayList<Integer> marks3 = new ArrayList<Integer>();

    public String getNme() {
        return nme;
    }

    public String getDOB() {
        return DOB;
    }

    public int getMark() {
        return mark;
    }

    public int getCurrent() {
        return current;
    }

    public int getNew_old() {
        return new_old;
    }

    public String getE_mail() {
        return e_mail;
    }

    public ArrayList<Integer> getMarks1() {
        return marks1;
    }

    public ArrayList<Integer> getMarks2() {
        return marks2;
    }

    public ArrayList<Integer> getMarks3() {
        return marks3;
    }

    public void setNme(String nme) {
        this.nme = nme;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setNew_old(int new_old) {
        this.new_old = new_old;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setMarks1(ArrayList<Integer> marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(ArrayList<Integer> marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(ArrayList<Integer> marks3) {
        this.marks3 = marks3;
    }
}
