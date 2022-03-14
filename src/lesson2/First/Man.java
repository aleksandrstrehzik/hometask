package lesson2.First;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

public class Man {

    private int age;
    private String name;
    private int weight;

    public Man() {
    }

    public Man(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public void allInfo(Man man) {
        Class<? extends Man> manClass = man.getClass();
        Field[] declaredFields = manClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("name " + declaredField.getName());
            System.out.println("type " + declaredField.getType());
            System.out.println("Modifiers " + declaredField.getModifiers() );
        }
        Method[] declaredMethods = manClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
    }
    private void printWords(){
        System.out.println("Я printWords");
    }

    private String getValue(){
        Random random = new Random();
        String value = "даю значение " + String.valueOf(random.nextInt(10));
        return value;
    }


    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
