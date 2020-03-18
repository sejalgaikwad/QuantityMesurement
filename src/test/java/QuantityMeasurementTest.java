import QuantityMeasurement.LengthMeasurement;
import QuantityMeasurement.InchMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenOFeetand0Feet_shouldReturnEqual() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthMeasurement.Unit.FEET,0.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthMeasurement.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Feetand1Feet_shouldReturnNotEqual() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthMeasurement.Unit.FEET,0.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthMeasurement.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenOInchand0Inch_shouldReturnEqual() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthMeasurement.Unit.INCH,0.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthMeasurement.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }


    @Test
    public void givenOInchand1Inch_shouldReturnNotEqual() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthMeasurement.Unit.INCH,0.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthMeasurement.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthMeasurement.Unit.FEET,1.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthMeasurement.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1, inch2);
    }





}
