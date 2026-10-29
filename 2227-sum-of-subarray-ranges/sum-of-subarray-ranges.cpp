
class Solution {
public:
    vector<int> nextSmallerElements(vector<int>& arr) {
        int n = arr.size();
        stack<int> st;
        vector<int> next(n, n);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.top()] >= arr[i]) {
                st.pop();
            }

            next[i] = st.empty() ? n : st.top();
            st.push(i);
        }

        return next;
    }

    vector<int> nextGreaterElements(vector<int>& arr) {
        int n = arr.size();
        stack<int> st;
        vector<int> next(n, n);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.top()] <= arr[i]) {
                st.pop();
            }

            next[i] = st.empty() ? n : st.top();
            st.push(i);
        }

        return next;
    }

    vector<int> prevGreaterElements(vector<int>& arr) {
        int n = arr.size();
        stack<int> st;
        vector<int> prev(n, -1);

        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.top()] < arr[i]) {
                st.pop();
            }

            prev[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }

        return prev;
    }

    vector<int> prevSmallerElements(vector<int>& arr) {
        int n = arr.size();
        stack<int> st;
        vector<int> prev(n, -1);

        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.top()] > arr[i]) {
                st.pop();
            }

            prev[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }

        return prev;
    }

    long long subArrayRanges(vector<int>& nums) {
        int n = nums.size();

        vector<int> nextSm = nextSmallerElements(nums);
        vector<int> prevSm = prevSmallerElements(nums);
        vector<int> nextGr = nextGreaterElements(nums);
        vector<int> prevGr = prevGreaterElements(nums);

        long long sumMin = 0;
        long long sumMax = 0;

        for (int i = 0; i < n; i++) {
            long long leftMin = i - prevSm[i];
            long long rightMin = nextSm[i] - i;
            sumMin += 1LL * nums[i] * leftMin * rightMin;

            long long leftMax = i - prevGr[i];
            long long rightMax = nextGr[i] - i;
            sumMax += 1LL * nums[i] * leftMax * rightMax;
        }

        return sumMax - sumMin;
    }
};
