package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.*;

public class ReverseLines {

    private static Deque<String> inputStack = new ArrayDeque<>();;

    public static void main(String[] args) {

        System.out.println("Enter multiple lines. Press enter twice to reverse the lines!");

        final Scanner input = new Scanner(System.in);
        String line;

        while (input.hasNextLine()) {
            line = input.nextLine();
            if (line.equals("")) {
                break;
            } else {
                fillStack(line);
            }
        }
        printReverse(inputStack);
    }

    public static void fillStack(String inputString) {
        inputStack.push(inputString);
    }

    public static void printReverse(Deque<String> lineStack ){
        while(!lineStack.isEmpty()) {
            System.out.println(lineStack.pop());
        }
    }

}
