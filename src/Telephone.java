

public interface Telephone {

    //power on
    //Dial a number
    //Answer a phone call 
    //Call another phone
    //Is phone ringing or not
    //Hang up
     void powerOn ();
     void dial (String phoneNumber);
     void answer ();
     boolean callPhone (String phoneNumber);
     boolean isRinging ();
    void hangUp ();

}
