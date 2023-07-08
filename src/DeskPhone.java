public class DeskPhone implements Telephone {
        private String myNumber;
        private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone is always powered");
    }

    @Override
    public void dialNumber(String phoneNumber) {
        System.out.println("The number " + phoneNumber + " is ringing now");
    }

    @Override
    public void answerCall() {

        if(isRinging){
            System.out.println("Answering the phone call");
            isRinging =false;
        }else {
            System.out.println(" the phone is not ringing");
        }

    }

    @Override
    public boolean callPhone(String phoneNumber) {

        if(phoneNumber == myNumber){
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
