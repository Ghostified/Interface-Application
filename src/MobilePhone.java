

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
        System.out.println("Phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on mobilephone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            System.out.println("Answering the mobilephone");
            isRinging = false;
        } else {
            System.out.println("Mobile Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn) {
            isRinging = true;
            System.out.println("The phone is ringing");
        } else {
            System.out.println("Either the phone is off or the phone is off");
            isRinging = false;
            
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void hangUp() {
        System.out.println("Hanging up the call");
    }

}
