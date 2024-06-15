public class Main {
    public static void main(String[] args) {

        //Цена билета
        int ticketPrice = 15338;

        //Количество рублей для начисления бонусной мили
        int priceMile = 20;

        //Расчет бонусных миль
        int bonus = ticketPrice / priceMile;
        System.out.println("Начислено бонусов " + bonus);
    }
}