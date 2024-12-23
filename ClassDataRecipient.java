package SOI;

import java.util.List;

class ClassDataRecipient implements DataRecipient {
    private final List<User> userList;

    public ClassDataRecipient(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void getUserDetails() {
        System.out.println("Ro'yhatdagi foydalanuvchilar: ");
        for(User user : userList){
            System.out.println(user);
        }
    }
}
