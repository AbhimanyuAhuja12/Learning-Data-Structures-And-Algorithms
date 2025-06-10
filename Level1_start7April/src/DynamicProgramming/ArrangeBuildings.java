package DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int RoadLength = input.nextInt();

        long old_Buildings = 1;
        long old_spaces = 1;

        for (int i = 2; i <= RoadLength; i++) {
            long new_building = old_spaces;
            long new_spaces = old_spaces + old_Buildings;

            old_spaces = new_spaces;
            old_Buildings = new_building;
        }
        long total = old_Buildings + old_spaces;
        total = total * total;

        System.out.println(total);
    }
}
