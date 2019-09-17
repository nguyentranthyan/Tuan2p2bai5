package com.example.tuan2p2bai5;

public class EmployeePartTime extends Employee{
    @Override
    public double Tinhluong() {
        return 150;
    }
    @Override
    public String toString() {
        return super.toString()+"--> part time="+Tinhluong();
    }
}