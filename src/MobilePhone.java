public class MobilePhone implements Telephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone is powered on");
    }

    @Override
    public void dialNumber(String phoneNumber) {
        System.out.println("The number " + phoneNumber + " is ringing now");
    }

    @Override
    public void answerCall() {

        if(isRinging && isPowerOn){
            System.out.println("Answering the phone call");
            isRinging =false;
        }else {
            System.out.println(" the phone is not ringing");
        }

    }

    @Override
    public boolean callPhone(String phoneNumber) {

        if(phoneNumber == myNumber && isPowerOn){
            isRinging = true;
            System.out.println("phone is ringing");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
