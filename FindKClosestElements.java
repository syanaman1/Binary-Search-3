// Time complexity  O(log(N-k) + k
// Space Complexity O(1)

//Approach  Using  2 pointers left and right by considering right as array length - k.  Perform Binary search and compare the 2 element located at arr[mid] and arr[mid+k] if the arr[mid] closer to x then move the right or else 
//move left.

class FindKClosestElements{
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         
        if(arr.length==k) {
           ArrayList<Integer[]> list = new ArrayList<>();
            List<Integer> result  = Arrays.stream(arr).boxed().collect( Collectors.toList());
            return result;           
        }
        int left = 0;
        int right = arr.length - k;
        while(left < right){
            int mid = (left + right)/2;
            if(x - arr[mid] > arr[mid + k] -x){
                left = mid +1;
            }else{
                right = mid;
            }
        }
          
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        
        return result;

    }
}
