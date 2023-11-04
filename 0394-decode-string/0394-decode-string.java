// class Solution {
//     public String decodeString(String s) {
//         String res="";
//         Stack<Integer> co = new Stack<>();
//         Stack<String> re = new Stack<>();
//         int i=0;
//         while(i<s.length())
//         {
//             if(Character.isDigit(s.charAt(i)))
//             {
//                 int c=0;
//                 while(Character.isDigit(s.charAt(i)))
//                 {
//                     c=c*10+(s.charAt(i)-'0');
//                     i++;
//                 }
//                 co.add(c);
//             }
//             else if(s.charAt(i)=='[')
//             {
//                 re.add(res);
//                 res="";
//                 i++;
//             }
//             else if(s.charAt(i)==']')
//             {
//                 StringBuilder temp = new StringBuilder(re.pop());
//                 for(int j=0;j<co.pop();j++)
//                 {
//                     temp.append(res);
//                 }
//                 res=temp.toString();
//                 i++;
//             }
//             else
//             {
//                 res+=s.charAt(i);
//                 i++;
//             }
//         }
//         return res;
//     }
// }
public class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;
    }
}