package javaapp1;

/**
 *
 * @author Jorgesys
 */
public class myProject {

    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstNonRepeating(str);
        System.out.println("index: " + index);
    }

    //Version A
    static int firstNonRepeating(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);        
            int counter = 0;
            for (int j = 0; j < str.length(); j++){              
                if(Character.compare(c,str.charAt(j)) == 0){ //are equals.
                  counter++;   
                }  
            }
            if(counter ==1){
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    //Version B
    static int firstNonRepeating2(String str) {
        getCharCountArray(str);
        int index = -1, i;

        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    static void getCharCountArray(String str) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
    }

}
