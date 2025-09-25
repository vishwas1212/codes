package olddsamixcodes.demo;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterFace {

	public static void main(String[] args) {

		Consumer<Integer> consumer = (i -> System.out.println(i * i)); // Consumer Does not return anything.
		consumer.accept(5);

		Supplier<Date> supplier = () -> new Date(); // Supplier Does Not take Any Input and return something
		System.out.println(supplier.get());

		Predicate<Integer> predicate = (i -> i * i < 5); //Takes Input and return Boolean
		System.out.println(predicate.test(5));
		
		Function<Integer,String> function=(f->f.toString());
		System.out.println(function.apply(5)); //Takes Input and return any output. input can be different.

	}

}
