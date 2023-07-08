public interface Telephone {
    void powerOn();
    void dialNumber(String phoneNumber);

    void answerCall();

    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
