public class Objective8Lab2 {
  public static void main(String[] args) {

    for(int i = 0, sum = i + i; i <= 20; i += 1){
      sum = i + sum;
      System.out.println(sum);
    }
  }
}
