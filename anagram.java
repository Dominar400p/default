package demo;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		 ArrayList a=new ArrayList(Arrays.asList("cat","dog","god","cat"));
		 Set<Set<String>> l=new HashSet();
		 Collections.sort(a);
		 for(int i=0;i<a.size()-1;i++) {
			 Set<String> s2=new HashSet();
			 if(a.get(i).equals(a.get(i+1))) {
				 s2.add(a.get(i));
				 
		 }}
	}

}
