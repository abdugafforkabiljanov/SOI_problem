package SOI;

public class Main {
    public static void main(String[] args) {
       ClassRegistrator classRegistrator = new ClassRegistrator();
       classRegistrator.registerUser(new User("Ali" , 2005 , 997215178));
       classRegistrator.registerUser(new User("Vali" , 2004 , 987654321));
       classRegistrator.registerUser(new User("Hasan" , 2003 , 123456789));
       classRegistrator.registerUser(new User("Husan" , 2002 , 234567890));
       ClassDataRecipient classDataRecipient = new ClassDataRecipient(classRegistrator.getUserList());
       classDataRecipient.getUserDetails();
    }
}
