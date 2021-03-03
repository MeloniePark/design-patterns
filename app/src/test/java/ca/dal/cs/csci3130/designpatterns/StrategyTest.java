package ca.dal.cs.csci3130.designpatterns;


import org.junit.Test;

import ca.dal.cs.csci3130.designpatterns.strategy.CityBus;
import ca.dal.cs.csci3130.designpatterns.strategy.PersonalCar;
import ca.dal.cs.csci3130.designpatterns.strategy.Strategy;
import ca.dal.cs.csci3130.designpatterns.strategy.Taxi;
import ca.dal.cs.csci3130.designpatterns.strategy.TransportService;

public class StrategyTest {

    @Test
    public void testStrategy() {
        Strategy bus = new CityBus();
        TransportService service = new TransportService(bus);
        service.executeStrategy();

        Strategy personalCar = new PersonalCar();
        service = new TransportService(personalCar);
        service.executeStrategy();

        Strategy taxi = new Taxi();
        service = new TransportService(taxi);
        service.executeStrategy();
    }
}
