package com.taly.DotComBust;

import java.io.*;
import java.util.*;

/**
 * Created by Taly on 25.02.2017.
 */
public class GameHelper {
    public static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphacoords = new String[comSize];//хранит координаты типа f6
        String temp = null; //Временная строка для конкатенации
        int[] coords = new int[comSize];//координаты текущего сайта
        int attempts = 0; //счетчик текущих попыток
        boolean success = false; //Нашли подходящее местоположение?
        int location = 0; //Текущее начальное местоположение

        comCount++; //Энный сайт для размещения
        int incr = 1;   //устанавливаем горизонтальный инкремент
        if ((comCount % 2) == 1) { //если нечетный (размещаемый вертикально)
            incr = gridLength;      //устанавливаем вертикальный инкремент
        }

        while ( !success & attempts++ < 200) { //главный поисковый цикл (32)
            location = (int) (Math.random() * gridSize); //получаем случайную стартовую строчку
            //System.out.println("пробуем " + location);
            int x = 0;  //энная позиция в "сайте", который нужно разместить
            success = true; //предполагаем успешный исход
            while (success && x < comSize) { //ищем соседнюю неиспользуемую ячейку
                if (grid[location] == 0) { //если еще не используется
                    coords[x++] = location; //сохраняем местоположение
                    location += incr; //Пробуем "следующую" сосденюю ячейку
                    if (location >= gridSize) { //вышли за рамки - низ
                        success = false; //неудача
                    }
                    if (x > 0 && (location % gridLength == 0)) { //Вышли за рамки - правый край
                        success = false;    //неудача
                    }
                } else { //Нашли уже использующееся местоположение
                    //System.out.println("используется " + location);
                    success = false;    //неудача
                }
            }
        } //конец while

        int x = 0;  //переводим местоположение в символьные координаты
        int row = 0;
        int column = 0;
        //System.out.println("\n");

        while (x < comSize) {
            grid[coords[x]] = 1; //Помечаем ячейки на главной сетке как "использованные"
            row = (int) (coords[x] / gridLength); //Получаем значение строки
            column = coords[x] % gridLength; //Получаем числовое значение столбца
            temp= String.valueOf(alphabet.charAt(column)); //преобразуем его в строковый символ

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.println(" coord " + x + " = " + alphaCells.get(x - 1)); //где именно находится сайт
        }
        //System.out.println("\n");
        return alphaCells;
    }
}
