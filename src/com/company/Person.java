package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String surName;
    private String patronymic;
    private Integer course;


    public Person(String firstName, String surName, String patronymic, Integer course) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.course = course;
    }

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Integer getCourse() {
        return course;
    }

    public String getFullName() {
        return surName + " " + firstName + " " + patronymic;
    }

    @Override
    public String toString() {
        return "Полное имя- " + getFullName() + ", Курс- " + course;
    }

    public void start() {

        System.out.println("   Введите имя студента ");
        Scanner in = new Scanner(System.in);
        this.firstName = in.nextLine().trim();
        System.out.println("   Введите фамилию студента ");
        this.surName = in.nextLine().trim();
        System.out.println("   Введите отчество студента ");
        this.patronymic = in.nextLine().trim();
        System.out.println("   Введите курс студента ");
        this.course = in.nextInt();
   //     in.close();
        System.out.println("   ___________________________ ");
        System.out.println("   Полная информация о студенте: " + toString());
        System.out.println("   Полное имя студента: " + getFullName());
        System.out.println("   Инициалы: " + getInitials());
        System.out.println("   Количество символов в имени: " + getNumberOfSymbolsInName());
        System.out.println("   Повторяющиеся символы в имени: ");
        getRepeatingCharacters();
        return;
    }

    public String getInitials() {
        return surName.charAt(0) + ". " + firstName.charAt(0) + ". " + patronymic.charAt(0) + ".";
    }

    public int getNumberOfSymbolsInName() {
        return getFullName().length() - 2;
    }

    public void getRepeatingCharacters() {
        String fullName = getFullName();
        fullName = fullName.toUpperCase();
        Map<Character, Integer> charToInt = new HashMap<>();
        for (int i = 0; i < fullName.length(); i++) {
            char currentChar = fullName.charAt(i);
            boolean isFirst = true;
            if (currentChar != ' ') {
                for (int j = 0; j < fullName.length(); j++) {
                    char circleChar = fullName.charAt(j);
                    if (i != j && circleChar == currentChar) {
                        if (isFirst) {
                            isFirst = false;
                            charToInt.put(currentChar, 2);
                        } else {
                            int number = charToInt.get(currentChar);
                            charToInt.remove(currentChar, number);
                            charToInt.put(currentChar, number + 1);
                        }
                    }


                }
            }
        }
        for (int i = 0; i < charToInt.size(); i++) {
            System.out.println("       Символ " + charToInt.keySet().toArray()[i].toString() + " повторяется " + charToInt.values().toArray()[i] + " раз(а).");
        }

    }
}
