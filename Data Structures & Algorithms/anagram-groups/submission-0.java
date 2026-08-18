class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // sort the word

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // check if key exists
            if (map.containsKey(key)) {
                // get existing list

                List<String> list = map.get(key);

                // add word

                list.add(word);
            } else {
                // create new list
                List<String> list = new ArrayList<>();

                // add word
                list.add(word);

                // put key and list in map
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}


// dry run
        // 1st iteration
        // str = ["eat", "tea"]
        // transverse word = eat
        // sort eat = aet
        //check in hasmap if key exist
        // if yes, give me the value
        // value = eat

        //if no, key = sort word
        // map = {"aet", [""]}
        //create a new list and add the extracted word
        // map = {"aet", ["eat"]}

        // 2nd iteration = tea
        // word  = tea
        // sort / aet
        // check in hashmap if key exists
        // yes - return list = ["eat"]
        //add the extracted word  = ["eat", "tea"]

        // implementation
        // create a map
        