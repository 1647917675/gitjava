package com.test.base;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
       for (int i = 1; i < 10000; i++) {
		
    	   if(i % 2 == 0) continue;
    	   
    	   if(i%3== 0 && i%9 == 0 && i%7 == 0 && i%2==1 && i%4 ==1 && i%5== 4 && i%8 == 1 && i%6 == 3) System.err.println(i);
		
	}
    }

static void test(){
	System.out.println("just for test"
			+ ""
			+ "");
}
}