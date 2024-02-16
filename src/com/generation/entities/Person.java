package com.generation.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person extends Entity
{
    private String name,surname;
    private LocalDate dob;

    public Person() {}

    public Person(int id, String name, String surname, LocalDate dob) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    public int getAge()
    {
        return LocalDate.now().getYear()-getDob().getYear();
    }

    @Override
    public List<String> getErrors() 
    {
        List<String> liste = new ArrayList<String>();

        if(getName() == null || getName().isBlank())
            liste.add("ERRORE: Name nullo o vuoto");

        if(getSurname() == null || getSurname().isBlank())
            liste.add("ERRORE: Surname minore di 0");

        if(getDob().isAfter(LocalDate.now()))
            liste.add("ERRORE: Date nel futuro");

        return liste;
    }

    public boolean isValid()
    {
        return  super.isValid() && getErrors().size()==0;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", dob=" + dob + "]";
    }

    
    
}
