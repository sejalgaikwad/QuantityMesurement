package QuantityMeasurement;

import java.util.Objects;

public class LengthMeasurement {


    public enum Unit{ FEET, INCH }

    private final Unit unit;
    private final double value;

    public LengthMeasurement(Unit unit,double value) {
        this.unit=unit;
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthMeasurement that = (LengthMeasurement) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }
}
