package DynamicProgramming;

import java.util.Scanner;

public class PainFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no_of_fence = input.nextInt();   //n
        int no_of_colors = input.nextInt();  //k
        input.close();

        long same = no_of_colors * 1;  //(k*1)
        long different = no_of_colors * (no_of_colors - 1);  //k*(k-1)
        long total = same + different;

        for (int i = 3; i <= no_of_fence; i++) {
            same = different * 1;
            different = total * (no_of_colors - 1);
            total = same + different;
        }
        System.out.println(total);
    }
}
