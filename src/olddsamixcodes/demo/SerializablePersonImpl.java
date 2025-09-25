package olddsamixcodes.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializablePerson implements Serializable {

	private int id;
	private String name;

	private transient String address;

	public SerializablePerson(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public SerializablePerson() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SerializablePerson [id=" + id + ", name=" + name + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class SerializablePersonImpl {

	public static void main(String[] args) {

		SerializablePerson sp = new SerializablePerson(1, "Ram", "AYodhya");
		SerializablePerson sp1 = new SerializablePerson(2, "Shyam", "Mathura");
		SerializablePerson sp2 = new SerializablePerson(3, "Mohan", "Mathura");

		/*
		 * try { writeToFile(sp); } catch (IOException e) {
		 * System.out.println(e.getMessage()); }
		 * 
		 * try { writeToFiles(sp, sp1, sp2); } catch (IOException e) {
		 * System.out.println(e.getMessage()); }
		 */

		try {
			readFile();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Dell\\Desktop\\Others\\Persons.bin"));
		SerializablePerson sp = (SerializablePerson) objectInputStream.readObject();
		SerializablePerson sp1 = (SerializablePerson) objectInputStream.readObject();
		SerializablePerson sp2 = (SerializablePerson) objectInputStream.readObject();
		System.out.println(sp + " " + sp1 + " " + sp2);

		for (int i = 0; i < objectInputStream.available(); i++) {
			SerializablePerson[] sp3 = (SerializablePerson[]) objectInputStream.readObject();
			System.out.println(sp3[i]);
		}

	}

	private static void writeToFiles(SerializablePerson sp, SerializablePerson sp1, SerializablePerson sp2)
			throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Dell\\Desktop\\Others\\Persons.bin"));
		objectOutputStream.writeObject(sp);
		objectOutputStream.writeObject(sp1);
		objectOutputStream.writeObject(sp2);
	}

	private static void writeToFile(SerializablePerson sp) throws FileNotFoundException, IOException {

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Dell\\Desktop\\Others\\Person.bin"));
		objectOutputStream.writeObject(sp);

	}

}
