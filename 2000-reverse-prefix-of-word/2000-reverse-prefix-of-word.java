class Solution {
    public String reversePrefix(String word, char ch) {
        String result = "";
        int after = Integer.MAX_VALUE;

        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i)==ch){
                for (int j = i; j>=0; j--){
                    result+=word.charAt(j);
                }
                after = i+1;
                break;
            }
            if(i==word.length()-1){
                return word;
            }
        }

        if(after!=word.length()){
            for (int i = after; i < word.length(); i++){
                result+=word.charAt(i);
            }
        }

        return result;
    }
}