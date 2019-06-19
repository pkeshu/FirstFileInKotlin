package DefaultFunctionWithInteroprability;

public class MyJavaFile {
    public static void main(String[] args) {
        int result = MyKotlinFile.getVolumn(5, 8);
        System.out.println("Volumn by passing only two argumnets from java file: " + result);
        int result1 = MyKotlinFile.getVolumn(4, 7, 9);
        System.out.println("Volumn by passing three argumnents from java file: " + result1);
    }
}
