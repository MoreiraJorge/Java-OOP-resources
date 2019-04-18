/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courses;

/**
 *
 * @author Jorge Moreira
 */
public class Course {
    private String name;
    private String id;

    public Course(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        String text="";
        text += "Curso : " + name + "\n";
        text += "ID : " + id + "\n";    
        return text;
    }
    
}
