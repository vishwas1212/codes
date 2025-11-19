package concepts.exceptions.trywithresource;

public class MyResource1 implements AutoCloseable{
public void use(){
    System.out.println("Resource 1 Using...");
}
    @Override
    public void close() throws Exception {
        System.out.println("Resource 1 Clsoing...");
    }
}
