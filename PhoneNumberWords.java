import java.util.*;

public class PhoneNumberWords {
 
    /**
     * @author Siva
     * @param args
     */
     
    static int[] phoneNumb = {2,3,4};
    static int length = 3;
     
    public static void main(String[] args) {
         
        char[] out = new char[7];
        printWord(phoneNumb, out, 0);
 
    }
     
    public static void printWord(int[] phoneNumb, char[] out, int recLevel){
        if(recLevel==length){ //base case in recursion
            System.out.println(out);
            return;
        }
        for(int i=1;i<=4;i++){ //recursive case in recursion
            if(i==4 && (phoneNumb[recLevel]!=7 && phoneNumb[recLevel]!=9)) //special case for number 7 and 9 as it has 4 possible chars
                continue;
            out[recLevel] = getChar(phoneNumb[recLevel],i) ;
            printWord(phoneNumb, out, recLevel+1);
        }
             
    }
 
    public static char getChar(int digit, int number){
        if(digit<1 || digit>9 || number<1 || number>4){ //validation case
            return 0;
        }
        switch(digit){
        case 2:
            if(number==1)
                return 'a';
            else if(number==2)
                return 'b';
            else if(number==3)
                return 'c';
            else
                return 0;
        case 3:
            if(number==1)
                return 'd';
            else if(number==2)
                return 'e';
            else if(number==3)
                return 'f';
            else
                return 0;
        case 4:
            if(number==1)
                return 'g';
            else if(number==2)
                return 'h';
            else if(number==3)
                return 'i';
            else
                return 0;
        case 5:
            if(number==1)
                return 'j';
            else if(number==2)
                return 'k';
            else if(number==3)
                return 'l';
            else
                return 0;
        case 6:
            if(number==1)
                return 'm';
            else if(number==2)
                return 'n';
            else if(number==3)
                return 'o';
            else
                return 0;
        case 7:
            if(number==1)
                return 'p';
            else if(number==2)
                return 'q';
            else if(number==3)
                return 'r';
            else
                return 's';
        case 8:
            if(number==1)
                return 't';
            else if(number==2)
                return 'u';
            else if(number==3)
                return 'v';
            else
                return 0;
        case 9:
            if(number==1)
                return 'w';
            else if(number==2)
                return 'x';
            else if(number==3)
                return 'y';
            else
                return 'z';
             
            default:break;
        }
        return 0;
    }
     
}