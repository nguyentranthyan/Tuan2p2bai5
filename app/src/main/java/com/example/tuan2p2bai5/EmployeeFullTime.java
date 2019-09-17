package com.example.tuan2p2bai5;

public class EmployeeFullTime extends Employee {
    @Override
    public double Tinhluong() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString()+"--> full time="+Tinhluong();
    }
}
