package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Processor {
    public Map<String, Color> colorList;

    public Processor() {
        colorList = new HashMap<>();
        colorList.put("Белый", new Color("#ffffff", "rgb(255,255,255)"));
        colorList.put("Серый", new Color("#c0c0c0", "rgb(192,192,192)"));
        colorList.put("Черный", new Color("#000000", "rgb(0,0,0)"));
        colorList.put("Красный", new Color("#ff0000", "rgb(255,0,0)"));
        colorList.put("Оранжевый", new Color("#ffa500", "rgb(255,165,0)"));
        colorList.put("Желтый", new Color("#ffff00", "rgb(255,255,0)"));
        colorList.put("Зеленый", new Color("#00ff00", "rgb(0,255,0)"));
        colorList.put("Голубой", new Color("#00ffff ", "rgb(0,255,255)"));
        colorList.put("Синий", new Color("#0000ff ", "rgb(0,0,128)"));
    }

    public void start() {
        while(true){
            System.out.println();
            System.out.println("Введите название цвета из доступных: ");
            for(int i = 0 ; i < colorList.size(); i++){
                System.out.println("    "+ colorList.keySet().toArray()[i].toString());
            }
        //    colorList.forEach((name, color) -> );
            System.out.println("Для выхода введите выход");
            Scanner in = new Scanner(System.in);
            String num = in.nextLine();
            if(num.trim().equals("выход")) {
             //   in.close();
                return;}
            getColorByName(num.trim());
        }
    }
    public Color getColorByName(String name) {
        if (colorList.containsKey(name)) {
            return null;
        } else {
            return colorList.get(name);
        }
    }

     //   return  colorList.getOrDefault(name, null);

 ///   }
    /*public void getColorByName(String name) {
       Color result =  colorList.getOrDefault(name, null);
       if(result == null){
           System.out.println("Проверьте введённое имя)");
       } else {
           System.out.println("Код цвета " + name + " " + result.getCode() + ", в rgb формате - " + result.getRgb());
       }
    }*/
}
