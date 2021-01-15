
public class Main {

    public static void main(String[] args) {


        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] elements = new ArrayIndexOutOfBoundsException().getStackTrace();
        System.out.println(elements.length);
        if (elements.length < 3) {
            return null;
        }
        else {
            return elements[2].getClassName() + "#" + elements[2].getMethodName();
        }
    }


}
