package task5.views;

import task5.model.Student;
import task5.resources.ResourceManager;

import java.util.ArrayList;
import java.util.Locale;

public class MenuView implements LanguageMenuConstants, MenuConstants {
    private static ResourceManager resourceManager = ResourceManager.INSTANCE;
    private StudentView studentView = new StudentView();

    public void menuText() {
        displayMessage(getLocaleString(OPTION_1));
        displayMessage(getLocaleString(OPTION_2));
        displayMessage(getLocaleString(CHANGE_LANGUAGE_OPTION));
        displayMessage(getLocaleString(EXIT_OPTION));
    }

    public void chooseLanguageMenu() {
        displayMessage(ENGLISH_LANGUAGE);
        displayMessage(UKRAINIAN_LANGUAGE);
//        displayMessage(RUSSIAN_LANGUAGE);
    }

    public static void changeLocal(Locale locale) {
        resourceManager.changeResource(locale);
    }

    public String getLocaleString(String request) {
        return resourceManager.getKey(request);
    }

    public void showCuratorBook(ArrayList<Student> curatorBook) {
        for (Student student : curatorBook) {
            studentView.showStudent(student, resourceManager);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

