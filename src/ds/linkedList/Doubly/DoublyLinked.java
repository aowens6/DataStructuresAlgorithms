package ds.linkedList.Doubly;

public class DoublyLinked {

  private DoublyNode first;
  private DoublyNode last;

  public boolean isEmpty(){
    return first == null;
  }

  public void insertFirst(int data){
    DoublyNode newNode = new DoublyNode();
    newNode.data = data;

    if (isEmpty()){
      last = newNode;
    }else{
      first.previous = newNode;
    }

    newNode.next = first; //set pointer
    this.first = newNode; //actually place node in first place

  }

  public void insertLast(int data){
    DoublyNode newNode = new DoublyNode();
    newNode.data = data;

    if(isEmpty()){
      first = newNode;
    }else{
      last.next = newNode;
      newNode.previous = last;
    }

    this.last = newNode;
  }

  public DoublyNode deleteFirst(){
    DoublyNode temp = first;
    if(first.next == null){//only one node
      last = null;
    }else{
      first.next.previous = null;//first node points to null
    }

    first = first.next;

    return temp;

  }

  public DoublyNode deleteLast(){
    DoublyNode temp = last;

    if(first.next == null){
      first = null;
    }else{
      last.previous.next = null;
    }

    last = last.previous;

    return temp;
  }

  public boolean insertAfter(int key, int data){
    DoublyNode current = first;
    while(current.data != key){
      current = current.next;
      if(current == null){
        return false;
      }
    }

    DoublyNode newNode = new DoublyNode();
    newNode.data = data;

    if(current == last){
      current.next = null;
      last = newNode;
    }else{
      newNode.next = current.next;
      current.next.previous = newNode;
    }

    newNode.previous = current;
    current.next = newNode;

    return true;

  }

  public DoublyNode deleteKey(int key){

    DoublyNode current = first;

    while(current.data != key){
      current = current.next;
      if(current == null){
        return null;
      }
    }

    if(current == first){
      first = current.next; // skipping the first
    }else{
      current.previous.next = current.next;
    }

    if(current == last){
      last = current.previous;
    }else{
      current.next.previous = current.previous;
    }

    return current;
  }

}
