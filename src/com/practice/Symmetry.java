package com.practice;

/*Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за

сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,

что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class Symmetry {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 24; i++) {                                              //цикл для часов
            for (int j = 0; j < 60; j++) {                                  //цикл для минут
                if (((i / 10 % 10) == (j % 10)) && ((i % 10) == (j / 10 % 10))) {  //проверяем совпадения
                    count++;
                }
            }
        }
        System.out.println("Number of coincidence is " + count);  //выводим результат
    }

}
