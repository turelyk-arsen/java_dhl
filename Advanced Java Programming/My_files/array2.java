import java.util.Scanner;

public class array2 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the phrase: ");
        String word = scan.nextLine();

        System.out.println("Enter word");
        String letterWord = scan.nextLine();

        char lettersPhase[] = word.toCharArray();

        char lettersWord[] = letterWord.toCharArray();

        int currentLetter = 0;
        boolean present = false;

        System.out.println(word);
        for (int i = 0; i < lettersPhase.length; i++) {
           //new_string += array[i];
           // first example
           //if( letter[i] == 's') {
            //System.out.println("hello");

            // second example
            if(lettersPhase[i] == lettersWord[0]) {
                    currentLetter = 0;
                    for (int j = i; j < lettersWord.length + i; j++) {
                        if(lettersPhase[j] == lettersWord[currentLetter]) {
                            present = true;
                            currentLetter++;
                        } else {
                            present = false;
                            j = lettersWord.length + i;
                        }
                    }
            }
            if (present) {
                i = lettersPhase.length;
                System.out.println("the word " + letterWord + " is found.");
            } 
           }
           
            if (present == false)
            {
                System.out.println("the word " + letterWord + " is NOT found.");
            }
           System.out.println("over");
        }
    }

