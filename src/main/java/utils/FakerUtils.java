package utils;

import com.github.javafaker.Faker;

public class FakerUtils {
    private static final Faker faker = new Faker();

    public static String generateCardName() {
        return "Card " + faker.name().fullName();
    }
}
