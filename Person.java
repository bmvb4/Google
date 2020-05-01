package DR8Zad1;

import java.util.Map;
import java.util.HashMap;

public class Person {
	private String strName;
	private Company company;
	private Car car;
	private Map<String,String> pokemons = new HashMap<>();
	private Map<String,String> parents = new HashMap<>();
	private Map<String,String> childrens = new HashMap<>();
	
	public Person(String name) {
		this.strName = name;
	}
	public void addPokemon(String name, String type) {pokemons.put(name, type);}
	public void addParent(String name, String birthday) {parents.put(name, birthday);}
	public void addChildren(String name, String birthday) {childrens.put(name, birthday);}
	public void setCompany(Company company) {this.company = company;}
	public void setCar(Car car) {this.car=car;}
	
    public void print() {
        System.out.println(this.strName);
        System.out.println("Company:");
        if (this.company != null) 
        	System.out.println(this.company.toString());
        System.out.println("Car:");
        if (this.car != null) 
        	System.out.println(car.toString());
        System.out.println("Pokemon:");
        for (Map.Entry<String, String> pokemon : pokemons.entrySet())
        	System.out.println(pokemon.getKey()+" "+pokemon.getValue());
        System.out.println("Parents:");
        for (Map.Entry<String, String> perent : parents.entrySet()) 
        	System.out.println(perent.getKey()+" "+perent.getValue());
        System.out.println("Children:");
        for (Map.Entry<String, String> children : childrens.entrySet()) 
          	System.out.println(children.getKey()+" "+children.getValue());
    }
}
