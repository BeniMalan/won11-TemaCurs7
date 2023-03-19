package Advertasing;

public class Facebook implements AdvertiseProvider {
    @Override
    public String makeAdvertize() {
        return "Your service is advertised on facebook!";
    }
}
