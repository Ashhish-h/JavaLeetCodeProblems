public class KidsWiththeGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for(int i = 0; i < candies.length;i++)
        {
            max = Math.max(max,candies[i]);
        } 
        for(int i : candies){
            res.add(i + extraCandies >= max);
        }
        return res;
    }
}


