public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 0;
    int sum = count + count;

    while(count <= 20) {
      count = count + 1;
      sum = count + sum;
    if(count == 20) {
      System.out.println(sum);
    }
    }
  }
}
