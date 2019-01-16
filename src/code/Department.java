package code;
import java.util.*;

public class Department {
	
	public String name;
	public List<Person> list;

	public void addPerson(Person person){
		list.add(person);
	}



	public void unitsPerFaculty(){
		for(Person p : list){


		}

	}

	public void showAllMembers(){
		for(Person p : list){
			System.out.println(p);
		}
	}


	public double getTotalSalary(){
		double sum = 0.0;
		for(Person p: list){
			sum += p.getSalary();
		}
		return  sum;
	}


	public Department(String name) {
		this.name = name;
		list = new ArrayList<Person>();
	}

}
