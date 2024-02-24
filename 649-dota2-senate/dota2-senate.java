class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n = senate.length();
        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R'){
                r.add(i);
            }
            else{
                d.add(i);
            }
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek()){
                r.add(r.poll() + n++);
                d.poll();
            }
            else{
                d.add(d.poll() + n++);
                r.poll();
            }
        }
        if(r.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
       
        
    }
}

///   R D D R D D
///   0 1 2 3 4 5
///   r: 

///   d: 4 5 6

/// "R D"
/// r : 0
/// d : 1