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
public class Subject {

    private String name;
    private int id;
    private double hours;
    private double weeklyhour;

    public Subject(String name, int id, double hours, double weeklyhour) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.weeklyhour = weeklyhour;
    }
    
    
    @Override
    public String toString() {
        String text = "";

        text += "Disciplina : " + name + "\n";
        text += "ID disciplina :" + id + "\n";
        text += "Horas : " + hours + "\n";
        text += "Horas Semanais : " + weeklyhour + "\n";

        return text;
    }
}
