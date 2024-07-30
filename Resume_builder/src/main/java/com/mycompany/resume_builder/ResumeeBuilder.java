/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resume_builder;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ResumeeBuilder {
    
 public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Resume Builder\n");

    
        System.out.println("Please enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        System.out.println("Please enter your phone number:");
        String phone = scanner.nextLine();

        System.out.println("Please enter your education:");
        String education = scanner.nextLine();

        System.out.println("Please enter your work experience:");
        String workExperience = scanner.nextLine();

        System.out.println("Please enter your skills:");
        String skills = scanner.nextLine();

    
        Resume_builder resume = new Resume_builder(fullName, email, phone, education, workExperience, skills);


        Databasemanager.saveResume(resume);

        scanner.close();
    }
}

