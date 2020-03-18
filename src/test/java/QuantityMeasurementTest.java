import QuantityMeasurement.FeetMeasurement;
import QuantityMeasurement.InchMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenOFeetand0Feet_shouldReturnEqual() {
        FeetMeasurement feetMeasurement1 = new FeetMeasurement(0.0);
        FeetMeasurement feetMeasurement2 = new FeetMeasurement(0.0);
        Assert.assertEquals(feetMeasurement1,feetMeasurement2);
    }

    @Test
    public void given0Feetand1Feet_shouldReturnNotEqual() {
        FeetMeasurement feetMeasurement1 = new FeetMeasurement(0.0);
        FeetMeasurement feetMeasurement2 = new FeetMeasurement(1.0);
        Assert.assertNotEquals(feetMeasurement1,feetMeasurement2);
    }


    @Test
    public void givenOInchand0Inch_shouldReturnEqual() {
        InchMeasurement inchMeasurement1 = new InchMeasurement(0.0);
        InchMeasurement inchMeasurement2 = new InchMeasurement(0.0);
        Assert.assertEquals(inchMeasurement1,inchMeasurement2);
    }

    @Test
    public void given0Inchand1Inch_shouldReturnNotEqual() {
        InchMeasurement inchMeasurement1 = new InchMeasurement(0.0);
        InchMeasurement inchMeasurement2 = new InchMeasurement(1.0);
        Assert.assertNotEquals(inchMeasurement1,inchMeasurement2);
    }
}
