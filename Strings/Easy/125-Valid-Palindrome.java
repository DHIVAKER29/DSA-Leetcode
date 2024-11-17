class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder normalized = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                normalized.append(Character.toLowerCase(c));
            }
        }
        int l= 0, r = normalized.length()-1;
        while (l < r){
            if(normalized.charAt(l) != normalized.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}