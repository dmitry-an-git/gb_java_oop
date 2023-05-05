package models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;

    private Date date;
    private String name;
    private int table;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Reservation(Date date, String name, int table) {
        this.date = date;
        this.name = name;
        this.table = table; // this is my addition 
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTable() {
        return table;
    }
}
