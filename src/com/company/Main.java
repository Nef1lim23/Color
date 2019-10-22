package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Color.values()));
    }

    public enum Color {
        Green("Зеленый"),
        Blue("Синий"),
        Red("Красный");

        private String title;

        Color(String title){
        this.title=title;
        }
        public String getTitle(){
            return title;
        }

        @Override
        public String toString(){
            return "Цвет: " +
                      title ;
        }
    }
}
