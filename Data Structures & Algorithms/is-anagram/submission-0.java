class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            letters.put(s.charAt(i), letters.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length(); i++) {
            letters.put(t.charAt(i), letters.getOrDefault(t.charAt(i), 0)-1);
        }
        for(int count : letters.values()) {
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}
