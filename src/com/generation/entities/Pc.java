package com.generation.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pc extends Entity
{
    private String processor;
    private int mmasize;
    private String mmatype;
    private int ram;
    private String model;
    private int price;
    private int warrantly;
    private boolean inUse;
    private LocalDate dateOfPurchase;

    private Pc(){};

    private Pc(Integer id,String processor, int mmasize, String mmatype, int ram, String model, int price, int warrantly,
            boolean inUse, LocalDate dateOfPurchase) 
    {
        super(id);
        this.processor = processor;
        this.mmasize = mmasize;
        this.mmatype = mmatype;
        this.ram = ram;
        this.model = model;
        this.price = price;
        this.warrantly = warrantly;
        this.inUse = inUse;
        this.dateOfPurchase = dateOfPurchase;
    }



    public String getProcessor() {
        return processor;
    }



    public void setProcessor(String processor) {
        this.processor = processor;
    }



    public int getMmasize() {
        return mmasize;
    }



    public void setMmasize(int mmasize) {
        this.mmasize = mmasize;
    }



    public String getMmatype() {
        return mmatype;
    }



    public void setMmatype(String mmatype) {
        this.mmatype = mmatype;
    }



    public int getRam() {
        return ram;
    }



    public void setRam(int ram) {
        this.ram = ram;
    }



    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    public int getWarrantly() {
        return warrantly;
    }



    public void setWarrantly(int warrantly) {
        this.warrantly = warrantly;
    }



    public boolean isInUse() {
        return inUse;
    }



    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }



    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }



    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }



    @Override
    public List<String> getErrors()
    {
        List<String> liste = new ArrayList<String>();

        if(getProcessor() == null || getProcessor().isBlank())
            liste.add("ERRORE: Processore nullo o vuoto");

        if(getMmasize()<0)
            liste.add("ERRORE: Mmasize minore di 0");

        if(getMmatype()==null || getMmatype().isBlank())
            liste.add("ERRORE: Mmatype nullo o vuoto");

        if(getRam()<=8 || getRam() >= 64)
            liste.add("ERRORE: Ram minore di 8 o maggiore di 64");

        if(getModel()==null || getModel().isBlank())
            liste.add("ERRORE: Model nullo o vuoto");

        if(getPrice()<0)
            liste.add("ERRORE: Price minore di 0 ");

        if(getWarrantly()<0 || getWarrantly()>10)
            liste.add("ERRORE: Warrantly minore di 0 o maggiore di 10");

        if(getDateOfPurchase().isAfter(LocalDate.now()))
            liste.add("ERRORE: Date nel futuro");

        return liste;
    }

    public boolean isValid()
    {
        return  super.isValid() && getErrors().size()==0;
    }

    @Override
    public String toString() {
        return "Pc [processor=" + processor + ", mmasize=" + mmasize + ", mmatype=" + mmatype + ", ram=" + ram
                + ", model=" + model + ", price=" + price + ", warrantly=" + warrantly + ", inUse=" + inUse
                + ", dateOfPurchase=" + dateOfPurchase + "]";
    }

}
