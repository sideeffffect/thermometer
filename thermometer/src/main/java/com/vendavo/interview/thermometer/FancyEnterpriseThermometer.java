package com.vendavo.interview.thermometer;

import java.util.Optional;

/**
 * Fancy enterprise grade implementation of Thermometer
 */
public class FancyEnterpriseThermometer implements Thermometer {

    /**
     * performs temperature measuring for our enterprise customers
     * @param temperature current temperature
     * @return wrapped color corresponding to temperature, or empty if no color corresponds
     */
    @Override
    public Optional<Color> measure(double temperature) {
        
        // if the list of possible colors grows to be huge,
        // maybe then we can start thinking about binary search
        // so far this is both simpler and faster
        for(Color color : Color.values()){
            if(color.inside(temperature)){
                return Optional.of(color);
            }
        }
        
        return Optional.empty();
    }
}
