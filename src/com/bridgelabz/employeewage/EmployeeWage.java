package com.bridgelabz.employeewage;

class CalculateEmployeeWage{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int TOTAL_WORK_DAY = 20;
    static final int TOTAL_WORK_HOUR = 100;

    static int dayCount = 1;
    static int hourCount = 0;
    static int totalWage = 0;
    static int dayPresent = 0;

    public static void totalWage(){

        while (dayCount<=TOTAL_WORK_DAY && hourCount<=TOTAL_WORK_HOUR) {

            int dailyWage = 0;
            int attendance = (int) (Math.random() * 10) % 3;

            switch (attendance) {
                case 1:
                    System.out.println("Employee is present Full Time");
                    hourCount = hourCount + FULL_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    dayPresent++;
                    break;
                case 2:
                    System.out.println("Employee is present Part Time");
                    hourCount = hourCount + PART_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                    dayPresent++;
                    break;
                default:
                    System.out.println("Employee is absent");
            }

            System.out.println("Daily Wage on Day :" + dayCount + " is :" +dailyWage);
            totalWage = totalWage + dailyWage;
            dayCount++;
        }
        System.out.println("In one month of "+(dayCount-1)+" working days, employee worked for :\n"
                +dayPresent+ " days and \n"
                + hourCount + " hours and \n"+
                "earned total wages of "+ totalWage);

    }
}


public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");


        CalculateEmployeeWage.totalWage();

    }
}
