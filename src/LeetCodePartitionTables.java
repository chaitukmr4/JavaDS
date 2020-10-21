////A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
////
////
////
////        Example 1:
////
////        Input: S = "ababcbacadefegdehijhklij"
////        Output: [9,7,8]
////        Explanation:
////        The partition is "ababcbaca", "defegde", "hijhklij".
////        This is a partition so that each letter appears in at most one part.
////        A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
////
////
////
////        Note:
////
////        S will have length in range [1, 500].
////        S will consist of lowercase English letters ('a' to 'z') only.
//
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//public class LeetCodePartitionTables {
//    public List<Integer> partitionLabels(String s) {
//
//        HashMap<Character, int[]> map = new HashMap<>();
//        int i = 0;
//
//        for(char c : s.toCharArray()) {
//            int[] range = map.getOrDefault(c, new int[]{-1, -1});
//
//            if(range[0] == -1) {
//                range[0] = i;
//                range[1] = i;
//            }
//            else
//                range[1] = i;
//            i++;
//            map.put(c, range);
//        }
//
//        for(Map.Entry<Character, int[]>)
//
//    }
//}
