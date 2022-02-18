package Practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

@Bean
    FoodDepartment foodDepartment() {
    return new FoodDepartment ();
}

    @Bean
    ClothesDepartment clothesDepartments () {
    return new ClothesDepartment ();
    }

}
