package jv2_assignment7;

public class PhoneBook {
    public int id;
    public int user_id;
    public String telephone;
    public String status;

    public PhoneBook() {
    }

    public PhoneBook(int id, int user_id, String telephone, String status) {
        this.id = id;
        this.user_id = user_id;
        this.telephone = telephone;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}