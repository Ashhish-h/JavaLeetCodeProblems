import java.util.HashSet;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
    

    HashSet<Integer> set = new HashSet<>();

    for(int num : nums){
        if(!set.add(num)){
            return true; // if duplicates are found
        }
    }

    return false;

    } 
}

