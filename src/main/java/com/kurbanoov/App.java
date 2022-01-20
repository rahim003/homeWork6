package com.kurbanoov;

import com.kurbanoov.model.Cities;
import com.kurbanoov.model.Country;
import com.kurbanoov.model.Utull1;
import com.kurbanoov.service.SearcCitiesID;
import com.kurbanoov.service.UserService;
import com.kurbanoov.service.impl.CitiesSearchId;
import com.kurbanoov.service.impl.UserService2;
import com.kurbanoov.service.impl.UserServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        UserService userService1 = new UserServiceImpl();
        UserService2 userService2=new UserService2();
        SearcCitiesID searcCitiesID = new CitiesSearchId();
        Cities.informationTable();
        int number = scanner.nextInt();
        Country.informationTables();
        int number2 = scanner.nextInt();
        if (number == 1) {
            if (number2 == 1) {
                userService1.addToList();
            } else if (number2 == 2) {
                userService1.addInformation("Kazakstan", 1200000, 245.8);
            } else if (number2 == 3) {
                userService1.printInformation();
            }
        } else if (number == 2) {
            if (number2 == 1) {
                userService2.addToList();
            } else if (number2 == 2) {
                userService2.addInformation("", 0, 0.0);
            } else if (number2 == 3) {
                userService2.printInformation();
            }
        }else if (number==3){
            System.out.println("Сиз айди менен тапкныз келип атат 5 маани бар бизде");

            searcCitiesID.searchID(scanner.nextInt());
        }else {
            System.out.println("bashka san jok");
        }
    }
}
