import java.util.*;

public class UserName {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
       String[] db = new String[4];
	 
		db[0] = "Darpan"; db[1] = "Darpan1"; db[2] = "heli"; db[3] = "shah";
		
		String n = "Darpan";
		int number = 0; 
        String name = n;

        boolean found = false; 
        do 
        { 
            found = false; 
            for (int i=0; i < db.length; i++) 
            { 
                if (db[i].equals(name)) 
                { 
                    found = true; 
                    break; 
                } 
				System.out.println("loop");
            } 

            if (found) 
            { 
                number++; 
				System.out.println("Found is :" + found + "");
                name = n + number; 
            } 

        } while(found); 

       System.out.println("The result is : " + name);
	 
    }
     
   
}