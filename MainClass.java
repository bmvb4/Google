package DR8Zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("**********START***********");
		Map<String, Person> persons = new HashMap<>();
		String input = in.readLine();
		while (!"End".equals(input)) {
			String[] slice = input.split(" ");
			if (!persons.containsKey(slice[0])) {
				persons.put(slice[0], new Person(slice[0]));
			}
			switch (slice[1]) {
			case "company":
				persons.get(slice[0]).setCompany(new Company(slice[2],slice[3],Double.parseDouble(slice[4])));
				break;
			case "pokemon":
				persons.get(slice[0]).addPokemon(slice[2], slice[3]);;
				break;
			case "parents":
				persons.get(slice[0]).addParent(slice[2], slice[3]);;
				break;
			case "children":
				persons.get(slice[0]).addChildren(slice[2], slice[3]);;
				break;
			case "car":
				persons.get(slice[0]).setCar(new Car(slice[2],Integer.parseInt(slice[3])));;
				break;
			default:
				break;
			}
			input = in.readLine();
		}
		input=in.readLine();
		if (persons.containsKey(input)) {
			persons.get(input).print();
		}
	}

}
