class Solution {
    public boolean isPalindrome(String s) {
        int j =  s.length() - 1;
        for (int i = 0; i < s.length()/2; i++) {
            j -= i;
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) {
                return false;
                // рассмотреть случай Заглавных и строчных букв
            }
        }
        return true;
    }
}

