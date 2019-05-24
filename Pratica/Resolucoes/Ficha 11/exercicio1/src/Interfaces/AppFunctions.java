package Interfaces;

import CustomExceptions.FullMemoryException;
import CustomExceptions.NonSuportedException;
import pod.File;

public interface AppFunctions {

    public void addfile(File file) throws NullPointerException, IndexOutOfBoundsException, FullMemoryException;

    public void delete(int index)throws ArrayIndexOutOfBoundsException, NullPointerException;

    public void playTrack(int index) throws NonSuportedException, ArrayIndexOutOfBoundsException, NullPointerException;

    public void nextTrack();

    public void previousTrack();




}
