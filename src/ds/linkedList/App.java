package ds.linkedList;

public class App {

  public static void main(String[] args) {

    Node nodeA = new Node(1);

    Node nodeB = new Node(2);

    Node nodeC = new Node(3);

    Node nodeD = new Node(4);

    nodeA.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;

    System.out.println(listLength(nodeA));
    System.out.println(listLength(nodeB));
  }

  public static int listLength(Node aNode){
    int count = 1;
    Node currentNode = aNode;

    while (currentNode.next != null){
      count++;
      currentNode = currentNode.next;
    }

    return count;
  }

}
