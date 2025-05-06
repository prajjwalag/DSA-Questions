class Solution {    
    public List<Character> frequencySort(String s) {
        //your code goe shere
        int[] c = new int[26];

        for(int i = 0; i < s.length(); i++){
            int id = s.charAt(i) - 'a';
            c[id]++;
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(c[i] > 0) count++;
        }

        // System.out.println(Arrays.toString(c));
        List<Character> res = new ArrayList<>();
        for(int i = 0; i < count; i++){
            int mx = -1;
            int id = -1;
            for(int j = 0; j < 26; j++){
                if(mx < c[j]){
                    mx = c[j];
                    id = j;
                }
            }
            c[id] = -2;
            res.add((char)(id + 'a'));
        }
        return res;
    }
}