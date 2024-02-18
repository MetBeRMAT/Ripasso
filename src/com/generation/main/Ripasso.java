package com.generation.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.RowFilter.Entry;

import com.generation.entities.Client;
import com.generation.entities.Employee;
import com.generation.entities.Entity;
import com.generation.entities.Pc;
import com.generation.entities.Person;
import com.generation.repository.BusinessLogic;

public class Ripasso implements BusinessLogic
{
    
    public static void main(String[] args) 
    {
        List<Pc> computers = new ArrayList<Pc>();
        List<Person> people = new ArrayList<Person>();
        List<Client> clients = new ArrayList<Client>();
        List<Employee> employees =  new ArrayList<Employee>();

        computers.add(new Pc(1, "Intel Core i7", 512, "SSD", 16, "Model A", 1200, 2, false, LocalDate.now()));
        computers.add(new Pc(2, "AMD Ryzen 9", 1024, "HDD", 32, "Model B", 1500, 3, true, LocalDate.of(2023, 5, 15)));
        computers.add(new Pc(3, "Intel Core i5", 256, "SSD", 8, "Model C", 800, 1, false, LocalDate.of(2022, 10, 20)));
        computers.add(new Pc(4, "AMD Ryzen 7", 512, "SSD", 16, "Model D", 1100, 2, true, LocalDate.of(2022, 8, 10)));
        computers.add(new Pc(5, "Intel Core i9", 1024, "SSD", 64, "Model E", 2000, 3, false, LocalDate.of(2023, 2, 28)));
        computers.add(new Pc(6, "AMD Ryzen 5", 512, "HDD", 16, "Model F", 490, 2, true, LocalDate.of(2022, 6, 25)));
        computers.add(new Pc(7, "Intel Core i3", 256, "SSD", 8, "Model G", 700, 1, false, LocalDate.of(2022, 4, 12)));
        computers.add(new Pc(8, "AMD Ryzen 3", 512, "SSD", 6, "Model H", 750, 1, true, LocalDate.of(2022, 9, 5)));
        computers.add(new Pc(9, "Intel Core i7", 512, "SSD", 32, "Model I", 1400, 2, false, LocalDate.of(2022, 12, 30)));
        computers.add(new Pc(10, "AMD Ryzen 5", 1024, "SSD", 16, "Model J", 1200, 2, true, LocalDate.of(2023, 3, 10)));

        people.add(new Person(1, "John", "Doe", LocalDate.of(1990, 5, 15)));
        people.add(new Person(2, "Alice", "Smith", LocalDate.of(1985, 8, 20)));
        people.add(new Person(3, "Michael", "Johnson", LocalDate.of(1978, 3, 10)));
        people.add(new Person(4, "Emily", "Brown", LocalDate.of(1995, 10, 5)));
        people.add(new Person(5, "Christopher", "Davis", LocalDate.of(1982, 12, 25)));
        people.add(new Person(6, "Jessica", "Martinez", LocalDate.of(1973, 6, 30)));
        people.add(new Person(7, "Daniel", "Garcia", LocalDate.of(1992, 9, 12)));
        people.add(new Person(8, "Sophia", "Wilson", LocalDate.of(1987, 7, 18)));
        people.add(new Person(9, "Matthew", "Taylor", LocalDate.of(1985, 4, 8)));
        people.add(new Person(10, "Emma", "Anderson", LocalDate.of(1998, 2, 28)));

        clients.add(new Client(1, "John", "Doe", LocalDate.of(1980, 5, 15), 5000, "Open", LocalDate.of(2022, 1, 10)));
        clients.add(new Client(2, "Alice", "Smith", LocalDate.of(1975, 8, 20), 8000, "Closed won", LocalDate.of(2021, 11, 5)));
        clients.add(new Client(3, "Michael", "Johnson", LocalDate.of(1990, 3, 10), 3000, "Closed lost", LocalDate.of(2023, 3, 20)));
        clients.add(new Client(4, "Emily", "Brown", LocalDate.of(1985, 10, 5), 6000, "Open", LocalDate.of(2022, 5, 15)));
        clients.add(new Client(5, "Christopher", "Davis", LocalDate.of(1972, 12, 25), 7000, "Closed won", LocalDate.of(2022, 8, 30)));
        clients.add(new Client(6, "Jessica", "Martinez", LocalDate.of(1988, 6, 30), 4000, "Open", LocalDate.of(2023, 2, 12)));
        clients.add(new Client(7, "Daniel", "Garcia", LocalDate.of(1995, 9, 12), 5500, "Closed won", LocalDate.of(2021, 10, 28)));
        clients.add(new Client(8, "Sophia", "Wilson", LocalDate.of(1983, 7, 18), 6500, "Open", LocalDate.of(2022, 6, 10)));
        clients.add(new Client(9, "Matthew", "Taylor", LocalDate.of(1977, 4, 8), 7500, "Closed lost", LocalDate.of(2023, 1, 5)));
        clients.add(new Client(10, "Emma", "Anderson", LocalDate.of(1992, 2, 28), 4800, "Open", LocalDate.of(2022, 9, 20)));

        employees.add(new Employee(1, "John", "Doe", LocalDate.of(1985, 5, 15), "Software Developer", 60000, LocalDate.of(2020, 1, 10), "Bachelor's", 12));
        employees.add(new Employee(2, "Alice", "Smith", LocalDate.of(1990, 8, 20), "Data Analyst", 55000, LocalDate.of(2019, 11, 5), "Master's", 13));
        employees.add(new Employee(3, "Michael", "Johnson", LocalDate.of(1982, 3, 10), "HR Manager", 70000, LocalDate.of(2021, 3, 20), "Bachelor's", 14));
        employees.add(new Employee(4, "Emily", "Brown", LocalDate.of(1995, 10, 5), "Sales Representative", 48000, LocalDate.of(2020, 5, 15), "Bachelor's", 12));
        employees.add(new Employee(5, "Christopher", "Davis", LocalDate.of(1988, 12, 25), "Financial Analyst", 30000, LocalDate.of(2018, 8, 30), "Master's", 13));
        employees.add(new Employee(6, "Jessica", "Martinez", LocalDate.of(1992, 6, 30), "Marketing Specialist", 55000, LocalDate.of(2021, 2, 12), "Bachelor's", 14));
        employees.add(new Employee(7, "Daniel", "Garcia", LocalDate.of(1980, 9, 12), "Project Manager", 80000, LocalDate.of(2017, 10, 28), "Master's", 13));
        employees.add(new Employee(8, "Sophia", "Wilson", LocalDate.of(1987, 7, 18), "Financial Analyst", 70000, LocalDate.of(2019, 6, 10), "Bachelor's", 14));
        employees.add(new Employee(9, "Matthew", "Taylor", LocalDate.of(1983, 4, 8), "Quality Assurance Tester", 60000, LocalDate.of(2020, 1, 5), "Bachelor's", 13));
        employees.add(new Employee(10, "Emma", "Anderson", LocalDate.of(1998, 2, 28), "Customer Support Representative", 45000, LocalDate.of(2020, 9, 20), "Bachelor's", 12));

        System.out.println(getDeltaByEducation(employees));
    }

