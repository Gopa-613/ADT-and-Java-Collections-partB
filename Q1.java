/*Write a program to create an TreeSet of Integer type and perform the
below operation on it.
(a.) Display the TreeSet
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from tree.*/
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> t = new TreeSet<Integer>();
t.add(12);
t.add(23);
t.add(34);
t.add(24);//adding elements to list
System.out.println("The Tree Set contains element : "+t);//display the elements
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int n = sc.nextInt();
if(t.contains(n)) {
	System.out.println("The number is present.");
	
}
else {
	System.out.println("The number is not present.");
}
t.remove(34);
//element removed

System.out.println("Current treeset contains element : "+t);
sc.close();
	}
}
