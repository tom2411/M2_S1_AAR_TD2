package services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class Facade {
    private Map<String,String> users;

    // On évite de toucher au constructeur... du coup on fait l'initialisation de la map dans une méthode annotée PostConstruct
    @PostConstruct
    public void fillMap(){
        users=new HashMap<>();
        users.put("alice","alice");
        users.put("bob","bob");
    }

    public boolean checkLP(String login,String password) {
        String pwd=users.get(login);
        return ((pwd!=null) && (pwd.equals(password)));
   }

   public boolean changePassword(String login, String password){
        if (users.get(login) != null){
            users.replace(login,password);
            return true;
        }
        return false;
   }
}
