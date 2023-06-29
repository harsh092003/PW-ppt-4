import java.util.*;
public class arr {
    public static List<Integer> commonNo(int[] num1, int[] num2, int[] num3) {
        int  n1= 0, n2= 0, n3= 0;
        List<Integer> output = new ArrayList<>();
        int x=num1.length;
        int y=num2.length;
        int z=num3.length;
        while (n1<x && n2<y && n3<z) {
            if (num1[n1] == num2[n2] && num2[n2] == num3[n3]) {
                output.add(num1[n1]);
                n1++;
                n2++;
                n3++;
            } else if (num1[n1] < num2[n2]) {
                n1++;
            } else if (num2[n2] < num3[n3]) {
                n2++;
            } else {
                n3++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4, 5};
        int num2[] = {1, 2, 5, 7, 9};
        int num3[] = {1, 3, 4, 5, 8};

        List<Integer> output = commonNo(num1, num2, num3);
        System.out.println(output);
    }
}

    
