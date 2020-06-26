package anshuKJun20;

import java.util.Scanner;

public class CharcterArray2 {
	static Scanner sc = new Scanner (System.in);
   public static void main(String[] args) {
	   CharcterArray2  characterarray = new CharcterArray2();
	  
	   characterarray.findOneCharacter ();
	   characterarray.findAllCharacter();
	   characterarray.findAllCharFreqFromArray();
	  }
   void findOneCharacter() {
	   int countfreq=0;
	    System.out.println("Enter your Name:");
	    String name = sc.next();
	    System.out.println("Give  character to find frequency ");
	    char ch = sc.next().charAt(0);
	   //for(int j= 0;j<str.length;j++) {
		  // String contFrequecy = namefrequency[j];
		    for(int i=0;i< name.length();i++) {
		           if(name.charAt(i) == ch) {
		        	   countfreq++;
		            }
		          }
	   
		    if(countfreq == 0) {
		    	System.out.println("Not found in this array");
		    }else {
		    	System.out.println(ch+"---->"+countfreq);
		     }
   }
  void findAllCharacter() {
	   System.out.println("enter  your name");
	    String name = sc.nextLine();
	    for(int i = 0;i< name.length();i++){
	    	 int allcharfreqcount=0;
	      for(int j=0;j<name.length();j++) {
	    		if(name.charAt(i)== name.charAt(j)) {
	    			allcharfreqcount++;
	    		}
	    	}
	         System.out.println(name.charAt(i)+"-->"+allcharfreqcount);
	      }
	    }
	  void findAllCharFreqFromArray() {
		   System.out.println("How many elements do you want to enter?");
	   int elements = sc.nextInt();
	   String[] namefrequency = new String[elements];
	     for(int j= 0;j<namefrequency.length;j++) {
	    	 System.out.println("Enter Your Name");
	    	 namefrequency[j]= sc.next();
	     }
	           for(int k =0; k<namefrequency.length;k++) {
	        	   String name=namefrequency[k];
	        	   for(int i = 0;i< name.length();i++){
	      	    	 int allcharfreqcount=0;
	      	      for(int j=0;j<name.length();j++) {
	      	    		if(name.charAt(i)== name.charAt(j)) {
	      	    			allcharfreqcount++;
	      	    		}
	      	    	}
	      	         System.out.println(name.charAt(i)+"-->"+allcharfreqcount+"times in "+name);
	      	         
	      	      }
	        	   System.out.println("[===================================================");
	    	  }
	     }
		 
	  }     
	       
	        
	   
  


