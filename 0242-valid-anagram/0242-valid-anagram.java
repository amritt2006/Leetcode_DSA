class Solution {
    public boolean isAnagram(String s, String t) {

        // Dono strings ki length different hai toh Anagram nahi ho sakte
        if (s.length() != t.length()) {
            return false;
        }

        // Character ko key aur uski frequency ko value store karenge
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: String s ke characters ki frequency count karo
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Character present hai toh frequency +1, otherwise 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: String t ke characters ki frequency decrease karo
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            // Character map mein nahi hai toh Anagram nahi hai
            if (!map.containsKey(ch)) {
                return false;
            }

            // Frequency 1 hai toh key remove kar do
            if (map.get(ch) == 1) {
                map.remove(ch);
            } 
            else {
                // Otherwise frequency 1 se decrease karo
                map.put(ch, map.get(ch) - 1);
            }
        }

        // Map empty hai toh dono strings ki frequencies match hain
        return map.isEmpty();
    }
}