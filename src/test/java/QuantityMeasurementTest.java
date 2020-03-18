import QuantityMeasurement.FeetMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenOfeetand0feet_shouldReturnEqual() {
        FeetMeasurement feetMeasurement1 = new FeetMeasurement(0.0);
        FeetMeasurement feetMeasurement2 = new FeetMeasurement(0.0);
        Assert.assertEquals(feetMeasurement1,feetMeasurement2);
    }
}
