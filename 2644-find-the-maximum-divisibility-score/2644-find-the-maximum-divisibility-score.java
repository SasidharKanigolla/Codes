class Solution{
    public int maxDivScore(int[] nums, int[] divisors) {
        int div = 0, max = -1, num = -1;
        for(int d = 0; d < divisors.length; d++){
            div = 0;
            for(int n = 0; n < nums.length; n++){
                if(nums[n] % divisors[d] == 0) div++;
            }
            if(div > max){
                max = div;
                num = divisors[d];
            }else if(div == max){
                num = Math.min(num,divisors[d]);
            }
        }
        return num;
    }
    }