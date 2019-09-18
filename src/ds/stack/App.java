package ds.stack;

public class App {
  public static void main(String[] args) {
    Stack myStack = new Stack(5);
//    myStack.push(10);
//    myStack.push(20);
//    myStack.push(30);
//    myStack.push(40);
//    myStack.push(50);

//    while (!myStack.isEmpty()){
//      long value = myStack.pop();
//      System.out.println(value);
//    }

    System.out.println(reverseString("HELLO"));

  }

  public static String reverseString(String str){
    int strLength = str.length();
    Stack stringStack = new Stack(strLength);

    for (int i= 0; i < strLength; i++){
      char ch = str.charAt(i);
      stringStack.push(ch);
    }

    String result = "";

    while (!stringStack.isEmpty()){
      char ch = stringStack.pop();
      result += ch;
    }

    return result;

  }
}
