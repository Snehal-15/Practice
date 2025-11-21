package practice.dsa;

public class EvenLengthWords {

    public static void main(String args[]){
        String sentence = "Hi this is Check of Even Length";
        String[] words = sentence.split(" ");

        for(int i=0; i<words.length; i++){
            if(words[i].length()%2 == 0){
                System.out.println(words[i]);
            }

        }

    }
}
