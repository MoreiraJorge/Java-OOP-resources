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
public class CourseManagement extends containerofobjectsapi.ContainerOfObjects {

    CourseManagement(int maxSize) {
        super(maxSize);
    }

    public boolean addSubject(Subject s) {
        return super.addObject(s);
    }

    public boolean removeSubject(Subject s) {
        int i = super.findObject(s);
        return (boolean) super.removeObject(i);
    }

    public void print() {
        super.printall();
    }

}
