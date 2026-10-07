class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;double avg =0;
        for(int i =0;i<k;i++){
            sum += nums[i];//firstwindow
        }
        avg = sum/k;
        double maxAvg =avg;

        for(int j=k;j<nums.length;j++){
            sum+= nums[j]-nums[j-k];
            avg =sum/k;
            maxAvg = Math.max(maxAvg,avg);
        }
        return maxAvg;
    }
}