/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courses;

/**
 * @author Jorge Moreira
 */
public class CourseManagement extends containerofobjectsapi.ContainerOfObjects {

    public CourseManagement(int maxSize) {
        super(maxSize);
    }

    public boolean addSubject(Subject subjects) {
        if (super.hasObject(subjects)) {
            return false;
        } else {
            return super.addObject(subjects);
        }
    }

    public boolean addSubject(TeacherSubject Subject) {
        if (super.hasObject(Subject)) {
            return false;
        } else {
            return super.addObject(Subject);
        }
    }

    public boolean removeSubject(Subject s) {
        int i = super.findObject(s);
        return (boolean) super.removeObject(i);
    }

    public void print() {
        super.printall();
    }

    public Object[] getSubjects() {
        return super.getObjects();
    }

    public void printAll() {
        super.printall();
    }

}
