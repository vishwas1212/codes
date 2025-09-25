package olddsamixcodes.stream;

import java.util.List;

public class Methods {

	public static void main(String[] args) {

		List<String> names = List.of("Ram", "Raja", "Shyam", "Vishwas");
		names.stream().filter(e->e.startsWith("R")).forEach(e->{
			System.out.println(e);
		});;
		
		List<Integer> Liststream = List.of(2, 3, 4, 5, 6, 7, 12, 13, 14, 15, 16);
		Liststream.stream().map(i->i*i).forEach(i->{
			System.out.println(i);
		});
	}
}
