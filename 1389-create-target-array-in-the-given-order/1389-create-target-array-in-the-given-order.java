class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            al.add(index[i],nums[i]);
        }
        int[] ar=new int[al.size()];
         Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
  int i=0;
        for (Integer x : arr)
            {
            ar[i]=x;
            i++;
        }
        return ar;
    }
}