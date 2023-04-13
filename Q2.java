/*Write a program to create a class named it as Address, having member
variable plot no, at, post and required member function. Create a
tree map having key as name of a person and value as address. Insert
required key and value in the created tree map and display it.
*/
import java.util.*;
class Address{
	String plotno;
	String at;
	String post;
	
	public Address(String plotno, String at, String post){
		this.plotno = plotno;
		this.at = at;
		this.post = post;
	}
	
	public String getPlotno() {
		return plotno;
	}
	
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	
	public String getAt() {
		return at;
	}
	
	public void setAt(String at) {
		this.at = at;
	}
	
	public String getPost() {
		return post;
	}
	
	public void setPost(String post) {
		this.post = post;
	}
	public String toString() {
		return "Address : { "+ "plotno : "+ plotno +" ,at : "+at+ " , post : "+ post+ " }";
		
	}
}
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<String, Address> t = new TreeMap<>();

t.put("Radha", new Address("111", "street no 1","bbsr"));
t.put("Hobi", new Address("222", "street no 2","gwangju"));
t.put("Jeon", new Address("333", "street no 3","busan"));
t.put("Kim", new Address("444", "street no 4","seoul"));
t.put("Jung", new Address("555", "street no 5","ilsan"));
t.put("Min", new Address("666", "street no 6","daegu"));

//System.out.println("The treemap contains element : "+t);
for (Map.Entry<String, Address> entry : t.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
	}

}
