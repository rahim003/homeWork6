package com.kurbanoov.model;

public class Cities {
    private int id;
    private String citiesName;
    private int people;
    private double area;

    public Cities(int id, String citiesName, int people, double area) {
        this.id = id;
        this.citiesName = citiesName;
        this.people = people;
        this.area = area;
    }

    public Cities() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCitiesName() {
        return citiesName;
    }

    public void setCitiesName(String citiesName) {
        this.citiesName = citiesName;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
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
                "id         | " + id +"\n" +
                "citiesName | " + citiesName + '\n' +
                "people     | " + people +'\n'+
                "area       | " + area +'\n';
    }
    public static void informationTable(){
        System.out.println("1 ди бассаныз Мамлекеттер жонундо  таблицалар чыгат");
        System.out.println("2 ни бассаныз Шаарлар жонундо  таблицалар чыгат");
        System.out.println("3 ди бассаныз шаарларды   айди мн тапсаныз болот");
    }
}
