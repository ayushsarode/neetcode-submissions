class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();

        String current = "";
        int number = 0;

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }


            else if (c == '[') {
                counts.push(number);
                strings.push(current);

                number = 0;
                current = "";

            } else if (c == ']') {
                int count = counts.pop();
                String previous = strings.pop();

                String temp = "";

                for(int i = 0; i< count; i++) {
                    temp += current;
                }

                current = previous + temp;
            }
             else {
                current += c;
             }
        } 
        return current;

}
}