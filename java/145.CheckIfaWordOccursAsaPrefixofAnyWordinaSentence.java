// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/?envType=problem-list-v2&envId=2o6pxcih

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Two pointers: one for traversing the sentence and another for checking prefix
        
        // Split the sentence into words by spaces
        int n = sentence.length();
        int m = searchWord.length();
        
        // Pointer 1: Traverse through the sentence word by word
        int i = 0;  // Pointer to start of the word in sentence
        int wordIndex = 1;  // 1-indexed word count
        
        while (i < n) {
            // Pointer 2: Find the end of the current word
            int j = i;
            while (j < n && sentence.charAt(j) != ' ') {
                j++;
            }
            
            // Now, sentence.substring(i, j) is the current word
            
            // String matching: check if searchWord is a prefix of the current word
            if (j - i >= m && sentence.substring(i, i + m).equals(searchWord)) {
                return wordIndex;
            }
            
            // Move i to the next word
            i = j + 1;
            wordIndex++;
        }
        
        // If no word starts with searchWord, return -1
        return -1;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test the function with an example
        System.out.println(solution.isPrefixOfWord("i love eating burger", "burg"));  // Output: 4
        System.out.println(solution.isPrefixOfWord("this problem is an easy problem", "pro"));  // Output: 2
        System.out.println(solution.isPrefixOfWord("i am tired", "you"));  // Output: -1
    }
}



// import java.util.Arrays;

// class Solution {
//     public int isPrefixOfWord(String sentence, String searchWord) {
//         String[] splitSentence = sentence.split(" ");

//         for (int c = 0; c < splitSentence.length; c++) {
//             if (splitSentence[c].contains(searchWord)) {
//                 System.out.println("Match Found");
//                 return c+1;
//             }
//         } 
//         return -1;
//     }
// }

// // Split the sentence into an Array
// // Loop throgh the String sentence
// // Compare if each iteration matchs the searchWord
// // retrun the occurence length when matched
// // or -1 if there is no match
// // Can't think of any edge case and would confirm that later
