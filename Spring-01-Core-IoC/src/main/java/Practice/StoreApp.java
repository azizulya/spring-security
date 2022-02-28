package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StoreApp {
    public static void main (String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext (StoreConfig.class);

        FoodDepartment fd = container.getBean (FoodDepartment.class);

        fd.sellProduce ();

        ClothesDepartment cd = container.getBean (ClothesDepartment.class);

        cd.sellClothes ();


    }
}
