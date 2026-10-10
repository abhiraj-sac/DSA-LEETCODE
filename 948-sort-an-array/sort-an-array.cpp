
class Solution {
public:
    void heapify(vector<int>& nums, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(nums[i], nums[largest]);
            heapify(nums, n, largest);
        }
    }

    vector<int> sortArray(vector<int>& nums) {
        int n = nums.size();

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Move maximum elements to the end
        for (int i = n - 1; i > 0; i--) {
            swap(nums[0], nums[i]);
            heapify(nums, i, 0);
        }

        return nums;
    }
};

    // void sort(vector<int>& v){
    //     if(v.size() <= 1){
    //         return;
    //     }
    //     int temp = v[v.size()-1];
    //     v.pop_back();
    //     sort(v);
    //     insert(v,temp);
    // }
    // void insert(vector<int>& v,int k){
    //     if(v.empty() || v[v.size()-1] <= k){
    //         v.push_back(k);
    //         return;
    //     }
    //     int val = v[v.size()-1];
    //     v.pop_back();
    //     insert(v,k);
    //     v.push_back(val);
    // }
