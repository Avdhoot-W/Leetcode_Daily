class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char s = magazine.charAt(i);
            if(!hm.containsKey(s)){
                hm.put(s,1);
            }else{
                hm.put(s,hm.get(s)+1);
            }
        }
        //System.out.println();

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(!hm.containsKey(c))
                return false;
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
            }
            if(hm.get(c) == 0)
                hm.remove(c);
        }
        return true;
    }
}