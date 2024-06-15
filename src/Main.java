public class Main {
    public static void main(String[] args) {

        //Цена билета
        int Ticket_Price = 15338;

        //Количество рублей для начисления бонусной мили
        int Price_Mile = 20;

        //Расчет бонусных миль
        int Bonus = Ticket_Price / Price_Mile;
        System.out.println("Начислено бонусов " + Bonus);
    }

}