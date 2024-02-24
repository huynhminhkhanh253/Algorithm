class Solution {
    public String decodeString(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<String> letters = new Stack<>();
        String string = "";    
        int i = 0;
        
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count2 = 0;
                while(Character.isDigit(s.charAt(i))){
                    count2 = count2*10 + (s.charAt(i) - '0');
                    i++;
                }
                number.push(count2);
                //i++;
            }
            else if(s.charAt(i) == '['){
                letters.push(string);
                string = "";
                i++;
            }
            else if(s.charAt(i) == ']'){
                int count = number.pop();
                StringBuilder temp =  new StringBuilder(letters.pop());  
                for(int n = 0; n < count; n++){
                    temp.append(string);
                }
                string = temp.toString();
                i++;
            }
            else{
                string += s.charAt(i);
                i++;
            }
        }
        return string;
    }
}


//   "3 [a 2 [ c ]  ] "
//               i   
// stack num  = 3, 2
// stack letters = a , c
// string = a 
// string builder  
// temp = 