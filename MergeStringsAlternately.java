public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int size = 0;
        String newStr = "";
        if(w1>w2){
            size = w1;
        }
        else{
            size = w2;
        }
        for(int i=0; i<size; i++){
            if(w1>0){
                newStr += word1.charAt(i);
                w1--;
            }
            if(w2>0){
                newStr += word2.charAt(i);
                w2--;
            }
        }
        return newStr;
    }
}
