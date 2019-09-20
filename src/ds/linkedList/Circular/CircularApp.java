package ds.linkedList.Circular;

public class CircularApp {
  public static void main(String[] args) {

    CircularLinked mylist = new CircularLinked();

    mylist.insertFirst(1);
    mylist.insertFirst(2);
    mylist.insertFirst(3);
    mylist.insertFirst(4);
    mylist.insertLast(100);

    mylist.displayList();

  }
}
