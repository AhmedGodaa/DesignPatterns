package org.example.TypeOfRelationships;

public class Employee {
    private String id;
    private String salary;
//    composition
//    Strong relationship -> no employee can be without personal information
//    Part-of
//    if any one of them not exist the other will be without any meaning


    private PersonalInformation personalInformation;
//    aggregation
//    not directly related to employee
//    not strong relation
//
    private Department department;
}
