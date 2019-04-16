/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containerofobjectsapi;

/**
 *
 * @author Jorge Moreira
 */

public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object objects[];

    /**
     *
     * @param objects
     */
    
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     *
     * Constructor que cria array de objects com Default size 100
     */
    
    public ContainerOfObjects() {
        objects = new Object[DEFAULT_SIZE];
    }

    /**
     * Constructor que cria array de ojects com tamanho defenido pelo user
     *
     * @param maxSize
     */
    
    public ContainerOfObjects(int maxSize) {
        objects = new Object[maxSize];
    }

    /**
     * metodo que adiciona objects ao array
     *
     * @param newObject
     * @return
     */
    
    protected boolean addObject(Object newObject) {

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = newObject;
                return true;
            }
        }
        return false;
    }

    /**
     * metodo que remove objects do array
     *
     * @param position
     * @return
     */
    
    protected Object removeObject(int position) {

        Object tmp = objects[position];

        int j;

        for (j = position; j < objects.length - 1 && objects[j] != null; j++) {
            objects[j] = objects[j + 1];
        }
        objects[j] = null;

        return tmp;
    }
    
    /**
     * metodo que substitui objects do array por outros inseridos pelo user
     *
     * @param position
     * @param newObject
     * @return
     */
    
    protected boolean setObject(int position, Object newObject) {
        if (position >= 0 && position < objects.length) {
            if (objects[position] != null) {
                objects[position] = newObject;
                return true;
            }

        }
        return false;
    }

    /**
     * metodo que encontra o object pretendido
     *
     * @param obj
     * @return
     */
    
    protected int findObject(Object obj) {
        for (int i = 0; i < objects.length && objects[i] != null; i++) {
            if (objects[i].equals(obj)) {
                System.out.println("Objeto encontrado!");
                return i;
            }
        }
        System.out.println("Objeto nao encontrado!");
        return -1;
    }

    /**
     * metodo que imprime a informação dos objects no array
     * 
     *
     */
    
    protected void printall() {
        for (int i = 0; i < objects.length && objects[i] != null; i++) {
            System.out.println(objects[i].toString());
        }
    }

    /**
     * metodo que verifica a existencia de um object no array
     *
     * @param obj
     * @return
     */
    
    protected boolean hasObject(Object obj) {
        for (int i = 0; i < objects.length && objects[i] != null; i++) {
            if (objects[i].equals(obj)) {
                System.out.println("Objeto Existe!");
                return true;
            }
        }
        System.out.println("Objeto nao existe!");
        return false;
    }

    /**
     *
     * @return
     */
    
    protected Object[] getObjects() {
        int count = 0;

        for (int j = 0; j < objects.length; j++) {
            if (objects[j] == null) {
                count++;
                break;
            }
        }

        Object[] out = new Object[count];
        for (int i = 0; i < objects.length && objects[i] != null; i++) {
            System.arraycopy(objects, i, out, i, objects.length);
        }

        return out;
    }

}
