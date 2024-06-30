class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int out = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                StringBuilder sb1 = new StringBuilder(words[i]);
                StringBuilder sb2 = new StringBuilder(words[j]);
                StringBuilder sb3 = sb2.reverse();
                if(sb1.toString().equals(sb3.toString())){
                    out++;
                }
            }
        }
        return out;
    }
}
