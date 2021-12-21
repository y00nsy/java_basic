package com.kh.example.practice7.model.vo;

public class Employee {

    public int empNo; //사번
    public String empName; //이름
    public String dept; //부서
    public String job; //직책
    public int age; //나이
    public char gender; //성별
    public int salary; //급여
    public double bonusPoint; //보너스
    public String phone; //전화번호
    public String address; //주소

    public Employee() {
        this(0,"이름없음", "부서없음", "직급없음", 0, 'x', 0, 0.0, "전화번호없음", "주소없음");
    }
    public Employee(int empNo, String empName) {
        this(empNo, empName, "부서없음", "직급없음", 0, 'x', 0, 0.0, "전화번호없음", "주소없음");
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    public void information() {
        System.out.printf("사번: %d, 이름: %s, 부서: %s, 직급: %s, 나이: %d, 성별: %s, 급여: %d, 보너스: %s, 번호: %s, 주소: %s\n", empNo, empName, dept, job, age, gender, salary, bonusPoint, phone, address);
    }
}
