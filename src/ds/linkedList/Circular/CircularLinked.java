package ds.linkedList.Circular;

public class CircularLinked {

  private Node first;
  private Node last;


  public void insertFirst(int data){

    Node newNode = new Node();
    newNode.data = data;

    if(isEmpty()){
      last = newNode;
    }

    newNode.next = first;
    first = newNode;

  }

  private boolean isEmpty(){
    return (first == null);
  }

  public void insertLast(int data){
    Node newNode = new Node();
    newNode.data = data;

    if(isEmpty()){
      first = newNode;
    }else{
      last.next = newNode;
      last = newNode;
    }
  }

  public int deleteFirst(){
    int temp = first.data;

    if(first.next == null){
      last = null;
    }

    first = first.next; //making second in list now first

    return temp;
  }

  public void displayList(){
    Node current = first;
    while(current != null){
      current.displayData();
      current = current.next;
    }

  }

}
