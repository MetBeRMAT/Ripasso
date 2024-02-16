package com.generation.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Person
{
    private String job;
    private int ral;
    private LocalDate hiredOn;
    private String education;
    private int months;

    public Employee() {}

    public Employee(int id, String name, String surname, LocalDate dob, String job, int ral, LocalDate hiredOn,
            String education, int months) {
        super(id, name, surname, dob);
        this.job = job;
        this.ral = ral;
        this.hiredOn = hiredOn;
        this.education = education;
        this.months = months;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getRal() {
        return ral;
    }

    public void setRal(int ral) {
        this.ral = ral;
    }

    public LocalDate getHiredOn() {
        return hiredOn;
    }

    public void setHiredOn(LocalDate hiredOn) {
        this.hiredOn = hiredOn;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public List<String> getErrors() 
    {
        List<String> liste = new ArrayList<String>();

        if(getJob() == null || getJob().isBlank())
            liste.add("ERRORE: Job nullo o vuoto");

        if(getRal()<0)
            liste.add("ERRORE: Ral minore di 0");

        if(getHiredOn().isAfter(LocalDate.now()))
            liste.add("ERRORE: Date nel futuro");

        if(getEducation() == null || getEducation().isBlank())
            liste.add("ERRORE: Education nullo o vuoto");

        if(getMonths()<=12 && getMonths()>=14)
            liste.add("ERRORE: Month deve essere compreso tra 12 e 14");

        return liste;
    }

    public int getMonthSalary()
    {
        return getRal()/getMonths();
    }

    public boolean isValid()
    {
        return  super.isValid() && getErrors().size()==0;
    }

    @Override
    public String toString() {
        return "Employee [job=" + job + ", ral=" + ral + ", hiredOn=" + hiredOn + ", education=" + education
                + ", months=" + months + "]";
    }
}
