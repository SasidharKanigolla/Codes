// class Solution {
//     public String replaceDigits(String s) {
//         String ans="";
//         for(int i=0;i<s.length();i++)
//         {
//             if(i%2!=0)
//             {
//                 ans+=(char)((s.charAt(i-1)-'0')+(s.charAt(i)-'0')+48);
//             }
//             else ans+=s.charAt(i);
//         }
//         return ans;
//     }
// }
class Solution {
    public String replaceDigits(String s) {
    var character=s.toCharArray();
	for (var i = 1; i < character.length; i +=2)
		character[i] += character[i - 1]-'0';
		
	return new String(character);
    }
}