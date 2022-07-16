package bookexample.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Text class annotation")
@MyAnno2(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "Text class annotation")
    @MyAnno2(str = "Test", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("All annotation for class Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotation for method myMeth():");
            for (Annotation a : annos) {
                System.out.println(a);

            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method nor found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
