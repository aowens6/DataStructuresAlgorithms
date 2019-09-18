public class App {

  public static void main(String[] args){
    Counter myCounter = new Counter("myCount");
    myCounter.increment();
    myCounter.increment();
    myCounter.increment();
    myCounter.increment();

    System.out.println(myCounter.getCurrentValue());
  }
}
