import org.testng.annotations.Test;

public class MakeMyTripTestCase extends BaseTest{

    @Test
    public void makemytrip() {
        MakeMyTripPO makeMyTripPO = new MakeMyTripPO(driver);

        makeMyTripPO.navigateToMakeMyTrip();

        makeMyTripPO.fromCity();

        makeMyTripPO.toCity();

       // makeMyTripPO.selectDate();

        makeMyTripPO.SerchButton();
    }
}
