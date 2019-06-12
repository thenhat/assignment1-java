package jv2_assignment6;

import java.util.ArrayList;

public interface UserInterface {
    boolean create(jv2_assignment6.User u);

    ArrayList<jv2_assignment6.User> getList();

    boolean update(jv2_assignment6.User u);

    boolean delete(User u);
}

