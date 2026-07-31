class Solution {
    public int maxDistinct(String s) {
        int n=s.length();
        int count=0;
        int freq[]=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)count++;
        }
        return count;
    }
}