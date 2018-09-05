import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1:");
        int numOne = sc.nextInt();
        System.out.print("2:");
        int numTwo = sc.nextInt();
        int res = Multiplication(numOne, numTwo);
        System.out.println(res + " - result");
    }

    private static int Multiplication(int numOne, int numTwo) {
        int result = 0;

        if (numOne < 0 && numTwo < 0){
            numOne=-numOne;
            numTwo=-numTwo;
        }

        if (numOne>numTwo) {
            int s;
            s = numTwo;
            numTwo = numOne;
            numOne = s;
        }

        if (numOne == 0 || numTwo == 0){
            return result;
        } else {
            for (int i=0;i<numTwo; i++) {
                result += numOne;
            }
            return result;
        }
    }
}
