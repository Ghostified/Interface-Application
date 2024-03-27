public class Deskphone implements Telephone{


    private String myNumber;
    private boolean isRinging;

    public Deskphone(String myNumber) {
        this.myNumber = myNumber;
    }

    //select the methods to implement from the interface 
    @Override
    public void powerOn() {
        System.out.println("Deskphone is always on, it does not have a power button");
    }

    @Override
    public void dial (String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override 
    public void answer () {
        if (isRinging) {
            System.out.println("Answering the deskphone");
            isRinging = false;
        } else {
            System.out.println("Deskphone is not ringing");}
    }

    @Override
    public boolean callPhone (String phoneNumber) {
        if (phoneNumber==myNumber) {
           isRinging = true;
           System.out.println("The phone is ringing");
        } else {
            isRinging = false;
            System.out.println("The phone is not ringing");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging () {
        return isRinging;
    }

    @Override
    public void hangUp () {
        System.out.println("Hanging up the call");
    }

}
