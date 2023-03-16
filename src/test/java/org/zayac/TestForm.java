package org.zayac;


import org.junit.jupiter.api.Test;


public class TestForm extends TestBase {

    @Test
    void testFromV1() {
        registrationPage.openPage()
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setLastName("Ivanov")
                .setEmail("Mail@mail.ru")
                .setGender("Male")
                .setNumber("7999111123")
                .setSubjects("Economics")
                .setHobbies("Sports")
                .uploadPicture("src/test/resources/File1.png")
                .setCurrentAddress("Subject one or no one:)")
                .setBirthDate("30", "July", "1993")
                .setState("NCR")
                .setCity("Delhi");

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Ivan Ivanov")
                .verifyResult("Student Email", "Mail@mail.ru")
                .verifyResult("Gender", "Male")
                .verifyResult("Date of Birth", "30 July,1993")
                .verifyResult("Subjects", "Economics")
                .verifyResult("Picture", "File1.png")
                .verifyResult("Address", "Subject one or no one:)")
                .verifyResult("State and City", "NCR Delhi");
    }
}
