class Solution {
     static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int i = 0;
        if (ruleKey.equals("color"))
            i = 1;
        else if (ruleKey.equals("name"))
            i = 2;

        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue))
                count++;
        }
        return count;
    }
}