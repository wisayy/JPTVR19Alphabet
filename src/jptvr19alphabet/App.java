
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19alphabet;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("Alphabet");
        /**
         * Создаем массив из символов русского алфавита[33]
         * Попросим ввести строк пользователся (str)
         * Проходим по массиву abc и ищём индекс вхождения этого символа в str.
         * Если возвращается -1, то такого символа нет -> записываем его в массив
         * нехватающих символов notAbc[33]
         * Если -1 не встречался, то текст содержит все буквы алфавита.
         * Если -1 сработал, то выводим набор символов, которые отсутсвуют в текста
         */
        Scanner scanner = new Scanner(System.in);

        String a = "abcdefghijklmnopqrstuvwxyz";
        
        char abc[] =  a.toCharArray();
        char notAbc[] = new char[33]; 
        
        boolean isAllLetters = true;
        
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        for (int i = 0; i < abc.length; i++){
            int index = str.indexOf(abc[i]);
            if (index == -1) { notAbc[i] = abc[i]; isAllLetters = false; }            
        }
        if (!isAllLetters){
            System.out.println("В строке не все буквы, нехватает: " + new String(notAbc));
        } else {
            System.out.println("В строке все буквы");
        }
    }
}