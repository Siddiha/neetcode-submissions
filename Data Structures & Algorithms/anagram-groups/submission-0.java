class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++){
                count[chars[i] - 'a']++;

            }

            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);

        }

        return new ArrayList<>(res.values());
        
    }
}