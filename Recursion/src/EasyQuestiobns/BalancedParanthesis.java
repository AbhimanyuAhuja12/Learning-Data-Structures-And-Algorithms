package EasyQuestiobns;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String exp = "(";
        System.out.println(Balanced(exp));
    }

    static boolean Balanced(String str) {
        int count1 = 0;
        int count2 = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            switch (ch[i]) {
                case '[', '{', '(' -> count1++;
                case ']', '}', ')' -> count2++;

            }
            ;
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }
}
