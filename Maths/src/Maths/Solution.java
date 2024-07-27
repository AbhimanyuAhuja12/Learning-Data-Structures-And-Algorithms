package Maths;

import java.util.ArrayList;


class Solution {
    public static void main(String[] args) {
        kthFactor(12,3);
    }
    public static int kthFactor(int n, int k) {
        ArrayList curr = new ArrayList<>();
        ArrayList factors =new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                factors.add(i);
                if(i!=n/i) 
                {curr.add(n/i);}
            }
        }
        if(curr.size()+factors.size()<k) 
              return -1;
        if(factors.size()>=k) 
              return factors.get(k-1);
        k-=factors.size();
    
        return curr.get(curr.size()-k);

            
        }
    }
