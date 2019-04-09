package ObjectManagement;

public class BikeStoreDemo {

    public static void main(String[] args) {

        /* testing the class ContainerOf Objects*/
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();

        ContainerOfObjects test1 = new ContainerOfObjects();

        test1.addObject(obj1);
        test1.addObject(obj2);
        test1.addObject(obj3);
        test1.addObject(obj4);
        test1.addObject(obj5);

        test1.removeObject(1);
        test1.findObject(obj4);
        test1.setObject(3, obj5);
        test1.addObject(obj4);



    }
}
