package mvc.controller;

import mvc.service.TeacherService;


import java.util.Scanner;

public class TeacherController {
    private static final TeacherService teacherService = new TeacherService();

    public static void showTeacherList() {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--TEACHER MANAGEMENT PROGRAM--");
            System.out.println("Enter number to choose function : ");
            System.out.println("1. Add Teacher " +
                    "\n2. Delete Teacher " +
                    "\n3. Show teacher list " +
                    "\n4. Exit " +
                    "\nChoose function : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("---add teacher---");

                    break;
                case 2:
                    System.out.println("---delete teacher---");

                    break;
                case 3:
                    System.out.println("---teacher list---");

                    break;
                case 4:
                    System.out.println("The Program is Closed!!");
                    System.exit(0);
            }
        } while (true);
    }
}
