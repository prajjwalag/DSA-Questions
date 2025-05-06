class Solution {
    public void pattern17(int n) {
        for(int i = 1; i <= n; i++) {
            //Printing Left Spaces
            for(int leftSpaces = 1; leftSpaces <= n-i; leftSpaces++) {
                System.out.print(" ");
            }
            //Printing Characters
            char ch = 'A';
            for(int characters = 1; characters <= i*2-1; characters++) {
                System.out.print(ch);
                if(characters < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            //Printing Right Spaces
            for(int rightSpaces = 1; rightSpaces <= n-i; rightSpaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
