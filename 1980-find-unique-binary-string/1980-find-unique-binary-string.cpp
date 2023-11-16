class Solution {
public:
    string findDifferentBinaryString(vector<string>& nums) {
        vector<int> v(67000,-1);
        string binaryString;
        int n = nums.size();
        for(int i=0;i<n;i++){
            string convert = nums[i];
            int number = stoi(convert,0,2);
            v[number]++;
        }
        for(int i=0;i<18;i++){
            if(v[i]==-1){
                 bitset<16> binary(i);
                 binaryString = binary.to_string().substr(16 - n);
                break;
            }
        }
        return binaryString;
    }
};