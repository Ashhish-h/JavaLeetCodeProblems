package StringsQues;

public class DetermineIfStringHalvesAreAlike_1704 {
    public boolean halvesAreAlike(String s) {
        int middle = s.length() / 2;
        String firstHalf = s.substring(0, middle).toLowerCase();
        String secondHalf = s.substring(middle).toLowerCase();
        int count1 = 0, count2 = 0;
        for(int i = 0; i < firstHalf.length();i++){
            char ch = firstHalf.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                count1++;
            }
            
        }

        for(int i = 0; i < secondHalf.length();i++){
            char ch = secondHalf.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                count2++;
            }
            
        }

        if(count1 == count2){
            return true;
        }
        return false;
    }
}
