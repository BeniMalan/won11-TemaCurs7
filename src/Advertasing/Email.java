package Advertasing;

public class Email implements AdvertiseProvider {
    @Override
    public String makeAdvertize() {
       return
                "Your service is advertize by e-mail";
    }
}
