package arjun.assignment.data;

public class Main {
    public static void main(String[] args) {
        SList sList = new SList();
        SListIterator sListIterator = sList.iterator();

        sListIterator.add(10);
        sListIterator.add(20);
        sListIterator.add(30);
        while(sListIterator.hasNext())
            System.out.println(sListIterator.next());

        sListIterator.remove();

        sListIterator.add(70);
        sListIterator.add(80);
        while(sListIterator.hasNext())
            System.out.println(sListIterator.next());


    }
}
