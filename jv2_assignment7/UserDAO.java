package jv2_assignment7;

import connector.Connector;
import java.util.ArrayList;

public class UserDAO implements UserInterface {

    private static UserDAO instance;

    private UserDAO(){

    }

    public static UserDAO getInstance(){
        if(instance == null){
            instance = new UserDAO();
        }
        return instance;
    }


    public boolean create(int user_id, String telephone, String status) throws Exception {
        Connector cn = Connector.getInstance();
        String sql = "INSERT INTO phonebook (user_id, telephone, status) VALUES ('" + user_id + "', '" + telephone + "', '" + status + "')";
        try {
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){}

        return false;
    }

    @Override
    public ArrayList<PhoneBook> getList() {
        return null;
    }


    public boolean update(int id, int userId, String telephone, String status) throws Exception {
        Connector cn = Connector.getInstance();
        String sql = "UPDATE phonebook SET user_id = '" + userId + "', telephone = '" + telephone + "', status = '" + status + "' WHERE id = '" + id + "'";
        try {
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){}

        return false;
    }

    public boolean delete(int id) throws Exception {
        Connector cn = Connector.getInstance();
        String sql = "DELETE FROM phonebook WHERE id = '" + id + "'";
        try {
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){}

        return false;
    }
}
