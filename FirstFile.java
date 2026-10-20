public class FirstFile {

    private String message;

    public FirstFile(String message) {
        this.message = message;
    }
    public static void main(String[] args) {
        FirstFile file = new FirstFile("Hello, World!");
        System.out.println(file.message);
    }
}