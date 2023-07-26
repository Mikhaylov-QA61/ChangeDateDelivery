
import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataPlaning {

    static Faker faker = new Faker(new Locale("ru"));
    public String generateDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }

    public String generateCity() {

        String city = faker.address().city();
        return city;
    }

    public static String generateName() {

        String name = faker.name().firstName() + " " + faker.name().lastName();

        return name;
    }

    public static String generatePhone() {

        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

//    public static class Registration {
//        private Registration() {
//        }
//
//        public static UserInfo generateUser(String locale) {
//            // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
//            // generateName(locale), generatePhone(locale)
//            return user;
//        }
//    }
//
//    @Value
//    public static class UserInfo {
//        String city;
//        String name;
//        String phone;
//    }
}