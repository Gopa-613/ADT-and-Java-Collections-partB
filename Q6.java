/*Write a program to create a hash map insert some element into it and
display it.*/
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("Kim Jisoo", "34");
		h.put("Rose","67");
		h.put("Kim Sunoo","78");
		for(String key : h.keySet()){
			System.out.println(key + " score marks :" + h.get(key));
			}

		
	}

}
