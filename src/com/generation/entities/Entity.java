package com.generation.entities;

import java.util.List;

public abstract class Entity 
{
    private Integer id;

    public Entity(){};

    public Entity(int id) {
        this.id = id;
    }

    public abstract List<String> getErrors();

    public boolean isValid()
    {
        return  getErrors().size()==0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
