package services;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Facade {

    private Map<String,String> users;
    private Map<String, String> nicknames;
    private List<String> humeurs;

    // On évite de toucher au constructeur... du coup on fait l'initialisation de la map dans une méthode annotée PostConstruct
    @PostConstruct
    public void fillMap(){
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
