package Advertasing;

public class PrintedAdvertise implements AdvertiseProvider{
    @Override
    public String makeAdvertize() {
        return "Your service is advertise with printed fliers";
    }
}
