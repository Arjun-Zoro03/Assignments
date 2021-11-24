package arjun.assignment.data;

public class SListIterator<T> {
    Node<T> current;
    Node<T> head;

    public SListIterator(SList<T> sList){
        head = current = sList.head;
    }

    public boolean hasNext(){
        return current != null;
    }

    public T next()
    {
        T data = current.data;
        current = current.next;
        return data;
    }

    public void remove(){
        if (head == null) {
            System.out.println("List is empty!!!");
            return;
        }
        if (head.next == null){
            head = current = null;
            return;
        }
        Node<T> temp = head;
        Node<T> prev = temp;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void add(T data)
    {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            head = current = node;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
        current = head;
    }
}
