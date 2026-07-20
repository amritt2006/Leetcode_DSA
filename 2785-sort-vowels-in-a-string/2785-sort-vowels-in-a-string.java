class Solution {
    public String sortVowels(String s) {
        String t = "";
        ArrayList<Character> vowel = new ArrayList<>();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel.add(s.charAt(i));
            }
        }
        Collections.sort(vowel); 
        int j = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)!='A' && s.charAt(i)!='E'&& s.charAt(i)!='I'&& s.charAt(i)!='O'&& s.charAt(i)!='U'&& s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u'){
                t = t+s.charAt(i);
            }else{
                t=t+vowel.get(j);
                j++;
            }
        }
        return t;
    }
}