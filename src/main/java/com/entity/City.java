package com.entity;

/**
 * @author Lurenc
 * @create 2021-07-12 11:00
 */
public class City {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
