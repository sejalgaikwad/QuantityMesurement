package QuantityMeasurement;

import java.util.Objects;

public class FeetMeasurement {
    private final double value;

    public FeetMeasurement(double value) {
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeetMeasurement that = (FeetMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

}
