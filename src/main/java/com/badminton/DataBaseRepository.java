package com.badminton;

import java.sql.*;

public class DataBaseRepository {
    public boolean addTeam(Team team) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/badminton_team";
        String userName = "meghana";
        String password = "9177733205";
        Connection con = DriverManager.getConnection(url, userName, password);
        PreparedStatement preparedStatement = con.prepareStatement("insert into team values(?)");
        preparedStatement.setString(1,team.getTeamName());

        int i=preparedStatement.executeUpdate();
        return i>0;
    }
}
