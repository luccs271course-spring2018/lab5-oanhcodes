
##  COMP 271 002 F17 Lab 5 (Week 7)

#### 1. Why don't we need an explicit constructor?

Unlike a ListStack which explicitly calls methods on an instance of ArrayList to manipulate a stack, a LinkedStack works by referencing and adapting the top most reference/node. When pushing into a LinkedStack, we're create a whole new node.

#### 2. What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main?

The LinkedStack methods push, peek, pop, and isEmpty methods are O(1) complexity. The asList method is O(n) complexity because there is a while loop that iterates through the entire linked list once.

In the ReverseLines class, the fillStack method has O(1) complexity. The printReverse method has O(n) complexity because it iterates over the stack collection. The whole program is O(n).

#### 3 How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?

Instead of using Node, we can create a new instance of LinkedList. To implement push, we could use the addFirst method to add/replace the top node. To implement pop, we could use the removeFirst method. To implement peek, we could use the getFirst method. To implement isEmpty, we can check the size. To implement asList, we could use the toArray method. 

#### 4. Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.

It is better for push and pop to return the item instead of the stack itself. By doing so, we know exactly what item was inserted or removed. When working with stacks, we are only concerned with the top most item because of the last in first out principle. This means it would be more performant to return just one item. Some pros of returning the stack itself is we can see the new updated stack, however, if the stack is very large, it would not be very efficient.

