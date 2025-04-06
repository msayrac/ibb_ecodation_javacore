package com.msayrac._4_week.dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface IdaoGenerics<T> {
    //CRUD
    public T create(T t);

    public ArrayList<T> list();

    public void findByName(String name);

    public T update(int id, T t);

    public T delete(int id);


    default Connection getInterfaceConnection() {
        return null;
    }


}
