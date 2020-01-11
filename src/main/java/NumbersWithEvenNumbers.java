public class NumbersWithEvenNumbers {
    public int findNumbers(int [] nums){
        int total=0;

        for(int i=0;i<nums.length;i++){
            int counts=0;
            int left=nums[i];
            while(left>0){
                left=left/10;
                counts++;
            }
            if(counts%2==0){
                total++;
            }
        }
        return total;
    }
}
