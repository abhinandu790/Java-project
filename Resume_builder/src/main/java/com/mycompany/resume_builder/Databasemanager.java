/*emai
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resume_builder;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Databasemanager {
    

    private static final String URL = "jdbc:mysql://localhost:3306/resume";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "abhi";

    public static void saveResume(Resume_builder resume) {
       
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO resume(fullName, email, phone, education, workExperience, skills) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, resume.getFullName());
            preparedStatement.setString(2, resume.getEmail());
            preparedStatement.setString(3, resume.getPhone());
            preparedStatement.setString(4, resume.getEducation());
            preparedStatement.setString(5, resume.getWorkExperience());
            preparedStatement.setString(6, resume.getSkills());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 1) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    resume.setId(id);
                    System.out.println("Resume saved successfully with ID: " + id);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saving resume: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}

