package com.taly.DotComBust;

import java.util.*;

/**
 * Created by Taly on 25.02.2017.
 */
public class DotCom {
    //опишем переменные экземпляра класса DotCom
    private String name; //имя сайта
    private ArrayList<String> locationCells; //ArrayList с ячейками, описывающими местоположение

    public void setName(String name) { //Простой сеттер имени сайта
        this.name = name;
    }
    //Сеттер, который обновляет местоположение "сайта" (случайный адрес, предоставляемый
    // методом placeDotCom() из класса GameHelper)
    public void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public String checkYourSelf(String userInput) {
        String result = "Мимо";
        // Метод indexOf() из ArrayList  проверяет ход пользователя. Если он совпал с одним из элементов ArrayList,
        // то метод вернет его местоположение (индекс) иначе вернется "-1"
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index); //применяем метод remove() из ArrayList для удаления элемента

            if (locationCells.isEmpty()) { //используем метод isEmpty(), чтобы проверить, все ли адреса были разгданы
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + " : (");//сообщаем пользователю о потоплении "сайта"
            } else {
                result = "Попал";
            }// конец if
        }// конец if
          return result; // Возвращаем "Мимо", "Потопил" или "Попал"
    }// конец метода
} //конец класса
