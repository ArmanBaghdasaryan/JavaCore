package homework.student.command;

public interface Commands {
    int LOGOUT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int DELETE_STUDENTS_BY_INDEX = 3;
    int PRINT_STUDENT_BY_LESSON = 4;
    int PRINT_STUDENT_COUNT = 5;
    int CHANGE_STUDENT_LESSON_LESSON = 6;

    int ADD_LESSON = 7;
    int PRINT_ALL_LESSONS = 8;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;


    static void printAdminCommands() {
        System.out.println("Please input " + LOGOUT + " for logout");
        System.out.println("Please input " + ADD_STUDENT + " for add student");
        System.out.println("Please input " + PRINT_ALL_STUDENTS + " for print all students");
        System.out.println("Please input " + DELETE_STUDENTS_BY_INDEX + " for delete student by index");
        System.out.println("Please input " + PRINT_STUDENT_BY_LESSON + " for print student by lesson ");
        System.out.println("Please input " + PRINT_STUDENT_COUNT + " for print students count");
        System.out.println("Please input " + CHANGE_STUDENT_LESSON_LESSON + " for change students lesson");
        System.out.println("Please input " + ADD_LESSON + " for add lesson");
        System.out.println("Please input " + PRINT_ALL_LESSONS + " for print all lessons");

    }

    static void printUserCommands() {
        System.out.println("Please input " + LOGOUT + " for logout");
        System.out.println("Please input " + ADD_STUDENT + " for add student");
        System.out.println("Please input " + PRINT_ALL_STUDENTS + " for print all students");
        System.out.println("Please input " + PRINT_STUDENT_BY_LESSON + " for print student by lesson ");
        System.out.println("Please input " + PRINT_STUDENT_COUNT + " for print students count");
        System.out.println("Please input " + PRINT_ALL_LESSONS + " for print all lessons");

    }


    static void printLoginCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + LOGIN + " for login");
        System.out.println("Please input " + REGISTER + " for register");
    }
}
