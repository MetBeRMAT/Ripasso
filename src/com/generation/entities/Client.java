package com.generation.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Client extends Person
{
    private final static Set<String> FORSTATUS = Set.of("Open", "Closed won", "Closed lost");
    private int revenue;
    private String status;
    private LocalDate openedOn;
    
    public Client(){}
    
    public Client(int id, String name, String surname, LocalDate dob, int revenue, String status, LocalDate openedOn) {
        super(id, name, surname, dob);
        this.revenue = revenue;
        this.status = status;
        this.openedOn = openedOn;
    }
    
    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public static Set<String> getForstatus() {
        return FORSTATUS;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOpenedOn() {
        return openedOn;
    }

    public void setOpenedOn(LocalDate openedOn) {
        this.openedOn = openedOn;
    }

    @Override
    public List<String> getErrors() 
    {
        List<String> liste = new ArrayList<String>();

        if(getRevenue()<0)
            liste.add("ERRORE: Revenue minore di 0");

        if(!FORSTATUS.contains(status))
            liste.add("ERRORE: deve essere 'Open' o 'Closed won' oppure 'Closed lost'");

        if(getOpenedOn().isAfter(LocalDate.now()))
            liste.add("ERRORE: Data nel futuro");

        return liste;
    }

    public boolean isValid()
    {
        return  super.isValid() && getErrors().size()==0;
    }

    @Override
    public String toString() {
        return "Client [revenue=" + revenue + ", status=" + status + ", openedOn=" + openedOn + "]";
    }

    public int getMonthRevenue()
    {
        Period period = Period.between(LocalDate.now(), getOpenedOn());
        return (int) (getRevenue()/period.toTotalMonths());
    }

}
