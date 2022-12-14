package com.cg.dao;

import com.cg.entity.Student; 
public interface StudentDao
{  
public abstract Student getStudentById(int id); //find
public abstract void addStudent(Student student);  //insert
public abstract void removeStudent(Student student);  //delete
public abstract void updateStudent(Student student);  //update
public abstract void commitTransaction(); 
public abstract void beginTransaction(); 
} 