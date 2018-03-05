import java.util.Scanner;

public class WuTangConcatenator {
    public Integer MultiplesOfThree(Integer input) {
        WuTangConcatenator wtc = new WuTangConcatenator();

        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();
        if (x % 3==0){
            System.out.println("Wu numbers");

        }
        return x;

    }
}

