class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(int i = 0; i < sentences.length; i++){
            int counter = 0;
            
            for(int j = 0; j < sentences[i].length(); j++){
                
                if(sentences[i].charAt(j) == ' '){
                    counter++;
                }
                       
            }
            
            if(max<counter+1){
                max = counter+1;
            }
            
        }
        
        return max;
        
        
    }
}