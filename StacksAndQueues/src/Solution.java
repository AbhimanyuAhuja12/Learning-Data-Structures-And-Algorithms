//class Solution {
//    // Function to delete middle element of a stack.
//
//    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
//        // code here
//        int mid = sizeOfStack/2;
//        Stack<Integer> helper = new Stack<>();
//        for(int i=0;i<mid;i++){
//            helper.push(s.pop());
//        }
//        s.pop();
//
//        while(!helper.isEmpty()){
//            s.push(helper.pop());
//        }
//    }
//}
