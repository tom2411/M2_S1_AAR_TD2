package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Facade {
    private static Facade instance=null;

    private Map<String,String> users;
    private Map<String, String> nicknames;
    private List<String> humeurs;

    private Facade(){
        users=new HashMap<>();
        users.put("alice","alice");
        users.put("bob","bob");

        nicknames = new HashMap<>();
        nicknames.put("alice", "Miss all sunday");
        nicknames.put("bob", "Bonclay");

        humeurs = new ArrayList<>();
        humeurs.add("Content");
        humeurs.add("Triste");
        humeurs.add("Surpris");
    }

    public static synchronized Facade getInstance() {
        if (instance==null) {
            instance=new Facade();
        }
        return instance;
    }

    public boolean checkLP(String login,String password) {
        String pwd=users.get(login);
        return ((pwd!=null) && (pwd.equals(password)));
   }

    public String getSurnom(String login){
        return nicknames.get(login);
    }

    public List<String> getHumeurs() {
        return humeurs;
    }

}
