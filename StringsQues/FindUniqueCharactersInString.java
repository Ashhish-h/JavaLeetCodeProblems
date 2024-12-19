package StringsQues;

public class FindUniqueCharactersInString {
    public int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                result = Math.min(result, index);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
