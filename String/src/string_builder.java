public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder();
        for (int i = 0; i < 26; i++) {
           char ch =(char)('a'+i);
           builder.append(ch);
        }
        System.out.println(builder);
        // methods in string builder
        builder.reverse();
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
