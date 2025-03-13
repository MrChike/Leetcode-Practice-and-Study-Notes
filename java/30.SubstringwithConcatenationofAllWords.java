// https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/?envType=problem-list-v2&envId=20w3ezf2

import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        
        // Edge case: If words is empty or s is too short, return empty result
        if (words == null || words.length == 0 || s.length() < words.length * words[0].length()) {
            return result;
        }
        
        // The length of each word and the total number of words
        int wordLen = words[0].length();
        int wordsLen = words.length;
        int totalLen = wordLen * wordsLen;
        
        // Create a frequency map of the words
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        // Iterate over each possible starting point of the substring
        for (int i = 0; i < wordLen; i++) {  // Sliding window offset based on word length
            int left = i;
            int right = i;
            Map<String, Integer> currentWordCount = new HashMap<>();
            
            while (right + wordLen <= s.length()) {
                // Extract the next word in the window
                String word = s.substring(right, right + wordLen);
                right += wordLen;
                
                // If the word is in the wordCountMap, process it
                if (wordCountMap.containsKey(word)) {
                    // Increment the count of this word in the current window
                    currentWordCount.put(word, currentWordCount.getOrDefault(word, 0) + 1);
                    
                    // If we have more of this word than needed, move the left pointer
                    while (currentWordCount.get(word) > wordCountMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentWordCount.put(leftWord, currentWordCount.get(leftWord) - 1);
                        left += wordLen;
                    }
                    
                    // If the window size matches totalLen, we found a valid substring
                    if (right - left == totalLen) {
                        result.add(left);
                    }
                } else {
                    // If the word is not in the word list, reset the window
                    currentWordCount.clear();
                    left = right;
                }
            }
        }
        
        return result;
    }
}
