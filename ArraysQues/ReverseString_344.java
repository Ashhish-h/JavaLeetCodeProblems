class ReverseString_344{
    public void reverseString(char[] s) {
        char[] newArr=new char[s.length];
        for(int i = 0;i < s.length; i++){
            newArr[i] = s[s.length - i - 1];
        }
        for(int i = 0;i < s.length; i++){
            s[i] = newArr[i];
        }
    }
}