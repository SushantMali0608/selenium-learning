import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> names =new ArrayList<String>();
		names.add("Harsh");
		names.add("Shree");
		names.add("Yash");
		names.add("Sush");
		names.add("Akash");
		names.add("Ayush");
		//long c = names.stream().filter(s->s.startsWith("S")).count();
		
		//System.out.println(c);
		
		// names which has greater than 5 char
		//names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));
		
		// names end with and uppar case
		//names.stream().filter(s->s.endsWith("h")).map(s->s.toUpperCase())
		//.forEach(s->System.out.println(s));
		
		//Soerting and converting to upper case
		
		//names.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Sorting all elements
		//names.stream().sorted().forEach(s->System.out.println(s));
		
		// merging two list
		
		ArrayList <String> name2 =new ArrayList<String>();
		name2.add("Akash");
		name2.add("Ayush");
		
		//Stream <String> Newstr = Stream.concat(names.stream(),name2.stream());
		//Newstr.sorted().forEach(s->System.out.println(s));
		
		// collecting list elements.
		
		List <String> ls = names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		//Create a list of integer (3,2,2,7,5,1,9,7)
		//Print Unique number
		//sorting of number
		
		List <Integer> num = Arrays.asList(3,2,2,7,5,1,9,7);
		
		num.stream().distinct().forEach(s->System.out.println(s));
		num.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
		
		
		
	}

}
