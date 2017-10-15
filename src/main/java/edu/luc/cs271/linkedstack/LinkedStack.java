package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  private List<E> dataList;

  // Done why don't we need an explicit constructor?

  /* Unlike a ListStack which explicitly calls methods on an instance of ArrayList to manipulate a stack,
  a LinkedStack works by referencing and adapting the topOfStackReference. No instance of LinkedList needs to made
  because the collection is made of individual Node objects. */


  // Reset topmost node of the stack with a new node and then set its next reference as the old topmost node
  @Override
  public E push(final E obj) {
    top = new Node<>(obj, top);
    return obj;
  }

  // Check if the stack is empty
  // If the stack is not empty, return the topmost node
  @Override
  public E peek() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
  }

  // Check if the stack is empty
  // If the stack is not empty, return the top node
  // Change top reference to the next node - This removes the current topmost node
  @Override
  public E pop() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      return result;
    }
  }

  // If top is null, return True
  // Else return False
  @Override
  public boolean isEmpty() {
    return top == null;
  }

  //Set data list as a new ArrayList collection
  //While the top is not equal to null, add it to the ArrayList
  @Override
  public List<E> asList() {
    dataList = new ArrayList<>();
    while (top != null) {
      dataList.add(top.data);
      top = top.next;
    }
    return dataList;
  }

}
