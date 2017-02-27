package com.taly.DotComBust;

/**
 * Created by Taly on 27.02.2017.
 */
import java.util.*;

public class DotComBust {
    //Объявляем и инициализируем переменные, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(); //создать ArrayList только для объектов DotCom
    private int numOfGuesses = 0;

    private void setUpGame() {
        //создадим несколько "сайтов" и присвоим им имена
        //создаем три объекта DotCom, даем им имена и помещаем в ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        //выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три \"сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь их потопить за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) { //повторяем с каждым объектом DotCom в списке
            ArrayList<String> newLocation = helper.placeDotCom(3); //запрашиваем у вспомогательного объекта адрес "сайта"
            //Вызываем сеттер из объекта DotCom, чтобы передать ему местоположение,
            // которое только что получили от вспомогательного объекта
            dotComToSet.setLocationCells(newLocation);
        } //конец цикла
    } //конец метода setUpGame

    private void startPlaying() {
        while (!dotComsList.isEmpty()) { //до тех пор, пока список объектов DotCom не станет пустым
            String userGuess = helper.getUserInput("Сделайте ход"); //Получаем пользовательский ввод
            checkUserGuess(userGuess); //  вызываем метод checkUserGuess
        } //конец while
        finishGame(); //вызываем метод finishGame
    }//конец метода startPlaying

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;//инкрементируем количество попыток, которое сделал пользователь
        String result = "Мимо"; //подразумеваем промах, пока не выясним обратное

        for (DotCom dotComToTest: dotComsList) { //повторяем для всех объектов в DotCom списке
            result = dotComToTest.checkYourSelf(userGuess); //просим DotCom проверить ход пользователя, ищем попадание или потопление
            if (result.equals("Попал")) {
                break; //выбираемся из цикла, нет смысла проверять другие "сайты"
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest); // ему пришел конец, так что удаляем его из списка "сайтов" и выходим из цикла
                break;
            }
        } //Конец цикла
        System.out.println(result); // выводим для пользователя результат
    } //конец метода

    private void finishGame() {
        // выводим сообщение о том, как пользователь прошел игру
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонили.");
        } else {
            System.out.println("Это заняло у вас допольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }//конец метода

    public static void main(String[] args) {
        DotComBust game = new DotComBust();//создаем игровой объект
        game.setUpGame();//говорим игровому объекту подготовить игру
        game.startPlaying();//говорим игровому процессу начать главный цикл
        //продолжаем запрашивать пользовательский ввод и проверять полученные данные
    }// конец метода
}
