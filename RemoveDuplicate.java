import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int i;
        int[] numr=new int[len];
        for(i=0;i<len;i++) {
            numr[i] = sc.nextInt();
        }
        int a=removeDuplicates(numr);
        for(i=0;i<a;i++)
            System.out.print(numr[i]);
}
    public static int removeDuplicates(int[] nums) {
        int i=0,j;
        int len=nums.length;

        if(len==0){
            return 0;
        }
        for(j=1;j<len;j++){
            while(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }return i+1;
    }
}// 1  1  2  3  0
