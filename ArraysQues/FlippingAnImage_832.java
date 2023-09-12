public class FlippingAnImage_832 {
   public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
        int [] clone = image[i].clone();
        for(int j=0; j<image[i].length; j++){
            image[i][j] = clone[image[i].length-j-1]==1 ? 0 : 1;
        }
    }
    return image;
    } 
}
