class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arrIdx1 = 0, arrIdx2 = 0; // index within word1 and word2
        int charIdx1 = 0, charIdx2 = 0; // index within current string

        while (arrIdx1 < word1.length && arrIdx2 < word2.length) {
            String s1 = word1[arrIdx1];
            String s2 = word2[arrIdx2];

            if (s1.charAt(charIdx1) != s2.charAt(charIdx2)) {
                return false;
            }

            charIdx1++;
            if (charIdx1 == s1.length()) {
                charIdx1 = 0;
                arrIdx1++;
            }

            charIdx2++;
            if (charIdx2 == s2.length()) {
                charIdx2 = 0;
                arrIdx2++;
            }
        }

        // Both arrays must be completely exhausted to represent identical strings
        return arrIdx1 == word1.length && arrIdx2 == word2.length;
    }
}