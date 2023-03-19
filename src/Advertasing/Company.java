package Advertasing;

public class Company {
    private AdvertiseProvider sourceOfAdvertising;
    public void setSourceOfAdvertising(AdvertiseProvider sourceOfAdvertising) {
        this.sourceOfAdvertising = sourceOfAdvertising;
    }
    public void advertizeOn(){
        System.out.println(sourceOfAdvertising.makeAdvertize());
    }

}
