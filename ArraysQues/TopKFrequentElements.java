import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> counts = new HashMap<>();
        for(int i = 0;i < nums.length; i++) {       //create map of numbers with their occurrences
            counts.put(nums[i], counts.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> (a.getValue() - b.getValue())); // create min heap based on 
        //occurences and minheap cuz we can keep polling to keep size <=k
        for(Map.Entry<Integer, Integer> e:counts.entrySet()) {
            pq.add(e);   
            if(pq.size() > k) {
                pq.poll();
            }

        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++) {
            ans[i]=(pq.poll().getKey());
        }
        return ans;

    }
}
