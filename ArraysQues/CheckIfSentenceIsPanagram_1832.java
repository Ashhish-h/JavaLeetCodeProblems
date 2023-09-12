public class CheckIfSentenceIsPanagram_1832 {
        public boolean checkIfPangram(String sentence) {
        boolean ispanagram = true;
        for(char i = 'a'; i <= 'z'; i++){
            if(!(sentence.contains(String.valueOf(i)))){
                ispanagram = false;
                break;
            }
        }
        if(ispanagram){
            return true;
        } else{
            return false;
        }
    }
}
