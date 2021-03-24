package javacore.level9.lectore_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Закрепляем адаптер
 * Адаптировать Customer и Contact к RowItem.
 * Классом-адаптером является DataAdapter.
 * Инициализируйте countries перед началом выполнения программы.
 * Соответствие кода страны и названия: UA Ukraine RU Russia CA Canada
 */

public class Solution_3 {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private final Customer customer;
        private final Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if (customer.getCountryName().equals(pair.getValue())) {
                    return pair.getKey();
                }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] name = contact.getName().split(", ");
            return name[1];
        }

        @Override
        public String getContactLastName() {
            String[] name = contact.getName().split(", ");
            return name[0];
        }

        @Override
        public String getDialString() {
            return "callto://+"+contact.getPhoneNumber().replaceAll("\\D","");
        }
    }

    public interface RowItem {
        String getCountryCode();        // For example: UA

        String getCompany();            // For example: JavaRash Ltd.

        String getContactFirstName();   // For example: Ivan

        String getContactLastName();    // For example: Ivanov

        String getDialString();            // For example: callto://+380501234567
    }


    public interface Customer {
        String getCompanyName();        // For example: JavaRash Ltd.

        String getCountryName();        // For example: Ukraine
    }


    public interface Contact {
        String getName();               // For example: Ivanov, Ivan

        String getPhoneNumber();        // For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567
    }

}
