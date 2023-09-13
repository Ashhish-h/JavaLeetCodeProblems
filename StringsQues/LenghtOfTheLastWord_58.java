package StringQues;

public LengthOfTheLastWord_58{
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        if(word.length == 0){
            return 0;
        }
        return word[word.length- 1].length();
    }
}