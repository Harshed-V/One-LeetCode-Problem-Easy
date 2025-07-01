import java.math.BigInteger;
public class Main1 {
    public static void main(String[] args) {
        int[] digits={1,2,3,4,5};
        int[] a=plusOne(digits);
        for (int j : a) {
            System.out.print(j);
        }
    }    public static int[] plusOne(int[] digits) {
        StringBuilder str = new StringBuilder();

        for (int digit : digits) {
            str.append(digit);
        }

        BigInteger fin = new BigInteger(str.toString()).add(BigInteger.ONE);
        String finn = fin.toString();

        int lengt = finn.length();
        int[] digi = new int[lengt];

        for (int i = 0; i < lengt; i++) {
            digi[i] = finn.charAt(i) - '0';
        }

        return digi;
    }

}
