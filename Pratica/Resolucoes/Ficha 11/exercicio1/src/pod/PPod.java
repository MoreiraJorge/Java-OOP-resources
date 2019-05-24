package pod;

import CustomExceptions.FullMemoryException;
import CustomExceptions.NonSuportedException;
import Interfaces.AppFunctions;

public class PPod implements AppFunctions {
    private final int MAX = 20;
    private File files[] = new File[MAX];
    private double memory;
    private double filledmemory = 0;
    private int filecount = 0;
    private int currentTrack;

    public PPod(double memory) {
        this.memory = memory;
    }


    @Override
    public void addfile(File file) throws NullPointerException, IndexOutOfBoundsException, FullMemoryException {
        if (file == null) {
            throw new NullPointerException("Ficheiro não pode ser null");
        }
        if (filledmemory + file.getSize() > memory) {
            throw new FullMemoryException("memoria cheia!!!");
        }
        if (filecount > files.length) {
            throw new IndexOutOfBoundsException("Numero de ficheiros passa do limite!!");
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                filecount++;
                filledmemory = filledmemory + files[i].getSize();
                return;
            }
        }
    }

    @Override
    public void delete(int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if(index > files.length){
            throw new ArrayIndexOutOfBoundsException("Index Inválido");
        }
        if(files[index] == null){
            throw new NullPointerException("a posicao esta vazia");
        }
        files[index] = null;
        for (int i = index; i < (filecount - 1); i++) {
            files[i] = files[i + 1];
        }
        filecount-= 1;
        files[filecount] = null;
    }

    @Override
    public void playTrack(int index) throws NonSuportedException, NullPointerException, ArrayIndexOutOfBoundsException {
        if (index < MAX && index >= 0) {
            if (files[index] == null) {
                throw new NullPointerException("a posicao esta vazia");
            }

            if (files[index].getExtention() != "mp3") {
                throw new NonSuportedException("Ficheiro não suportado");
            }
            if (index > files.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Index Inválido");
            }

            if ("mp3".equals(files[index].getExtention())) {
                System.out.println(files[index].toString());
                currentTrack = index;
            }
        }
    }

    public void nextTrack(){
        int next;
        for (int i = currentTrack; i < MAX; i++){
            try {
                next = currentTrack+1;
                playTrack(next);
                return;
            } catch (NonSuportedException e){
                System.out.println(e.getMessage());
                continue;
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
                break;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    public void previousTrack(){
        int previous;
        for (int i = currentTrack; i >= 0; i--){
            try {
                previous = currentTrack--;
                playTrack(previous);
                return;
            } catch (NonSuportedException e){
                System.out.println(e.getMessage());
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
