package com.imode.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class JavaAlgorithms {


     public static void main(String[] args)

    {
        //sortNumbers();
        //String result = StringBufferStringReverse();
        //System.out.println("Result " + result);
        countCharacterOccurences();
    }

    //Method to Sort Numbers
    private static ArrayList<Integer> sortNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        //using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
        return numbers;
    }

    //Method to shuffle numbers
    private static ArrayList<Integer> shuffleNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        //using the sort() method
        Collections.shuffle(numbers);
        System.out.println("Shuffle ArrayList: " + numbers);
        return numbers;
    }

    //Method to reverse numbers
    private static ArrayList<Integer> reverseNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        //using the sort() method
        Collections.reverse(numbers);
        System.out.println("Reverse ArrayList: " + numbers);    //[3,2,4]
        return numbers;
    }

    //Method to swap numbers
    private static ArrayList<Integer> swapNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("Unsorted ArrayList: " + numbers);

        //using the sort() method
        Collections.swap(numbers, 0, 1);
        System.out.println("Swap ArrayList: " + numbers);    //[1,2]
        return numbers;
    }

    //Method to addAll numbers
    private static ArrayList<Integer> addAllNumbers()
    {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("Unsorted ArrayList: " + numbers);

        //using the sort() method
        //Collections.swap(numbers, 0, 1);
        System.out.println("AddAll Numbers ArrayList: " + newNumbers);    //[1,2]
        return newNumbers;
    }


    //Method to fill numbers
    private static ArrayList<Integer> fillNumbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("Unsorted ArrayList: " + numbers);

        //using the fill() method
        Collections.fill(numbers, 0);
        System.out.println("fillNumbers ArrayList: " + numbers);    //[0, 0]
        return numbers;
    }


    //Method to copy() numbers - Not Working
    private static ArrayList<Integer> copyNumbers()
    {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        //System.out.println("Unsorted ArrayList: " + numbers);

        //using the copy() method
        newNumbers.addAll(numbers);
        Collections.copy(newNumbers, numbers);
        System.out.println("CopyNumbers ArrayList: " + newNumbers);    //[0, 0]
        return newNumbers;
    }

    //binarySearch
    private static String binarySearch()
    {
        String result = "the position of 3 is ";
        Integer pos = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //Using binarySearch()
        pos = Collections.binarySearch(numbers, 3);
        System.out.println("binarySearch : the position of 3 is " + pos);
        return result + pos;
    }

    //private static ArrayList<Integer> iteratorMethod()
    private static void iteratorMethod()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("iteratorMethod ArrayList : " + numbers);

        Iterator<Integer> iterate = numbers.iterator();

        //using the next() method
        int number = iterate.next();
        System.out.println("iteratorMethod next() Accessed Element : " + number);

        //using the remove() method
        iterate.remove();
        System.out.println("iteratorMethod remove() Element : " + number);
        System.out.println("iteratorMethod Updated ArrayList() ");

        //using the hasNext method
        while(iterate.hasNext())
            //using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.println(value + ","));
    }

    //StringBufferReverse
    private static String StringBufferStringReverse()
    {
        String result = "";
        String blogName = "java2blog";
        StringBuffer sb = new StringBuffer(blogName);
        result = sb.reverse().toString();
        return result;
    }

    private static void countCharacterOccurences()
    {
        String input = "aaaabbccAAdd";
        char search = 'a';  //Character to search is a
        int count = 0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }

        System.out.println("The Character '"+search+"' appears " + count+" times");

    }





}
