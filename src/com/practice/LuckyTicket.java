package com.practice;

/*В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую

неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от

000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр

номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или

567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета

и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте

сколько счастливых билетов в одном рулоне?
 */
public class LuckyTicket {

    private int countTicket = 0;

    private int getCount(){                          //подсчитываем кол-во счастливых билетов
        for (int i = 999999; i > 0; i--){

        int num1= i/100000;
        int num2= (i%100000)/10000;
        int num3=(i%10000)/1000;
        int num4=(i%1000)/100;
        int num5=(i%100)/10;
        int num6=i%10;

            if((num1+num2+num3)==(num4+num5+num6)){
                countTicket++;
            }
        }
        return countTicket;
    }

    public static void main(String[] args) {
        LuckyTicket lt = new LuckyTicket();

        System.out.println("Number of lucky tickets is: " + lt.getCount());                  //выводим результат
    }
}
