public class Main {
    public static void main(String[] args) {

        int price = 500; // сумма покупки
        int miles = 20; // количество миль за один рубль
        int bonus = price / miles; // количество начисленных бонусов

        System.out.println(bonus);
    }
}
