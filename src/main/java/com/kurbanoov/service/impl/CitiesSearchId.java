package com.kurbanoov.service.impl;

import com.kurbanoov.model.Utull1;
import com.kurbanoov.service.SearcCitiesID;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CitiesSearchId implements SearcCitiesID {
 Utull1 utull1;
    @Override
    public void searchID(int id2) throws SQLException {
        try (
                PreparedStatement preparedStatement=utull1.connections()
                        .prepareStatement("select *from cities where id=(?)")){
            preparedStatement.setInt(1,id2);
            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
                int id=rs.getInt("id");
                String citiesName=rs.getString("cities_name");
                int people=rs.getInt("people");
                double area=rs.getDouble("area");
                System.out.println(id);
                System.out.println(citiesName);
                System.out.println(people);
                System.out.println(area);
            }
        }

        }
    }


