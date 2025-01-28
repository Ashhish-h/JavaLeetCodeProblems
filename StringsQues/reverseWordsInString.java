class Solution {
    public String reverseWords(String str) {
        str.trim();
        String[] arr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
          sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}