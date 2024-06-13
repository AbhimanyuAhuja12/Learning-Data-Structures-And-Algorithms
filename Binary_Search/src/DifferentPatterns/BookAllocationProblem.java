package DifferentPatterns;

import java.util.Arrays;

import static java.lang.Integer.sum;

public class BookAllocationProblem {
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int M = 2;
        System.out.println(MinPages(pages, M,pages.length));
    }


    public static int MinPages(int[] pages, int M,int N) {
        int ans =Integer.MAX_VALUE;
        int start =pages[N-1];
        int end= Arrays.stream(pages).sum();

        // no of students are more than no. of books
        //edge case
        if(M>N){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;  // max no. of pages for a student that can be the possible ans

            if(isAllocationPossible(pages,N,M,mid)){
                ans=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }

    private static boolean isAllocationPossible(int[] pages, int n, int m, int maxPages) {
        int currPages=0;
        int MinStudent=1;
        for(int i=0;i<n ;i++){
            //edge case
            if(pages[i]>maxPages) return false;

            if(currPages+ pages[i]>maxPages){
                MinStudent++;
                if(MinStudent>m) return false;  // optimization technique , bec at last you can simply check if m=MinStudent or not , but than it will traverse the whole array
                currPages=pages[i];
            }else{
                currPages+=pages[i];
            }

        }return true;
    }
}

