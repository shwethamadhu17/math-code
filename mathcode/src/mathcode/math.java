package mathcode;


	import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Random;


	public class math {
		public static int addnum1;
		public static int addnum2;
		public static int addnum_result;
		public static void main(String[] args) throws FileNotFoundException, IOException {
	    
			
		//Single Digit Additions	
	PrintWriter out_add = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Addition_Single_Digit.txt", true)));
		    
		    Random add1 = new Random();
		    Random add2 = new Random();
		    //int addnum1;
		    //int addnum2;
		    
		    System.out.println("Add these two numbers :");
		    for (int idx = 1; idx <= 100; ++idx){
		       addnum1 = add1.nextInt(10);
		       addnum2 = add2.nextInt(10);
		       //addnum_result = addnum1 + addnum2;
		      System.out.println(addnum1  + " + " + addnum2 );
		      System.out.println();
		      out_add.println( idx + ".   "+ addnum1  + " + " + addnum2 );
		      out_add.println();
		      //out_add.println("the answer is:" + addnum_result);
		     // out_add.println();
		     
		    }
		    out_add.close();
		    
		    
		  //Double Digit Additions	
		    PrintWriter out_add2 = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Addition_Double_Digit.txt", true)));
		    	    
		    	    Random add12 = new Random();
		    	    Random add22 = new Random();
		    	    int addnum12;
		    	    int addnum22;
		    	    System.out.println("Add these two numbers :");
		    	    for (int idx = 1; idx <= 100; ++idx){
		    	       addnum12 = add12.nextInt(100);
		    	       addnum22 = add22.nextInt(100);
		    	       if (addnum12 <10) addnum12 = addnum12 +10;
		    	       if (addnum22 <10) addnum22 = addnum22 +10;
		    	      System.out.println(addnum12  + " + " + addnum22 );
		    	      System.out.println();
		    	      out_add2.println( idx + ".   "+ addnum12  + " + " + addnum22 );
		    	      out_add2.println();
		    	     
		    	    }
		    	    out_add2.close();
		    	    
		  // Single digit Subtractions  
		  PrintWriter out_sub = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Subtract_Single_Digit.txt", true)));
		    	    
		    Random sub1 = new Random();
		    Random sub2 = new Random();
		    int subnum1;
		    int subnum2;
		    int temp2;
		    System.out.println("Subtract these two numbers :");
		    for (int idx = 1; idx <= 100; ++idx){
		       subnum1 = sub1.nextInt(10);
		       subnum2 = sub2.nextInt(10);
		       
		       if (subnum1 == 0)subnum1 = 9;

		       if ( subnum1 <  subnum2){
		    	   temp2 =  subnum1;
		    	   subnum1 =  subnum2;
		    	   subnum2 = temp2;
		       }
		       
		      System.out.println(subnum1  + " - " + subnum2 );
		      System.out.println();
		      out_sub.println( idx + ".   "+ subnum1  + " - " + subnum2 );
		      out_sub.println();
		     
		    }
		    out_sub.close();

			  // Double digit Subtractions  
			  PrintWriter out_sub2 = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Subtract_Double_Digit.txt", true)));
			    	    
			    Random sub12 = new Random();
			    Random sub22 = new Random();
			    int subnum12;
			    int subnum22;
			    int temp22;
			    System.out.println("Subtract these two numbers :");
			    for (int idx = 1; idx <= 100; ++idx){
			       subnum12 = sub12.nextInt(100);
			       subnum22 = sub22.nextInt(100);
			       
			       if (subnum12 <10) subnum12 = subnum12 +10;
	    	       if (subnum22 <10) subnum22 = subnum22 +10;
	    	       
			       
			       if ( subnum12 <  subnum22){
			    	   temp22 =  subnum12;
			    	   subnum12 =  subnum22;
			    	   subnum22 = temp22;
			       }
			       
			      System.out.println(subnum12  + " - " + subnum22 );
			      System.out.println();
			      out_sub2.println( idx + ".   "+ subnum12  + " - " + subnum22 );
			      out_sub2.println();
			     
			    }
			    out_sub2.close();

			
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Multiply_Double_Single_Digit.txt", true)));
		    
		    Random randomNum1 = new Random();
		    Random randomNum2 = new Random();
		    int num1;
		    int num2;
		    System.out.println("Multiply these two numbers :");
		    for (int idx = 1; idx <= 100; ++idx){
		       num1 = randomNum1.nextInt(100);
		       num2 = randomNum2.nextInt(10);
		       
		      System.out.println(num1  + " X " + num2 );
		      System.out.println();
		      out.println( idx + ".   "+ num1  + " X " + num2 );
		      out.println();
		     
		    }
		    out.close();
	PrintWriter out_mul_double = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Multiply_Double_Double_Digit.txt", true)));
		    
		    Random randomNum1_1 = new Random();
		    Random randomNum2_2 = new Random();
		    int num1_1;
		    int num2_2;
		    System.out.println("Multiply these two numbers :");
		    for (int idx = 1; idx <= 100; ++idx){
		    	num1_1 = randomNum1_1.nextInt(100);
		    	num2_2 = randomNum2_2.nextInt(100);
		       
		      System.out.println(num1_1  + " X " + num2_2 );
		      System.out.println();
		      out_mul_double.println( idx + ".   "+ num1_1  + " X " + num2_2 );
		      out_mul_double.println();
		     
		    }
		    out_mul_double.close();
		    
	PrintWriter out_mult = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Multiply_Single_Digit.txt", true)));
		    
		    Random randomNum1s = new Random();
		    Random randomNum2s = new Random();
		    int num1s;
		    int num2s;
		    System.out.println("Multiply these two numbers :");
		    for (int idx = 1; idx <= 100; ++idx){
		       num1s = randomNum1s.nextInt(10);
		       num2s = randomNum2s.nextInt(10);
		       
		      System.out.println(num1s  + " X " + num2s );
		      System.out.println();
		      out_mult.println( idx + ".   "+ num1s  + " X " + num2s );
		      out_mult.println();
		     
		    }
		    out_mult.close();
		    

		    
		    PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\bmastaff\\worksheets\\Divide_Double_Single_Digit.txt", true)));
		    //note a single Random object is reused here
		    Random randomDivisor = new Random();
		    Random randomDividend = new Random();
		    int div1;
		    int div2;
		    int temp = 0;
		    System.out.println();
		    System.out.println("Divide these two numbers :" );
		    System.out.println();
		    

	        
		    
		    for (int idx = 1; idx <= 100; ++idx){
		       div1 = randomDivisor.nextInt(100);
		       div2 = randomDividend.nextInt(10);
		       if (div1 == 0) div1 = 3;
		       if (div2 == 0) div2 = 2;
		       if (div1<div2){
		    	   temp = div1;
		    	   div1 = div2;
		    	   div2 = temp;
		       }
		       
	          System.out.println( idx + div1+ " " + new String(Character.toChars(0x00F7)) + " " + div2 );	 
	          System.out.println();
		      out2.println( idx + div1+ " " + new String(Character.toChars(0x00F7)) + " " + div2 );
		      out2.println();
		     
		    }
		    out2.close();
		}
	}


