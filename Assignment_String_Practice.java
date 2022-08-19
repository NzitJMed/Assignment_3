import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;


class Question_1 {
    public void stringReverse() {

        String normalWord = "iNeuron";
        int theLength = normalWord.length(); // I define the length of the word
        String reverseWord = "";    // We declare the reverse word

        /**Summary regarding the for loop in this exercise.You will see that i= theLength -1, because
         * in Java we start counting from index zero, suppose the length of the word is 6 in normal counting however
         * in Java is 5 that why we have to reduce the length by 1.Later i >=0 because if i ==0 then the condition
         * will be false. we also declare i-- that means we have to decrement :
         * NB: to reverse the character we used: reverseWord= reverseWord + normal.chart(i), this will extract the
         * character and add it into the reserve word. */

        for (int i = theLength - 1; i >= 0; i--) {
            reverseWord = reverseWord + normalWord.charAt(i);
        }
        System.out.println("Input: " + normalWord);
        System.out.println("Ouput: "  + reverseWord);

    }
}

class Question_2 {
    /**
     * Write a program to reverse a sentence while preserving the position.
     * Procedure: We start by declaring reserveString and initialize it by null,
     * we also declare our string variable named ourString, after declaring we split
     * we use the for loop to insert all elements into the splitting to new
     * variable named phrase. we declare and initialize a reverse phrase.
     * We use the second loop for reversing our phrase values and insert
     * them into the new reverse phrase created previously. After that we can
     * now insert this reverse elements into our reverse string.

     */
    public void stringReverse_2() {
        String reverseString=""; // We initialize the reverse string to null
        String ourString="Think Twice";
        // Let's start splitting our string using array
        String []phrases= ourString.split(" ");
        for(int i=0; i< phrases.length;i++){
            String phrase=phrases[i]; // we insert  and store all split words into phrase
            String reversePhrase= " ";
            // Let's now reverse the word that is stored in phrase
            for( int j=phrase.length()-1; j>=0;j--){
                reversePhrase+=phrase.charAt(j);

            }
            // Time to insert this reserve value into the reverseString
            reverseString=reverseString+ reversePhrase;

        }
        System.out.println("Input: " + ourString);
        System.out.println("Output: " + reverseString);


    }
}

class Question_3 {
    public void anagramOrNot() {
        /** We start by prompting the user to enter the two words of phrases that will be checked.*/

        String firstWord = "listen";
        String secondWord = "silent";

        char[] char1 = firstWord.toCharArray();
        Arrays.sort(char1);
        char[] char2 = secondWord.toCharArray();
        Arrays.sort(char2);

        if (char1.length != char2.length) {
            System.out.println(firstWord + " and " + secondWord + " are not Anagram");
            System.exit(0);
        }
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i]) {
                System.out.println(firstWord + " and " + secondWord + " are not Anagram");
            }
        }
        System.out.println(firstWord + " and " + secondWord + " are Anagram");


    }
}

class Question_4 {
    public void pangramOrNot() {

        String sentence="The quick brown fox jumps over the lazy dog";
        int numOfEnglishApl=26;

        int index=0;
        boolean[]countLetter= new boolean[numOfEnglishApl];
        boolean pangram=true;
        /**We need to explain the for loop. we declare character to loop through the sentence by giving the position
         * of each letter regarding the english alphabet, for example  a= 0, b=1,c=3 and so on ..*/
        for(int i=0; i<sentence.length();i++){
            char character=sentence.charAt(i);
            if(character>='A' && character<='Z'){
                index=sentence.charAt(i)-'A';
            }else if(character>='a' && character<='z'){
                index=sentence.charAt(i)-'a';

            }
            countLetter[index]=true;

        }
        /**After finishing with the first loop, we want by this loop to check if our sentence satisfied the number
         * of 26 letter of the alphabet*/
        for( int i=0; i<countLetter.length;i++){
            if(countLetter[i]==false){
                pangram=false;
                System.out.println();
            }

        }
        if(pangram){
            System.out.println(sentence + ":  IS A PANGRAM,");
        }else{
            System.out.println("Unfortunately your sentence IS NOT A PANGRAM. ");

        }

    }

}



