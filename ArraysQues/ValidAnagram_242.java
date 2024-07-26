public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] frequency = new int[26];
 
        // count the frequency of char in string s
        for(char ch : s.toCharArray()){
         frequency[ch - 'a']++;
        }
 
        // decrement the frequency of char in string t
        for(char ch : t.toCharArray()){
         frequency[ch - 'a']--;
        }
 
        // check if char has non-zero freq.
        for(int val : frequency){
         if(val != 0){
             return false;
         }
        }
        return true;
     }
}
