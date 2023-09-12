package SearchingQues;
public class FirstBadVersion_278 extends VersionControl {
    public int firstBadVersion(int n) {
       int start = 1;
       int end = n;
       int badVer = 0;
       while(start <= end){
           int middle = start + (end - start)/2;
           if(isBadVersion(middle)){
               badVer = middle;
               end = middle - 1;
           } else{
               start = middle + 1;
           }
       }
       return badVer;
    }
}