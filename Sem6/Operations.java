package Sem6;

import java.util.*;


public class Operations {
    private List<Notebook> notebooks;
    private static Scanner scanner = new Scanner(System.in);

    public void printList() {
        for (Notebook notebook : notebooks) {
            {
                System.out.println(notebook);
            }
        }
    }


    public Operations(List<Notebook> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = (List<Notebook>) notebooks;

    }


    public String getOperations() {

        String text = "\n Выберите операцию:\n 1. Выбрать критерий для фильтра\n 2. Вывести список\n 3. Завершить\n 4. Быстрый поиск\n ";

        System.out.print(text);

        String answer = scanner.next();

        return answer;
    }


    public void start() {

        boolean flag = true;
        while (flag) {

            String operation = getOperations();
            if (operation.equals("3")) {
                flag = false;
                System.out.println("Выход!");
                scanner.close();
                continue;
            } else if (operation.equals("1")) {
                filter();

            } else if (operation.equals("2")) {
                printList();
               
    
            } else if (operation.equals("4")) {
                fastSearch();
            }
            else System.out.println("Неверно введено значение!\n");
        }
    }

    private void fastSearch() {
        scanner = new Scanner(System.in);
        System.out.println("Введите основные параметры. ");
        System.out.println("Оперативная память: ");
        String opP = scanner.nextLine();

        System.out.println("Объем ЖД: ");
        String opP1 = scanner.nextLine();

        System.out.println("Диагональ: ");
        String diagonal = scanner.nextLine();

        for (Notebook notebook : notebooks) {
            {
                if (notebook.getamountHDD() == Integer.parseInt (opP1) && notebook.getAmountRAM() == Integer.parseInt (opP) && Objects.equals(notebook.getDiagonal(), Double.valueOf(diagonal))){
                    System.out.println(notebook);
                    return;
                }
            }

        }System.out.println("По заданным параметрам ничего не найдено! Попробуйте изменить критерии поиска. ");
        System.out.println();
    }

    

    public <notebooks> void filter() {
        scanner = new Scanner(System.in);
        System.out.print("Выберите критерий для поиска:\n 1. Оперативная память\n 2. Операционная система\n 3. Диагональ экрана\n 4. Объем жесткого диска:\n ");
        String op = scanner.nextLine();

        //Операционная система
        if (op.equals("2")) {
            System.out.print(" Выберите критерий: 1. linux, 2. macOS, 3. Windows10, 4. Windows11: ");
            String colGig = scanner.nextLine();
            if (colGig.equals("1")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("linux")) {
                        System.out.println(notebooks.get(i));
                    }

                }
            } else if (colGig.equals("2")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("macOS")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else if (colGig.equals("3")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("Windows10")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else if (colGig.equals("4")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOperatingSystem().equals("Windows11")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else System.out.println("Неверно введено значение!");
        }

            //Оперативная память
        else if (op.equals("1")) {
            System.out.print("Выберите критерий: 8Гб, 16Гб, 32Гб, 64ГБ: ");
            int colGig = scanner.nextInt();
            if (colGig == 8) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 8) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            } else if (colGig == 16) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 16) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            } else if (colGig == 32) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 32) {
                            System.out.println(notebooks.get(i));
                        }
                    }

            } else if (colGig == 64) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getAmountRAM() == 64) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            
        }else System.out.println ("Неверно введено значение!");

        }
        //Диагональ
        else if (op.equals("3")) {
            System.out.print("Выберите критерий : 1. 15,6, 2. 17,3: ");
            int colGig = scanner.nextInt();
            if (colGig == 1) {
                for (Notebook notebook : notebooks) {
                    {
                        if (notebook.getDiagonal() == 15.6) {
                            System.out.println(notebook);
                        }
                    }
                }
            } else if (colGig == 2) {
                for (Notebook notebook : notebooks) {
                    {
                        if (notebook.getDiagonal() == 17.3) {
                            System.out.println(notebook);
                        }
                    }
                }
            }else System.out.println("Неверно задано значение!\n");

        }
       

        //Объем ЖД
        else if (op.equals("4")) {
            System.out.print("Выберите критерий: 256Гб, 512Гб: ");
            int colGig = scanner.nextInt();
            if (colGig == 256) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getamountHDD() == 256) {
                            System.out.println(notebooks.get(i));
                        }
                    }
            } else if (colGig == 512) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getamountHDD() == 512) {
                            System.out.println(notebooks.get(i));
                    }
                    }
            
        }else System.out.println("Неверно введено значение!\n");

    }


 }
}
    




