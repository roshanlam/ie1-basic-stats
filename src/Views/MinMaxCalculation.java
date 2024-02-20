import java.util.Arrays;
import java.util.Collections;

public class MinMaxCalculation{
  public static void main(String[] args){
    Integer[] num = {1, 2, 3, 4};
    int min = Collections.min(Arrays.asList(num));
    int max = Collections.max(Arrays.asList(num));
    System.out.println("Min is " + min);
    System.out.println("Max is " + max);
  }
}
