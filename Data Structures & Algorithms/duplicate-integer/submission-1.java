class Solution {
    public boolean hasDuplicate(int[] nums) {
      
    HashSet<Integer> myNum = new HashSet<>();

    for(int noumero : nums){
        if(myNum.contains(noumero)){
            return true;
        }
        myNum.add(noumero);
    }
    return false;

    }
}