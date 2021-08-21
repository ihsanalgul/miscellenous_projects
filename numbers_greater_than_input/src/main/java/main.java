import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array numbers:");
        String s = scanner.nextLine();

        String[] array = s.split(";");

        System.out.println("Enter the input");
        int n=scanner.nextInt();

        List<Integer> greaterList= new ArrayList<>();
        List<Integer> lesserList= new ArrayList<>();

        for (String w: array) {
            int e = Integer.parseInt(w);
            if ((e >= n)) {
                greaterList.add(e);
            } else {
                lesserList.add(e);
            }
        }
        System.out.println("Numbers from the list which are greater than or equal to input number : "
                +greaterList);

        System.out.println("Numbers from the list which are less than the input number : "
                +lesserList);
    }
}
