public class ChargerAdapter implements UsbCCharger {
    private RoundPinCharger roundPinCharger;

    public ChargerAdapter(RoundPinCharger roundPinCharger) {
        this.roundPinCharger = roundPinCharger;
    }

    @Override
    public void chargePhone() {
        roundPinCharger.chargeWithRoundPin();
    }
}
