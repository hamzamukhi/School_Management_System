package com.example.schoolmanagementsystem;

/**
 * Created by hamza
 * This class is responsible for keeping the track of students fees,
 * name, grade & fees paid.
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student initializing.
     * Fees for every student is Rs132,000.
     * Fees paid initially is 0.
     * @param id id for th student unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */

    public Student(int id, String name, int grade){           //constructor
        this.feesPaid=0;
        this.feesTotal=132000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * payFess = 50000 + 25000
     * Keep dding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+
                " Total fees paid so far Rs "+ feesPaid;
    }

}
