package shakti;

import java.util.HashSet;
import java.util.Set;

class hello {
	
    public static void main(String[] args)
    {
    	//getEvenString("It is pleasent");
    	String s ="GeeksForGeeks";
    	int count[] = new int[128];
    	for(int i=0;i<s.length();i++) {
    		count[s.charAt(i)]++;
    	}
    	
    	for(int i=0;i<s.length();i++) {
    		if (count[s.charAt(i)]==1) {
    			System.out.println(s.charAt(i)+" is the 1st non-repititive digit in the given String");
    			break;
    		}
    	}
    }
}