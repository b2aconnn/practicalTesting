package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {
    Americano americano = new Americano();

    @Test
    void getName() {
//        assertEquals(americano.getName(), "아메리카노");

        // 좀 더 명시적인 문법임
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();
        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}