public class App {
    public static void main(String[] args) throws Exception {
        //deskphone();
        mobilePhone();

    }

    //Implementing a deskphone
    public static void deskphone() {
        Deskphone deskphone = new Deskphone("123456789");
        deskphone.powerOn();
        deskphone.dial("123456789");
        deskphone.callPhone("123456789");
        deskphone.isRinging();
        deskphone.hangUp();
    }

    //Implementing a mobile phone
    public static void mobilePhone() {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        mobilePhone.powerOn();
        mobilePhone.callPhone("123456789");
        mobilePhone.answer();
    }

}
