package OwnPractice;

import org.testng.annotations.Test;

public class UserRegistrationTest {

    @Test
    public void createUserTest() {

        String name = TestDataGenerator.generateRandomString(9);
        String email = TestDataGenerator.generateEmail();
        int age = TestDataGenerator.generateRandomNumber(18, 60);

        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
        System.out.println("Age   : " + age);

        // 👉 Use these values in:
        // Selenium sendKeys()
        // OR REST Assured request body
    }
}

