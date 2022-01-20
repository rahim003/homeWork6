package com.kurbanoov.service.impl;

import com.kurbanoov.model.Cities;
import com.kurbanoov.model.Country;
import com.kurbanoov.model.Utull1;
import com.kurbanoov.service.UserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService2 implements com.kurbanoov.service.UserService2
{
    Utull1 utull1;
    @Override
    public void addInformation(String cities_name, int people, double area) {
        String sql = "insert into cities (cities_name, people, area)values (?,?,?)";
        try {
            Connection coons = utull1.connections();
            PreparedStatement statement = coons.prepareStatement(sql);
            {
                statement.setString(1, cities_name);
                statement.setInt(2, people);
                statement.setDouble(3, area);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteInformation() {

    }

    @Override
    public void printInformation() {
        String SQL = "SELECT * FROM cities";
        try (
                Connection conn = utull1.connections();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "   " + rs.getString("cities_name") + "     "
                        + rs.getInt("people") + "   " + rs.getDouble("area"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Cities> addToList() {
        List<Cities> countries1 = new ArrayList<Cities>();
        String SQL = "select *from cities";
        try (
                Connection connection1 = utull1.connections();
                Statement preparedStatement = connection1.createStatement();
                ResultSet rs1 = preparedStatement.executeQuery(SQL)) {
            while (rs1.next()) {
                Cities cities=new Cities();
                cities.setId(rs1.getInt("id"));
                cities.setCitiesName((rs1.getString("cities_name")));
                cities.setPeople(rs1.getInt("people"));
                cities.setArea(rs1.getDouble("area"));
                countries1.add(cities);
            }
            System.out.println(countries1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return countries1;
    }
}
