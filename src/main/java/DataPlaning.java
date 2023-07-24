

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataPlaning {


    public String generateDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }

    public String generateCity() {
        List<String> massCity = new ArrayList<>();
        massCity.add("Самара");
        massCity.add("Москва");
        massCity.add("Казань");
        massCity.add("Иркутск");
        massCity.add("Рязань");
        massCity.add("Санкт-Петербург");
        massCity.add("Ульяновск");
        massCity.add("Сыктывкар");
        massCity.add("Чебоксары");
        int count = (int) Math.floor(Math.random()* massCity.size());

        String city = massCity.get((int) count);
        return city;
    }

    public static String generateName() {
        List<String> massName = new ArrayList<>();
        massName.add("Туров Игорь");
        massName.add("Лазарев Григорий");
        massName.add("Алексеев Роман");
        massName.add("Харитонов Владислав");
        massName.add("Горбунов Владимир");
        massName.add("Шубин Виталий");
        massName.add("Петров Кирилл");
        massName.add("Киселев Роман");
        massName.add("Абрамов Егор");
        int count = (int) Math.floor(Math.random()* massName.size());

        String name = massName.get((int) count);

        return name;
    }

    public static String generatePhone() {
        List<String> massPhone = new ArrayList<>();
        massPhone.add("+72785416636");
        massPhone.add("+73359163514");
        massPhone.add("+75223779482");
        massPhone.add("+72469201676");
        massPhone.add("+73944978305");
        massPhone.add("+75483120007");
        massPhone.add("+71288572414");
        massPhone.add("+71040463528");
        massPhone.add("+72526457644");
        int count = (int) Math.floor(Math.random()* massPhone.size());

        String phone = massPhone.get((int) count);
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