/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Survey;

/**
 *
 * @author tranm
 */
public class DAO extends DBContext {

    public static DAO INSTANCE = new DAO();

    private DAO() {
        INSTANCE = this;
    }

    public List<Account> getAccountAll() {
        List<Account> list = new ArrayList<>();
        String sql = "select * from Account";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString("username"), rs.getString("password"), rs.getInt("role"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public List<Survey> getSurveyAll() {
        List<Survey> list = new ArrayList<>();

        String sql = "select * from Survey";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Survey s = new Survey(rs.getInt("id"),rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"),
                        rs.getString("address"), rs.getString("city"), rs.getString("country"), rs.getInt("zip"),
                        rs.getString("bookstore"), rs.getString("shopIn"), rs.getString("shopOnline"), rs.getString("comment"));
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public boolean insertSurvey(Survey s) {
        String sql = "insert into Survey(firstname, lastname, email, [address], city, country, zip, bookstore, shopIn, shopOnline, comment)\n"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, s.getFirstName());
            st.setString(2, s.getLastName());
            st.setString(3, s.getEmial());
            st.setString(4, s.getAddress());
            st.setString(5, s.getCitty());
            st.setString(6, s.getCountry());
            st.setInt(7, s.getZip());
            st.setString(8, s.getBookStore());
            st.setString(9, s.getShopIn());
            st.setString(10, s.getShopOnline());
            st.setString(11, s.getComment());
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return false;
    }
    
     public Account check(String username, String password) {
        String sql = "select * from Account where username = ? and [password] = ?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account a = new Account(rs.getString("username"), rs.getString("password"), rs.getInt("role"));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}
