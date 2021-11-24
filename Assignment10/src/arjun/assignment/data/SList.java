package arjun.assignment.data;

public class SList <T>{
    Node<T> head;

    public SListIterator<T> iterator(){
        return new SListIterator<T>(this);
    }
}
