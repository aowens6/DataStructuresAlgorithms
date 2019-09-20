package ds.linkedList.Singly;

public class SinglyApp {


  public static void main(String[] args) {

    SinglyLinkedList mylist = new SinglyLinkedList();

    mylist.insertFirst(1);
    mylist.insertFirst(2);
    mylist.insertFirst(3);
    mylist.insertFirst(4);
    mylist.insertLast(100);

    mylist.displayList();
  }

}
