package jv2_assignment7;


import java.util.ArrayList;

public interface UserInterface {
    boolean create(PhoneBook u);

    ArrayList<PhoneBook> getList();

    boolean update(PhoneBook u);

    boolean delete(PhoneBook u);
}
