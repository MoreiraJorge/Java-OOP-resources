package main;

import CustomExceptions.FullMemoryException;
import CustomExceptions.NonSuportedException;
import pod.File;
import pod.PPod;

public class PPodDemo {

    public static void main(String[] args) {
        PPod pod1 = new PPod(100.0);
        File f1 = new File("aa","wmv", 1.0, 120);
        File f2 = new File("bb","mp3", 1.0, 120);
        File f3 = new File("cc","mp3", 1.0, 120);
        File f4 = new File("dd","mp3", 1.0, 120);
        File f5 = new File("ee","jpeg", 1.0, 120);
        File f6 = new File("ff","jpeg", 1.0, 120);


        try {
            pod1.addfile(f1);
            pod1.addfile(f2);
            pod1.addfile(f6);
            pod1.addfile(f4);
            pod1.addfile(f5);
            pod1.addfile(f3);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (FullMemoryException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        try{
           // pod1.delete(0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            pod1.playTrack(0);
        } catch (NonSuportedException e){
            System.out.println(e.getMessage());
        }

        pod1.nextTrack();
        pod1.nextTrack();

        //pod1.previousTrack();


    }
}
