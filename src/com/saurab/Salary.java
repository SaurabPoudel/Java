package com.saurab;

public class Salary {
    public static void main(String[] args) {
        int salary = 45000;
        if(salary > 25000){
            salary = salary + 10000;
        }else{
            salary = salary;
        }
        System.out.println(salary);
    }
}
