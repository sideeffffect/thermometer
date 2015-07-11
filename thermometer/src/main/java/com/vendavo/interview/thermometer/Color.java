package com.vendavo.interview.thermometer;

public enum Color {
      DARK_BLUE (Double.NEGATIVE_INFINITY, -10                     )
    , BLUE      (-10                     ,   5                     )
    , LIGHT_BLUE(  5                     ,  10                     )
    , GREEN     ( 10                     ,  25                     )
    , YELLOW    ( 25                     ,  35                     )
    , ORANGE    ( 35                     ,  40                     )
    , RED       ( 40                     , Double.POSITIVE_INFINITY)
    ;
    
    private final double lowIncluding;
    private final double hiExcluding;

    Color(double lowIncluding, double hiExcluding) {
        this.lowIncluding = lowIncluding;
        this.hiExcluding = hiExcluding;
    }

    /**
     * tests if this color corresponds to the given temperature
     * @param temperature
     * @return
     */
    public boolean inside(double temperature){
        return lowIncluding <= temperature && temperature < hiExcluding;
    }
}
