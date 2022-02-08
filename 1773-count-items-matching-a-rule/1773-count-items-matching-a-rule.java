class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        char ch = ruleKey.charAt(0);
        int count = 0;
            for (int i = 0; i < items.size(); i++){
                if (ch == 't'){
                    if (items.get(i).get(0).equals(ruleValue)){
                        count++;
                    }
                }
                if (ch == 'c'){
                    if (items.get(i).get(1).equals(ruleValue)){
                        count++;
                    }
                }
                
                if (ch == 'n'){
                    if (items.get(i).get(2).equals(ruleValue)){
                        count++;
                    }
                }
                
            
        }
        return count;
    }
}