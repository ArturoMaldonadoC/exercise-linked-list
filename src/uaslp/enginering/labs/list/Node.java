package uaslp.enginering.labs.list;

import uaslp.enginering.labs.model.Student;

public class Node {

    private Student student;

    private Node previous;  //Atributos

    private Node next; // Atributos

    public void setStudent(Student student){
        this.student = student;

    }

    public Student getStudent(){
        return student;
    }

    public void setPrevious(Node previous){

        this.previous = previous;

    }

    public Node getPrevious(){

        return previous;
    }

    public void setNext(Node next){

        this.next = next;

    }

    public Node getNext(){
        return next;
    }


}
