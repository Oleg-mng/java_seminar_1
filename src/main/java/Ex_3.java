public class Ex_3 {
    class Solution {
        public String reverseWords(String s) {
            int start = 0;
            int end = 0;
            int j = b.length() -1;
            String res = "";
            String word = "";
            for (int i = s.length() -1; i >= 0; i--) {
                if (s.charAt(i) != ' '){
                    start = i;
                    word += s.charAt(i);
                }
                else {
                    res = word + res;
                }
                start = 0;
                end = 0;
            }
            res = res + " "+ word;
            return res;
        }
    }
}
