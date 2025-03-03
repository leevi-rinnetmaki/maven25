package task7_2.dao;

import task7_2.entity.CurrencyModel;
import java.sql.*;
import task7_2.datasource.MariaDbConnection;
import java.util.*;

public class CurrencyDao {

    public List<CurrencyModel> getAllCurrencies() {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT * FROM currencies";
        List<CurrencyModel> currencies = new ArrayList<CurrencyModel>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                String abbreviation = rs.getString(1);
                String name = rs.getString(2);
                double conversion_rate = rs.getDouble(3);
                //Employee emp = new Employee(firstName, lastName, email, salary);
                currencies.add(new CurrencyModel(abbreviation, name, conversion_rate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currencies;
    }

    public void test(){
        Connection conn = MariaDbConnection.getConnection();
        //String sql = "SELECT * FROM currencies";
    }


    /*
    public Employee getEmployee(int id) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "SELECT first_name, last_name, email, salary FROM employee WHERE id=?";

        String firstName = null;
        String lastName = null;
        String email = null;
        double salary = 0.0;
        int count = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                firstName = rs.getString(1);
                lastName = rs.getString(2);
                email = rs.getString(3);
                salary = rs.getDouble(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (count==1) {
            return new Employee(firstName, lastName, email, salary);
        }
        else {
            return null;
        }
    }

     */

    /*
    public void persist(Employee emp) {
        Connection conn = MariaDbConnection.getConnection();
        String sql = "INSERT INTO employee (first_name, last_name, email, salary) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getFirstName());
            ps.setString(2, emp.getLastName());
            ps.setString(3, emp.getEmail());
            ps.setDouble(4, emp.getSalary());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     */
}