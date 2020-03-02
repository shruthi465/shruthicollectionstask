package com.collections.Epamcollectionstask;
import java.util.Arrays;
class ArrayListCustom<E>
{
 
    // Define INITIAL_CAPACITY, size of elements of custom ArrayList
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};
  public ArrayListCustom()
    {
           elementData = new Object[INITIAL_CAPACITY];
    }
//method for adding elements
    public void add(E e)
    {
           if (size == elementData.length)
           {
                  ensureCapacity(); // increase current capacity of list, make it
                                                    // double.
           }
           elementData[size++] = e;
    }
 
   
     // method returns element on specific index.
    @SuppressWarnings("unchecked")
    public E get(int index) 
    {
           // if index is negative or greater than size of size, we throw
           // Exception.
           if (index < 0 || index >= size)
           {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
           return (E) elementData[index]; // return value on index.
    }
 
    //method for removing elements 
    public Object remove(int index) 
    {
           // if index is negative or greater than size of size, we throw
           // Exception.
        if (index < 0 || index >= size)
        {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
 
           Object removedElement = elementData[index];
           for (int i = index; i < size - 1; i++) {
                  elementData[i] = elementData[i + 1];
      }
           size--; 
 
           return removedElement;
    }
 
    // Method increases capacity of list by making it double.
    private void ensureCapacity() 
    {
           int newIncreasedCapacity = elementData.length * 2;
           elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
 
    //method for displaying
    public void display()
    {
           System.out.print("The list  contains: ");
           for (int i = 0; i < size; i++)
           {
                  System.out.print(elementData[i] + " ");
           }
    }
 
}
 
public class ArrayListCustomApp
{
     
    public static void main(String args[]) {
           ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
         
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);
           list.add(1);
           list.add(2);
           list.add(5);
           list.add(6);
           list.add(7);
           list.add(8);
 
           list.display();
           System.out.println("\nelement at index  " + 1 + " in custom ArrayList is :" + list.get(1));
    
           System.out.println("element removed from index " + 5 + " is"  + list.remove(5));
           
           System.out.println("element removed from index " + 4 + " is "+ list.remove(4));
           
 
           //display custom ArrayList again 
           System.out.println("\nthe new custom ArrayList  after removal of elements  at index 1 and 4 is");
 
           list.display();
          
    }
     
}
 


