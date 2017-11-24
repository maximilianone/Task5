package task5.views;

import task5.model.Student;
import task5.resources.ResourceManager;

class StudentView implements StudentViewConstants {
    void showStudent(Student student, ResourceManager resourceManager) {
        System.out.println(resourceManager.getKey(STUDENT) + student.getSurname() + " " + student.getName());
        System.out.println(resourceManager.getKey(BIRTH_DAY) +student.getDate());
        System.out.println(resourceManager.getKey(PHONE) + student.getPhoneNumber());
        System.out.println(resourceManager.getKey(ADDRESS) + student.getAddress());
        System.out.println();
    }
}