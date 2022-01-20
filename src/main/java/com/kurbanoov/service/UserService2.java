package com.kurbanoov.service;

import java.util.List;

public interface UserService2 {
    void addInformation(  String cities_name, int people, double area);
    void deleteInformation();
    void printInformation();
    List<?> addToList();
}
