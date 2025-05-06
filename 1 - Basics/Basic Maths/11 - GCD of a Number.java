class Solution {
    public int GCD(int n1, int n2) {
        // int min = Math.min(n1, n2);
        // for(int i = min; i > 1; i--) {
        //     if(n1%i == 0 && n2%i == 0) {
        //         return i;
        //     }
        // }
        // return 1;
        
        //Euclidean Theorem
        while(n1 != 0 && n2 != 0) {
            if(n1 > n2) n1=n1%n2;
            else n2 = n2%n1;

        }
        if(n1==0) return n2;
        else return n1;
    }
}