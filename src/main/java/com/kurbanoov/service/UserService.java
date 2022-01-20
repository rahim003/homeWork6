package com.kurbanoov.service;

import java.util.List;

public interface UserService {
     void addInformation(  String country_name, int peopels, double area);
     void deleteInformation();
     void printInformation();
     List<?>addToList();
}
