public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
//подготавливаем данные;
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        //вызываем целевой метод
        long actual = service.calculate(amount,registered);
        //производим проверку
        //если true - TO PASS
        //если false - TO FAIL
        boolean passed = expected==actual;
        //выводим результат
        System.out.println(passed);
    }
}