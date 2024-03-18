class Solution {
    public void sortColors(int[] nums){
      //min runtime(0ms)T(C(N))=O(N) and S(C(N))=O(N) as it requires non contiguous memory allocation iterstively
        int start=0;int curr=0;int end=nums.length-1;//Variables Initalize and end [indx] Declare 
        if(nums.length ==0 || nums.length ==1)return;//Printing Nums's legnth to 0 or 1's 
        while(curr<=end && start<end){//Iterating Nums array from start,current and ending [indx]
            if(nums[curr]==0){nums[curr]=nums[start];nums[start]=0;start++;curr++;}//swapping and increment current and start [indx] [0]values  
            else if(nums[curr]==2){nums[curr]=nums[end];nums[end]=2;end--;}//swapping and decrement current and start [indx] [2]values
            else curr++;}}}//incrementing the current indx val after sorting start and indx val to thier current sorted position
