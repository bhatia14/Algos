package sortingNsearching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/**
 * (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
 * @author rachit
 *
 */
class Person{
	Integer weight;
	Integer height;
}

public class ComplexObjectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> arrayList=new ArrayList<>();
		Person person=new Person();
		Person person2=new Person();
		Person person3=new Person();
		Person person4=new Person();
		Person person5=new Person();
		Person person6=new Person();
		person.height=65;
		person.weight=100;
		person2.height=70;
		person2.weight=150;
		person3.height=56;
		person3.weight=90;
		person4.height=75;
		person4.weight=190;
		person5.height=60;
		person5.weight=95;
		person6.height=68;
		person6.weight=110;
		arrayList.add(person);
		arrayList.add(person2);
		arrayList.add(person3);
		arrayList.add(person4);
		arrayList.add(person5);
		arrayList.add(person6);
		
		Collections.sort(arrayList, new Comparator<Person>() {
		    public int compare(Person result1, Person result2) {
		        return result1.height.compareTo(result2.height);
		    }
		});
		Collections.sort(arrayList, new Comparator<Person>() {
		    public int compare(Person result1, Person result2) {
		        return result1.weight.compareTo(result2.weight);
		    }
		});
		for(Person p:arrayList)
			System.out.println(p.height+" "+p.weight);
		
		
	}

}
