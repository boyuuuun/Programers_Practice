package P_kakao2020_문자열압축;

import java.util.ArrayList;

public class Solution {
	String answer_string = "";

    public int solution(String s) {
        int len = s.length();
        int answer = len;
        
        
        for(int n=len/2; n>0; n--) {
        	ArrayList<String> res = new ArrayList<>(); // string of result
            int res_i = 0; // index to insert next in 'res' 
            String prev = "";
            int index = 0;
            
            while(index < len) {
            	String str = "";
            	if(len-index < n)
            		str = s.substring(index, len);
            	else
            		str = s.substring(index, index+n);
                if(prev.equals(str)) {
                    res.set(res_i-2, Integer.toString(Integer.parseInt(res.get(res_i-2))+1));
                } else {
                	prev = str;
                	res.add(res_i, "1"); // insert count of str
                	res.add(res_i+1, str); // insert str
                	res_i += 2;
                }
                index += n;
            }
            
            String res_string = "";
            for(int i=0; i<res.size(); i++) {
            	if(res.get(i)=="1") continue;
            	res_string += res.get(i);
            }
            
            if(answer >= res_string.length()) {answer = res_string.length(); answer_string = res_string;}
        }
        return answer;
    }
}
