package com.maksud.spring.mvc;

import com.maksud.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2,max = 30,message = "name must be at least 2")
    @NotBlank(message = "name is required field")
    private String name;
    @Size(min = 2,max = 30,message = "surname must be at least 2")
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500,message = "Salary should be greater than 499")
    @Max(value = 1000,message = "Salary should be less than 1001")
    private int salary;
    private String department;
    private String carBrand;
    private Map<String,String> departments;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String,String> languageList;
    @Pattern(regexp = "^\\d{2}\\d{3}\\d{2}\\d{2}$",message = "Please use this pattern XX-XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("HR","Human Resources");
        departments.put("IT","Information Tech");
        departments.put("Sales","Sales");
        carBrands = new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Mersedez-Benz","Mers");
        carBrands.put("Audi","Audi");
        languageList = new HashMap<>();
        languageList.put("English","EN");
        languageList.put("Deutch","DE");
        languageList.put("France","FR");
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
