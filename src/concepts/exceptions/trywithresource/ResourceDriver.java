package concepts.exceptions.trywithresource;

public class ResourceDriver {
    static void main() throws Exception {
        try (MyResource resource = new MyResource();
             MyResource1 resource1 = new MyResource1()) {
            resource1.use();
            resource.use();
        }
    }
}
