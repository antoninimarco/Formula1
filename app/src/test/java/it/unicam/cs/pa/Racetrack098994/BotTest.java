package it.unicam.cs.pa.Racetrack098994;

import it.unicam.cs.pa.Racetrack098994.model.bot.Bot;
import it.unicam.cs.pa.Racetrack098994.model.car.Car;
import it.unicam.cs.pa.Racetrack098994.model.car.Color;
import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BotTest {

    @Test
    public void checkBotCreation() {
        Car car = new Car(new Vector (new Point(0,0), new Point(10,10)), Color.RED);
        Bot bot = new Bot("marco", car);
        assertEquals(bot, new Bot("marco", new Car(new Vector (new Point(0,0), new Point(10,10)), Color.RED)));
        assertThrows(NullPointerException.class, () -> new Bot(null,car));
        assertThrows(NullPointerException.class, () -> new Bot("marco",null));
    }

    @Test
    public void checkBotEquals() {
        Car car = new Car(new Vector (new Point(0,0), new Point(10,10)), Color.RED);
        Car car1 = new Car(new Vector (new Point(20,40), new Point(20,50)), Color.BLACK);
        Bot bot = new Bot("marco", car);
        Bot bot2 = new Bot("marco", car1);
        assertEquals(bot,bot2);

    }
}
