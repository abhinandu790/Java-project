/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resume_builder;

/**
 *
 * @author USER
 */
public class Resume_builder {

     private int id;
    private String fullName;
    private String email;
    private String phone;
    private String education;
    private String workExperience;
    private String skills;

  
    public Resume_builder(String fullName, String email, String phone, String education, String workExperience, String skills) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.workExperience = workExperience;
        this.skills = skills;
    }

    
    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEducation() {
        return education;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public String getSkills() {
        return skills;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
     
    }
}

