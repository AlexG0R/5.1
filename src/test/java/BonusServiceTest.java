import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
//подготавливаем данные;
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
//подготавливаем данные;
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;
        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
//подготавливаем данные;
        long amount = 10_000_60;
        boolean registered = false;
        long expected = 100;
        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();
//подготавливаем данные;
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;
        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}