class Question_5{
    public  void repeatedlyOccurringChar(){
        String str="Maximum occurring character in the string";
        int count;
        char []strChar=str.toCharArray();
        for(int i=0; i<strChar.length;i++){
            count=1;
            for(int j=i+1;j<strChar.length;j++){
                if(strChar[i]==strChar[j] && strChar[i]!= ' '){
                    count++;
                    strChar[j]='o';
                }
            }
            if(count>1 && strChar[i]!='o'){
                System.out.println("The repeatedly characters are: " + strChar[i] );

            }


        }



    }

}
class Question_6{
    public  void sortStringAlphabet(){
        /**We are going to write a program that sort string alphabetically
         * without using the sort() method.
         * 1- We are going to import java.lang.*; for StringBuilder
         * 2- We convert the string to an array with help of the toCharArray() method of
         * the string class
         * 3-We use nested loop to check for swapping elements of an array
         * 4-Print these characters array elements.*/
        StringBuilder view= new StringBuilder(); // will be used to append characters from our array to string
        String originalString="representation alphabetically";
        char []myArray=originalString.toCharArray(); // String is converted into an array
        // Apply the nested loop to compare characters in myArray
        char temp; // This char variable will be used for swapping
        int j=0;
        while(j<myArray.length){
            int k= j+1;
            while(k<myArray.length){
                if(myArray[k]<myArray[j]){
                    /** NB:Now we can compare our characters from our array one after one
                     * But remarque here we are comparing characters in myArray, that means
                     * we will at the end append these characters together to have a string
                     * by using StringBuilder*/
                    temp=myArray[j];
                    myArray[j]=myArray[k];
                    myArray[k]=temp;



                }
                k+=1;
            }
            j+=1;

        }
        view.append(myArray); // We are appending characters to string
        System.out.println("This is the original string : " +originalString);
        System.out.println("This is the sorted string alphabetically: " + view);



        }





}
class Question_7{
    /**The task of this program is to count the total number of vowels and consonants for a giving string
     * 1-We start to declare consonants and vowels variables that
     * 2-*/
    public void countNumOfVowelAndCons(){
        int numberOfVowel=0;
        int numberOfConsonant=0;
        String ourString="Nzitoukoulou";
        /** The best way is to convert our string to low case that will make it easy to apply our comparison*/
        ourString=ourString.toLowerCase();
        for( int i=0; i<ourString.length();i++){
            if(ourString.charAt(i)=='a' ||ourString.charAt(i)=='i'||ourString.charAt(i)=='u'||ourString.charAt(i)=='e'||ourString.charAt(i)=='o'){
                numberOfVowel++; // We increment the number of vowels
            }else if (ourString.charAt(i)>='a' && ourString.charAt(i)<='z'){
                numberOfConsonant++; // We increment the number of consonants
            } else{
                System.out.println(ourString +" is not a String");
                System.exit(0);
            }
        }
        // We can now display the number of vowels and consonants found in our string
        System.out.println("The word " + ourString + "  has " + numberOfVowel + " vowels and " + numberOfConsonant + " consonants");

    }


}
class Question_8{
    /**We are going to write a code that will count number of special characters*/
    public  void countNumOfSpecialChar(){
        int specialCharacters=0; // We initialize our variable
        char character;
        String theString="il/*#&@vraie";
        for(int i=0;i<theString.length();i++){
            character=theString.charAt(i);
            if(!Character.isLetter(character)){ // To check if characters are letter or not;
                specialCharacters++; // So as long as characters are not letters increment these special characters
            }
        }
        System.out.println("Our sentence is : " + theString + "There are  " + specialCharacters +" special characters in this sentence" );


    }

}


public class Assignment_String_Practice {
    public static void main(String[] args) {
        Question_1 obj1 = new Question_1();
        System.out.println("Question 1");
        obj1.stringReverse();
        System.out.println();

        Question_2 obj2 = new Question_2();
        System.out.println("Question 2");
        obj2.stringReverse_2();
        System.out.println();

        Question_3 obj3 = new Question_3();
        System.out.println("Question 3");
        obj3.anagramOrNot();
        System.out.println();

        Question_4 obj4 = new Question_4();
        System.out.println("Question 4");
        obj4.pangramOrNot();
        System.out.println();

        Question_5 obj5 = new Question_5();
        System.out.println("Question 5");
        obj5.repeatedlyOccurringChar();
        System.out.println();

        Question_6 obj6 = new Question_6();
        System.out.println("Question 6");
        obj6.sortStringAlphabet();
        System.out.println();

        Question_7 obj7 = new Question_7();
        System.out.println("Question 7");
        obj7.countNumOfVowelAndCons();
        System.out.println();

        Question_8 obj8 = new Question_8();
        System.out.println("Question 8");
        obj8.countNumOfSpecialChar();


    }
}
