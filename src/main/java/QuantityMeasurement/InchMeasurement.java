package QuantityMeasurement;

public class InchMeasurement {
    private final double value;

    public InchMeasurement(double value) {
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InchMeasurement that = (InchMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

}
