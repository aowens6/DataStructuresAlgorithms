package ds.stack;

import javax.swing.text.html.ListView;

public class Stack {
  private int maxSize;
  private  char[] stackArray;
  private int top;

  public Stack(int size){
    this.maxSize = size;
    this.stackArray = new char[maxSize];
    this.top = -1;
  }

  public void push(char l){
    if (!isFull()){
      top++;
      stackArray[top] = l;
    }else{
      System.out.println("Stack full");
    }
  }

  public char pop(){
    if(!isEmpty()){
      int oldTop = top;
      top--;
      return stackArray[oldTop];
    }else{
      System.out.println("Stack is empty");
      return '0';
    }
  }

  public char peak(){
    return stackArray[top];
  }

  public boolean isEmpty(){
    return (top == -1);
  }

  public boolean isFull(){
    return (top == maxSize-1);
  }
}
