class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map1 = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String t = new String(chars);

            map1.putIfAbsent(t, new ArrayList<String>());
            map1.get(t).add(s);
        }
         return new ArrayList<>(map1.values());
    }
}
