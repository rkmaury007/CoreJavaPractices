public class CustomTryWithResource {
    public static void main(String[] args) {
        try (MyRes m = new MyRes()) {
            System.out.println("1");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("3");
    }
static class MyRes implements AutoCloseable {
            @Override
            public void close() throws Exception {
                System.out.println("2");
            }
    }
}

