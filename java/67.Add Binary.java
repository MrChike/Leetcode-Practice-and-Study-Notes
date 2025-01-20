// https://leetcode.com/problems/add-binary/description/?envType=problem-list-v2&envId=ascc9wsi

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1; // Checking from backside
        int j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) carry += a.charAt(i--) - '0'; // Convert char to int
            if (j >= 0) carry += b.charAt(j--) - '0'; // Convert char to int
            
            sb.append(carry % 2); // Add the current bit to sb
            carry /= 2; // Update carry for next iteration
        }
        
        sb.reverse(); // Reverse sb to get the correct order
        return sb.toString();
    }
}

// import java.util.Arrays;

// class Solution {
//     public String addBinary(String a, String b) {
//         // split the string into individual parts
//         // starting from the right side add both strings individually
//         // if sum is greater than 1, assign zero and carry over one to the next summation
//         // if not update with summation which is one
//         // have a string to store each summation as cache
//         // return string when done

//         String[] arrA;
//         String[] arrB;
//         String cache = "";
//         // a = "10";

//         arrA = a.split("");
//         arrB = b.split("");
//         int c = Integer.parseInt(arrA[0]) + Integer.parseInt(arrB[0]);

//         if (c > 1) {
//             cache += 0;
//         } else {
//             cache += 1;
//         }
        
//         // System.out.println(Arrays.toString(arrA));
//         System.out.println(cache);
//         return "";
//     }
// }
