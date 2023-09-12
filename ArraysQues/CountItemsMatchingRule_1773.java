class CountItemsMatchingRule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.equals("type")){
            for(int i = 0; i < items.size(); i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    count++;
                }
            }
        }
         if(ruleKey.equals("color")){
            for(int i = 0; i < items.size(); i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
            }
        }
         if(ruleKey.equals("name")){
            for(int i = 0; i < items.size(); i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}