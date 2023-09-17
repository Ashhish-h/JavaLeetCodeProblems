package StringsQues;

class CountSymmetricIntegers_2873{
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low;i <=high; i++){
            if(isSymmetric(i)){
                count++;
            }
        }
        return count;
    }

    private boolean isSymmetric(int num){
        String numStr = String.valueOf(num);
        int len = numStr.length();

        if(len % 2 != 0){
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < len / 2; i++){
            sum1 += Character.getNumericValue(numStr.charAt(i));
            sum2 += Character.getNumericValue(numStr.charAt(len - 1 - i));     
        }

        return sum1 == sum2;
    }
}