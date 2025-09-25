package olddsamixcodes.immutable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

class Animal {
	private Integer id;
	private String breed;
	private String name;
	private String colour;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(Integer id, String breed, String name, String colour) {
		super();
		this.id = id;
		this.breed = breed;
		this.name = name;
		this.colour = colour;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breed, colour, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(breed, other.breed) && Objects.equals(colour, other.colour)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", breed=" + breed + ", name=" + name + ", colour=" + colour + "]";
	}

}

public class JungleImplementaion {

	public static void main(String[] args) {
		Animal animal1 = new Animal(1, "Animal", "Lion", "Saffron");
		Animal animal2 = new Animal(2, "Animal", "Tiger", "Black");
		Animal animal3 = new Animal(3, "Bird", "Parrot", "Green");
		Animal animal4 = new Animal(4, "Bird", "Eagle", "Brown");
		Animal animal5 = new Animal(5, "WaterAnimal", "Crocodile", "Grey");
		
		Map<Integer,Animal> map=new HashMap<>();
		map.put(1, animal1);
		map.put(2, animal2);
		map.put(3, animal3);
		map.put(4, animal4);
		map.put(5, animal5);
		
//		System.out.println(map);

		List<Animal> animalList = new ArrayList<>();
		animalList.add(animal1);
		animalList.add(animal2);
		animalList.add(animal3);
		animalList.add(animal4);
		animalList.add(animal5);
		
//		System.out.println(animalList);
		
		//Before Java 8
		Map<Integer, Animal> listToMap=new HashMap<>();
		for(Animal animal:animalList)
		{
			listToMap.put(animal.getId(), animal);
		}
//		System.out.println(listToMap);
		
		
		//With Java 8
		Map<Integer, Animal> hashMap=animalList.stream().collect(Collectors.toMap(Animal::getId, Function.identity()));
//		System.out.println(hashMap);
		
		List<Integer> list = map.keySet().stream().collect(Collectors.toList());
		System.out.println(list);
		
		List<Animal> list2 = map.values().stream().collect(Collectors.toList());
		System.out.println(list2);
		
		List<Animal> list3 = list2.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
		System.out.println(list3);
		
		Map<Integer, Animal> map2 = list3.stream().collect(Collectors.toMap(Animal::getId, Function.identity()));
		System.out.println(map2);
	}
  
}
