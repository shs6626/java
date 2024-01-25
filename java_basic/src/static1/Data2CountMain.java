package static1;

public class Data2CountMain {
  public static void main(String[] args) {

    Counter counter = new Counter();
    Data2 data2_1 = new Data2("A2", counter);
    System.out.println("A2 : " + counter.count);

    Data2 data2_2 = new Data2("B2 : ", counter);
    System.out.println("B2 : " + counter.count);

  }
}
