class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set1 = new HashSet<>();
        int l =0;
        int lengthresult = 0;

        for(int r = 0;r < s.length();r++){
            while(set1.contains(s.charAt(r))){
                set1.remove(s.charAt(l));
                l++;
            }
            set1.add(s.charAt(r));
            int length = r - l + 1;
            lengthresult = Math.max(lengthresult, length);
        }
        return lengthresult;
    }
}
