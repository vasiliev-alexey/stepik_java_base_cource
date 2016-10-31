package ex4.org.stepic.java.example;

/**
 * Created by alexey on 24.09.16.
 */


    public class Test {
        public static void main(String[] args) {
            System.out.println(getCallerClassAndMethodName());
            anotherMethod();
        }

        private static void anotherMethod() {
            System.out.println(getCallerClassAndMethodName());
        }

        public static String getCallerClassAndMethodName() {

            java.lang.RuntimeException err = new java.lang.RuntimeException();
            if (err.getStackTrace().length <= 2){
                return null;
            };
            StackTraceElement[] result = err.getStackTrace();
            return result[2].getClassName()+'#'+result[2].getMethodName();

        }


}
