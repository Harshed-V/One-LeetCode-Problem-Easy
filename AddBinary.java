import java.util.Scanner;

public class AddBinary {

    public static String addBinary(String a, String b) {
        int num1, ans1, num2, ans2;
        String temp;
        num1 = Integer.parseInt(a);
        num2 = Integer.parseInt(b);
        temp = String.valueOf(num1);
        ans1 = Integer.parseInt(temp, 2);
        temp = String.valueOf(num2);
        ans2 = Integer.parseInt(temp, 2);
        int sum = ans1 + ans2;
        return Integer.toBinaryString(sum);

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        System.out.print(addBinary(a,b));
    }
}
