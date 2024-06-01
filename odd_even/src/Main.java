import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    Integer[] array1 = {1,2,3,4,5,6,7};
    ArrayList<Integer> odds = new ArrayList<>();
    ArrayList<Integer> evens = new ArrayList<>();
    for (int element : array1){
        if (element%2==1){
            odds.add(element);
        }
        else{
            evens.add(element);
        }
        }
    System.out.println(odds + " are the odds");
    System.out.println(evens + " are the evens");
    }
}