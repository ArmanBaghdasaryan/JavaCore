package bookexample.chapter7;

public class OverLoadDemo1 {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }


    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове "
                + "test(douЬle) а: " + a);


    }
}
