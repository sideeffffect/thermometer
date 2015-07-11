package com.vendavo.interview.thermometer;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * Tests FancyEnterpriseThermometer
 */
public class ThermometerTest {
    
    private void testColor(Thermometer thermometer, Color color, double temperature){
        Assert.assertEquals(Optional.of(color), thermometer.measure(temperature));
    }

    /**
     * tests limit values in temperature measuring
     */
    @Test
    public void test(){
        Thermometer thermometer = new FancyEnterpriseThermometer();
        
        testColor(thermometer, Color.DARK_BLUE, -5000);
        testColor(thermometer, Color.BLUE, -10);
        testColor(thermometer, Color.LIGHT_BLUE, 5);
        testColor(thermometer, Color.GREEN, 10);
        testColor(thermometer, Color.YELLOW, 25);
        testColor(thermometer, Color.ORANGE, 35);
        testColor(thermometer, Color.RED, 40);

        Assert.assertEquals(Optional.empty(), thermometer.measure(Double.NaN));
    }
}
