package com.example.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public int square(int x){
        return x*x;
    }

    public int countA(String word){
        int count = 0;
        // return 0 if word == null && word.isEmpty
        if(word == null || word.isEmpty()){
            return 0;
        }
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }
}
