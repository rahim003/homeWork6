package com.kurbanoov.model;

public class Country {
    private int id;
    private String countryName;
    private int peopeles;
    private double area;

    public Country() {
    }

    public Country(int id, String countryName, int peopeles, double area) {
        this.id = id;
        this.countryName = countryName;
        this.peopeles = peopeles;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPeopeles() {
        return peopeles;
    }

    public void setPeopeles(int peopeles) {
        this.peopeles = peopeles;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return
                "\nid          | " + id +'\n'+
                "countryName | " + countryName  +'\n'+
                "peopeles    | " + peopeles +'\n'+
                "area        | " + area ;
    }
    public static void informationTables(){
        System.out.println("1 бассаныз арайлисттке салгамын");
        System.out.println("2 бассаныз   поля кошсонуз болот");
        System.out.println("3  бассаныз таблицалардагы баардык маанилерди ала аласыз");
        System.out.println("Бул учообудон башка  бассаныз таблицалардагы маанилерди  айди мн ала аласыз");
    }
}