    public static List<Entity> getAllValids(List<Pc> computers,List<Person> people,List<Client> clients,List<Employee> employees) 
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

    public static List<Entity> getAllInvalids(List<Pc> computers,List<Person> people,List<Client> clients,List<Employee> employees) 
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

    
    public static List<Person> getPeopleOlderThan(List<Person> people,int minAge) 
    {
        List<Person> res = new ArrayList<Person>();

        for(Person p : people)
            if(p.getAge()>minAge)
                res.add(p);

        return res;
    }

    
    public static List<Person> getPeopleWithNameLongerThan(List<Person> people,int minLenght) 
    {
        List<Person> res = new ArrayList<Person>();

        for(Person p : people)
            if(p.getName().length()>minLenght)
                res.add(p);

        return res;
    }

    
    public static Person getPersonByNameAndSurname(List<Person> people,String name, String surname) 
    {
        for(Person p : people)
            if(p.getName().equals(name) && p.getSurname().equals(surname))
                return p;
        
        return null;
    }

    
    public static Map<Integer, List<Person>> getPersonDividedByYearOfBirth(List<Person> people) 
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

    
    public static List<Pc> getPcsInUse(List<Pc> computers) 
    {
        List<Pc> res = new ArrayList<Pc>();

        for(Pc p : computers)
            if(p.isInUse())
                res.add(p);

        return res;
    }

    
    public static List<Pc> getGreatValuePcs(List<Pc> computers) 
    {
        List<Pc> res = new ArrayList<Pc>();
        int price = 500;
        int ram = 16;

        for(int i=0;i<computers.size();i++)
            if(computers.get(i).getPrice()<=price && computers.get(i).getRam()>=ram)
                res.add(computers.get(i));

        return res;           
    }

    
    public static List<Pc> getPcWithExpiredWarranty(List<Pc> computers) 
    {
        List<Pc> res = new ArrayList<Pc>();

        for(Pc p : computers)
            if(p.getWarrantlyEndDate().isBefore(LocalDate.now()))
                res.add(p);

        return res;
    }

    
    public static List<Client> getLastYearClients(List<Client> clients) 
    {
        List<Client> res = new ArrayList<>();

        for(Client c : clients)
            if(c.getOpenedOn().isBefore(LocalDate.now().minusYears(1)))
                res.add(c);

        return res;
    }

    
    public static Map<String, List<Client>> getClientsByStatus(List<Client> clients) 
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

