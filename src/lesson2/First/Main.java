package lesson2.First;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Man man = new Man();
        Method a = man.getClass().getDeclaredMethod("allInfo");
        a.invoke(man);
    }
}
