package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // Aquí irá la lógica principal de la aplicación
        // Por ejemplo, un menú sencillo para agregar tareas, marcarlas como completadas y mostrar la lista

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                System.out.println("Enter task number to mark as completed:");
                int taskNumber = scanner.nextInt();
                if (taskNumber > 0 && taskNumber <= tasks.size()) {
                    tasks.get(taskNumber - 1).setCompleted(true);
                    System.out.println("Task marked as completed!");
                } else {
                    System.out.println("Invalid task number.");
                }
                break;
            
            case 2:
                System.out.println("Task List:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
                break;
            
                case 3:
                    System.exit(0);
            }
        }
    }
}
