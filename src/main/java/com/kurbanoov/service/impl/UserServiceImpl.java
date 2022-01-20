package com.kurbanoov.service.impl;

import com.kurbanoov.model.Country;
import com.kurbanoov.model.Utull1;
import com.kurbanoov.service.UserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    Utull1 utull1;
    @Override
    public void addInformation(  String country_name, int peopels, double area) {
            String sql = "insert into country (country_name, peopels, area)values (?,?,?)";
            try {
                Connection coons = utull1.connections();
                PreparedStatement statement = coons.prepareStatement(sql);
                {
                    statement.setString(1, country_name);
                    statement.setInt(2, peopels);
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
        String SQL = "SELECT * FROM country";
        try (
                Connection conn = utull1.connections();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "   " + rs.getString("country_name") + "     "
                        + rs.getInt("peopels") + "   " + rs.getDouble("area"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Country> addToList() {
        List<Country> countries1 = new ArrayList<Country>();
        String SQL = "select *from country";
        try (
                Connection connection1 = utull1.connections();
                Statement preparedStatement = connection1.createStatement();
                ResultSet rs1 = preparedStatement.executeQuery(SQL)) {
            while (rs1.next()) {
                Country country = new Country();
                country.setId(rs1.getInt("id"));
                country.setCountryName(rs1.getString("country_name"));
                country.setPeopeles(rs1.getInt("peopels"));
                country.setArea(rs1.getDouble("area"));
                countries1.add(country);
            }
            System.out.println(countries1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return countries1;
    }
    }

