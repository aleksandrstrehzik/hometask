package lesson2.Third;

public class User {


    @AcademyInfo
    public void method1(){
        System.out.println("Яша");
    }
    @AcademyInfo(year = 100)
    public void method2(){
        System.out.println("Ява");
    }
}
