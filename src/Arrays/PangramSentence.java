package Arrays;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence){
        char[] arr = sentence.toCharArray();
        for(char i = 'a'; i <= 'z'; i++){
            boolean ans = false;
            for(int j = 0; j< arr.length; j++){
                if(i==arr[j]){
                    ans = true;
                    break;
                }
            }
            if(ans==false){
                return false;
            }
        }
        return true;
    }
}
