package StringsQues;

public class ReverseWordsInAString_557 {
    public String reverseWords(String s) {
        String[] strArray = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : strArray){
            res.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
}
