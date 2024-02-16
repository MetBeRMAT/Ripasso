package com.generation.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.generation.entities.Client;
import com.generation.entities.Employee;
import com.generation.entities.Entity;
import com.generation.entities.Pc;
import com.generation.entities.Person;
import com.generation.repository.BusinessLogic;

public class Ripasso implements BusinessLogic
{
    List<Pc> computers = new ArrayList<Pc>();
    List<Person> people = new ArrayList<Person>();
    List<Client> clients = new ArrayList<Client>();
    List<Employee> employees =  new ArrayList<Employee>();

    @Override
    public List<Entity> getAllValids() 
    {
        List<Entity> res = new ArrayList<Entity>();

        for(Pc p : computers)
            if(p.isValid())
                res.add(p);
        
        for(Person per : people)
            if(per.isValid())
                res.add(per);

        for(Client c : clients)
            if(c.isValid())
                res.add(c);
    
        for(Employee e : employees)
            if(e.isValid())
                res.add(e);

        return res;
    }

    @Override
    public List<Entity> getAllInvalids() 
    {
        List<Entity> res = new ArrayList<Entity>();

        for(Pc p : computers)
            if(!p.isValid())
                res.add(p);
        
        for(Person per : people)
            if(!per.isValid())
                res.add(per);

        for(Client c : clients)
            if(!c.isValid())
                res.add(c);
    
        for(Employee e : employees)
            if(!e.isValid())
                res.add(e);

        return res;
    }

    @Override
    public List<Person> getPeopleOlderThan(int minAge) 
    {
        List<Person> res = new ArrayList<Person>();

        for(Person p : people)
            if(p.getAge()>minAge)
                res.add(p);

        return res;
    }

    @Override
    public List<Person> getPeopleWithNameLongerThan(int minLenght) 
    {
        List<Person> res = new ArrayList<Person>();

        for(Person p : people)
            if(p.getName().length()>minLenght)
                res.add(p);

        return res;
    }

    @Override
    public Person getPersonByNameAndSurname(String name, String surname) 
    {
        for(Person p : people)
            if(p.getName().equals(name) && p.getSurname().equals(surname))
                return p;
        
        return null;
    }

    @Override
    public Map<Integer, List<Person>> getPersonDividedByYearOfBirth() 
    {
        Map<Integer, List<Person>> res = new HashMap<Integer, List<Person>>();

        for(Person p : people)
        {
            if(res.containsKey(p.getDob().getYear()))
                res.get(p.getDob().getYear()).add(p);
            else
            {
                List<Person> temp = new ArrayList<>();
                temp.add(p);
                res.put(p.getDob().getYear(), temp);
            }
        }
            
        return res;
    }

    @Override
    public List<Pc> getPcsInUse() 
    {
        List<Pc> res = new ArrayList<Pc>();

        for(Pc p : computers)
            if(p.isInUse())
                res.add(p);

        return res;
    }

    @Override
    public List<Pc> getGreatValuePcs() 
    {
        List<Pc> res = new ArrayList<Pc>();
        int price = computers.get(0).getPrice();

        for(int i=1;i<computers.size();i++)
            if(computers.get(i).getPrice()<price)
            {
                price=computers.get(i).getPrice();
                res.add(computers.get(i));
            }
            else
                if(computers.get(i).getPrice()==price)
                    res.add(computers.get(i));

        return res;           
    }

    @Override
    public List<Pc> getPcWithExpiredWarranty() 
    {
        List<Pc> res = new ArrayList<Pc>();

        for(Pc p : computers)
            if(p.getDateOfPurchase().plusMonths(p.getWarrantly()).isAfter(LocalDate.now()))
                res.add(p);

        return res;
    }

    @Override
    public List<Client> getLastYearClients() 
    {
        List<Client> res = new ArrayList<>();

        for(Client c : clients)
            if(c.getOpenedOn()==LocalDate.now())
    }

    @Override
    public Map<String, List<Client>> getClientsByStatus() 
    {
        Map<String, List<Client>> res = new HashMap<>();
        
        for(Client c : clients)
        {
            if(res.containsKey(c.getStatus()))
                res.get(c.getStatus()).add(c);
            else
            {
                List<Client> temp = new ArrayList<>();
                temp.add(c);
                res.put(c.getStatus(), temp);
            }
        }

        return res;
    }

    @Override
    public Map<String, Integer> getRevenueByStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRevenueByStatus'");
    }

    @Override
    public Map<String, Integer> getAverageSalaryByRole() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAverageSalaryByRole'");
    }

    @Override
    public Map<String, Integer> getDeltaByEducation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeltaByEducation'");
    }

}
