package lesson2.Second;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SomeClass someClass = new SomeClass();
        Method h = someClass.getClass().getDeclaredMethod("printHelloWorld");
        h.setAccessible(true);
        h.invoke(someClass);
    }

}
