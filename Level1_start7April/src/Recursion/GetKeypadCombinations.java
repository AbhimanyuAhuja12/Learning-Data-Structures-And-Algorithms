package Recursion;

import java.util.ArrayList;
import java.util.Scanner;


public class GetKeypadCombinations {
    static String[] arr = {"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".;"};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String PhoneNo = input.next();
        ArrayList<String> res = generateCombinations(PhoneNo);
        System.out.println(res);
    }
    private static ArrayList<String> generateCombinations(String PhoneNo){
        if(PhoneNo.length()==0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        char ch = PhoneNo.charAt(0);
        String curr = PhoneNo.substring(1);
        // result in small arraylist(risa)
        ArrayList<String> risa = generateCombinations(curr);

        ArrayList<String> result = new ArrayList<>();
        for(String itr : risa){
            int ptr = ch-'0';
            String helper = arr[ptr];
            for(int i=0;i<helper.length();i++){
                char c = helper.charAt(i);
                result.add(c + itr);
            }

        }
        return result;
    }
}
/*
package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetKeypadCombinations {

    private static final String[] KEYPAD_MAPPING = {
        "?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".;"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNo = scanner.next();
        scanner.close();

        if (!phoneNo.matches("[0-9]+")) {
            System.out.println("Invalid input. Please enter digits only.");
            return;
        }

        List<String> combinations = getCombinations(phoneNo);
        System.out.println(combinations);
    }


     * Generates all possible keypad combinations for the given phone number.
     *
     * @param phoneNo The input digit string.
     * @return List of all possible combinations.
     */
    /*
private static List<String> getCombinations(String phoneNo) {
    if (phoneNo.isEmpty()) {
        List<String> baseResult = new ArrayList<>();
        baseResult.add("");
        return baseResult;
    }

    char digitChar = phoneNo.charAt(0);
    int digit = digitChar - '0';
    String remainingDigits = phoneNo.substring(1);

    List<String> partialCombinations = getCombinations(remainingDigits);
    List<String> fullCombinations = new ArrayList<>();

    String mappedChars = KEYPAD_MAPPING[digit];
    for (char ch : mappedChars.toCharArray()) {
        for (String partial : partialCombinations) {
            fullCombinations.add(ch + partial);
        }
    }

    return fullCombinations;
}
}

 */
