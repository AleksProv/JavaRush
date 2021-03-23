package javacore.level9.lectore_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Адаптация нескольких интерфейсов
 * Адаптируй IncomeData к Customer и Contact.
 * Классом-адаптером является IncomeDataAdapter.
 * Инициализируйте countries перед началом выполнения программы.
 * Соответствие кода страны и названия:
 * UA Ukraine
 * RU Russia
 * CA Canada
 * Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры).
 */

public class Solution_2 {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactLastName(), data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String result = String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(),
                    String.format("%010d", data.getPhoneNumber()).substring(0, 3),
                    String.format("%010d", data.getPhoneNumber()).substring(3, 6),
                    String.format("%010d", data.getPhoneNumber()).substring(6, 8),
                    String.format("%010d", data.getPhoneNumber()).substring(8));
            return result;
        }
    }

    public static interface IncomeData {
        String getCountryCode();        // For example: UA

        String getCompany();            // For example: JavaRash Ltd.

        String getContactFirstName();   // For example: Ivan

        String getContactLastName();    // For example: Ivanov

        int getCountryPhoneCode();      // For example: 38

        int getPhoneNumber();           // For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: JavaRash Ltd.

        String getCountryName();        // For example: Ukraine
    }

    public static interface Contact {
        String getName();               // For example: Ivanov, Ivan

        String getPhoneNumber();        // For example: +38(050)123-45-67
    }

}
