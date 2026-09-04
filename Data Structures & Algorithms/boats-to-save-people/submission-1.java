class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;

        Arrays.sort(people);

        int left = 0;
        int right = n - 1;

//count of boats
        int boats = 0;

// continue untill all people are assingned to boats, as we sorted the array two nums can be equal, left cant be greater than right one
        while(left <= right) {
           
            if (people[left] + people[right] <= limit) {
                 // weight <= limit then move left pointer forward
                left++;
            }
            // heaviest person takes a boat (either alone or with the lightest)
            // move right pointer backward
            right--;


// increment boat for each iteration(one boat is used)
            boats++;
        }
        return boats;
    }
}