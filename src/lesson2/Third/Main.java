package lesson2.Third;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        User user = new User();
        Class<? extends User> a = user.getClass();
        System.out.println(a.getDeclaredMethod("method1").isAnnotationPresent(AcademyInfo.class));
        System.out.println(a.getDeclaredMethod("method2").isAnnotationPresent(AcademyInfo.class));

    }

}
