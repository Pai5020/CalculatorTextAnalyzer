public class TextAnalyzer {

    public int  wordcount(String text){
        String[] words = text.trim().split("\\s");
        int num = words.length;
        return num;
    }

    public int Countcharacters(String text){
        return text.length();
    }

    public int Countvowels(String text){
        int count = 0;
        for(int i=0; i < text.length();i++){
            char txt = text.charAt(i);
            if(txt=='a' || txt == 'e' || txt == 'i' || txt == 'o' || txt == 'u'|| txt == 'A' || txt == 'E'|| txt == 'I'|| txt == 'O' || txt == 'U'){
                count++;
            }
        }
        return count;
    }

}