    //chiave Status,valore revenue totale dei clienti con quello status
    
    public static Map<String, Integer> getRevenueByStatus(List<Client> clients) 
    {
        Map<String, Integer> res = new HashMap<>();

        for(Client c : clients)
        {
            String status = c.getStatus();
            int revenue = c.getRevenue();

            if(res.containsKey(status))
                revenue += res.get(status);

            res.put(status, revenue);
        }

        return res;
    }

    //chiave role, valore stipendio medio degli impiegati con quel ruolo
    
    public static Map<String, Integer> getAverageSalaryByRole(List<Employee> employees) 
    {
        Map<String, Integer> roleSalarySum = new HashMap<>();
        Map<String, Integer> roleEmployeeCount = new HashMap<>();
        Map<String, Integer> averageSalaryByRole = new HashMap<>();

        for(Employee e : employees)
        {
            String role = e.getJob();
            int salary = e.getMonthSalary();

            if(roleSalarySum.containsKey(role))
                roleSalarySum.put(role,roleSalarySum.get(role)+salary);
            else
                roleSalarySum.put(role, salary);

            if(roleEmployeeCount.containsKey(role))
                roleEmployeeCount.put(role, roleEmployeeCount.get(role)+1);
            else
                roleEmployeeCount.put(role,1);
        }

        for(String role : roleEmployeeCount.keySet())
        {
            int totalSalary = roleSalarySum.get(role);
            int totalEmployee = roleEmployeeCount.get(role);
            int averageSalary = totalSalary/totalEmployee;

            averageSalaryByRole.put(role,averageSalary);
        }

        return averageSalaryByRole;
    }

    
    //stipendio medio di tutti gli impiegati
    //chiave: livello di studio -- valore: stipMed con livello "Master"- stipMed senza livello "Master"
    //voglio come chiavi tutti i livelli di studio, e voglio come valore la differenza tra lo stipendio medio
    //di chi ha quel livello rispetto a chi non lo ha
    public static Map<String, Integer> getDeltaByEducation(List<Employee> employees) 
    {
        Map<String, Integer> averageSalaryByEducation = new HashMap<>();
        Map<String, Integer> countByEducation = new HashMap<>();
        Map<String, Integer> deltaByEducation = new HashMap<>();

        int somma = 0;

        for(Employee e : employees)
            somma += e.getMonthSalary();

        int stipendioMedioTotale = somma/employees.size();
        //Adesso prendo lo stipendio medio totale tramite i livelli
        for(Employee e : employees)
        {
            String education = e.getEducation();
            int salary = e.getMonthSalary();
            if(averageSalaryByEducation.containsKey(education))
                averageSalaryByEducation.put(education, averageSalaryByEducation.get(education)+salary);
            else
                averageSalaryByEducation.put(education,salary);
            
            if(countByEducation.containsKey(education))
                countByEducation.put(education, countByEducation.get(education)+1);
            else
                countByEducation.put(education, 1);
        }

        for(java.util.Map.Entry<String, Integer> coppia : averageSalaryByEducation.entrySet())
        {
            String education = coppia.getKey();
            int salary = coppia.getValue();
            int count = countByEducation.get(education);
            int stipendioMedio = salary/count;
            int delta = stipendioMedio - stipendioMedioTotale;
            deltaByEducation.put(education, delta);
        }
        return deltaByEducation;
    }

}
