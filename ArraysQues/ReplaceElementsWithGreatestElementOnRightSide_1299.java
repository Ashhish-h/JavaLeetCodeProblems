public class ReplaceElementsWithGreatestElementOnRightSide_1299 {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;

        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = greatest;
            if(temp > greatest){
                greatest = temp;
            }
        }
        return arr;
    }
}
