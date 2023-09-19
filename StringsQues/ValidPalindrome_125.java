package StringsQues;

class ValidPalindrome_125{
    public boolean isPalindrome(String s) {
        if(s == null||s.length() == 0){
           return true; 
        }
        String st = s.toLowerCase();
        st = st.replaceAll("[^a-z0-9]", "");
        for(int ch = 0; ch < st.length() / 2; ch++){
            char start = st.charAt(ch);
            char end = st.charAt(st.length() - 1 - ch);
            if(start != end){
                return false;
            }
        }
        return true;
     }
}