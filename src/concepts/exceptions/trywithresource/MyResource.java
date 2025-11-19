package concepts.exceptions.trywithresource;

public class MyResource implements AutoCloseable{

    public void use(){
        System.out.println("Resource Using!!!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource Closing!!!");
    }
}
