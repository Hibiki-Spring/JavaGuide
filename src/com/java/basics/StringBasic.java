package com.java.basics;

//import com.sun.org.apache.xpath.internal.operations.String;
//import javax.print.DocFlavor;

public class StringBasic {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * StringBuffer和StringBuilder区别
     */
    public void StringBB(){
        StringBuffer hello = new StringBuffer("hello");
        StringBuilder what = new StringBuilder("what");
        String abc = new String("abc");
//        new DocFlavor.STRING("abc");
    }

}
