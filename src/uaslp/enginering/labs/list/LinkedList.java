package uaslp.enginering.labs.list;

import uaslp.enginering.labs.model.Student;

public class LinkedList {


    public enum InsertPosition {
        BEFORE,
        AFTER
    }

    public class Iterator{

        public boolean hasNext() {
            return false;
        }

        public Student next() {
            return null;
        }
    }

    private Node front;
    private Node tail;

    public void add (Student student){

    }

    public void delete (Student student){

    }

    public void delete (int index){

    }

    public Iterator getIterator (){

        return null;

    }

    public int size (){
        return 0;
    }

    public Student getAt(int index){
        return null;
    }

    public void insert(Student reference, Student newStudent, InsertPosition insertPosition){

    }


}
