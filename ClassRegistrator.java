package SOI;

import java.util.ArrayList;
import java.util.List;

class ClassRegistrator implements Registrator {
    private final List<User> userList = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        userList.add(user);
        System.out.println(user.getName() + " ro'yhatdan o'tkazildi");
    }

    public List<User> getUserList() {
        return userList;
    }
}
