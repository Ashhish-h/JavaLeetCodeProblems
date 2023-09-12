package StringsQues;

public class CheckIfTwoStringsAreEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word3 = "";
        String word4 = "";
        for(int i = 0; i < word1.length; i++){
            word3 += word1[i];
        }

        for(int i = 0; i < word2.length; i++){
            word4 += word2[i];
        }

        if(word3.equals(word4)){
            return true;
        }
        return false;
    }
}


