/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidData;

import java.util.regex.Pattern;

public class Validation {
    public static boolean isValidName(String name) {
        return name != null && name.matches("^[a-zA-Z\\s]+$");
    }

    public static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("^\\d{10}$");
    }

    public static boolean isValidEmail(String email) {
        return email != null && Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$").matcher(email).matches();
    }

    public static boolean isValidDate(String birthDate) {
        return birthDate != null && birthDate.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }
}
