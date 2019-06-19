package InterOperability;

public class MyJavaFile {
    public static void main(String[] args) {
        int sum = MyCustomKotlinFile.add(4, 7);
        System.out.println("Sum from java File: " + sum);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}
