package com.badminton;
import com.badminton.DataBaseRepository;
import com.badminton.Team;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;


public class TeamServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teamName = req.getParameter("teamName");

        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        try {
            boolean result = dataBaseRepository.addTeam(new Team(teamName));
            if(result){
                resp.getWriter().write("Inserted Successfully");
            }
            else{
                resp.getWriter().write("Not inserted");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
