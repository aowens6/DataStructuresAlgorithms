package ds.queue;

public class Queue {

  private int maxSize;
  private long[] queArray;
  private int front; //index of front;
  private int rear;
  private int itemCount;

  public Queue(int size){
    this.maxSize = size;
    this.queArray = new long[size];
    front = 0;
    rear = -1;
    itemCount = 0;
  }

  public void insert (long j){

    //OUT OF BOUNDS handling --- CIRCULAR QUEUE, ends up overwriting from beginning
    if (rear == maxSize-1){//we are at the end of the array
      rear = -1; // goes back to the beginning of the array
    }

    rear++;
    queArray[rear] = j;
    itemCount++;
  }

  public void view(){
    for (int i = 0; i < queArray.length ; i++) {
      System.out.print(queArray[i]+ " ");
    }
  }

  public long remove(){ //pops from front
    long temp = queArray[front];
    front++;
    if(front == maxSize){
      front = 0;
    }
    itemCount--;
    return temp;
  }

  public long peekFront(){
    return queArray[front];

  }

  public boolean isEmpty(){
    return (itemCount == 0);
  }


  public boolean isFull(){
    return (itemCount == maxSize);
  }

}
