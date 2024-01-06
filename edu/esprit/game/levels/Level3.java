package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import edu.esprit.game.utils.Data;

public class Level3 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();
		
	/* TO DO 1: Retourner une chaine de caractï¿½re qui contient tous les noms des employï¿½s */	
	String names = employees.stream()
				            .map(Employee::getName)
				            .reduce("", (name1, name2) -> name1 + " " + name2);
	System.out.println(names);
	System.out.println("**************************************************************");
	/* TO DO 2: Retourner une chaine de caractï¿½re qui contient tous les noms des employï¿½s en majuscule separï¿½s par # */	
	String namesMajSplit = employees.stream()
						            .map(e -> e.getName().toUpperCase())
						            .collect(Collectors.joining("#"));
	System.out.println(namesMajSplit);
	System.out.println("**************************************************************");

	/* TO DO 3: Retourner une set d'employï¿½s*/
	Set<Employee> emps = employees.stream()
            					  .collect(Collectors.toSet());
	System.out.println(emps);
	System.out.println("**************************************************************");


	/* TO DO 4: Retourner une TreeSet d'employï¿½s (tri par nom) */
	TreeSet<Employee> emps2 = employees.stream()
									   .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getName))));
	System.out.println(emps2);
	System.out.println("**************************************************************");


	/* TO DO 5: Retourner une Map qui regroupe les employï¿½s par salaire */
	Map<Integer, List<Employee>> map = employees.stream()
            									.collect(Collectors.groupingBy(Employee::getSalary));
	System.out.println(map);
	System.out.println("**************************************************************");

			
	/* TO DO 6: Retourner une Map qui regroupe les nom des employï¿½s par salaire */
	Map<Integer, String> mm = employees.stream()
            						   .collect(Collectors.groupingBy(Employee::getSalary, 
            								   						  Collectors.mapping(Employee::getName, 
            								   						  Collectors.joining(", "))));
	System.out.println(mm);
	System.out.println("**************************************************************");
	

	/* TO DO 7: Retourner le  min, max,average, sum,count des salaires */
	IntSummaryStatistics stats = employees.stream()
            							  .collect(Collectors.summarizingInt(Employee::getSalary));

	String s = "Min: " + stats.getMin() + ", Max: " + stats.getMax() + ", Average: " + stats.getAverage() +
			   ", Sum: " + stats.getSum() + ", Count: " + stats.getCount();
	System.out.println(s);
	System.out.println("**************************************************************");
	
	}
}
