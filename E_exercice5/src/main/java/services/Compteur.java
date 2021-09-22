package services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Compteur {

    private Integer cpt;

    // On évite de toucher au constructeur... du coup on fait l'initialisation de la map dans une méthode annotée PostConstruct
    @PostConstruct
    public void fillMap(){
        this.cpt=0;
    }

    public Integer getCpt() {
        return cpt;
    }

    public void incr(){
        this.cpt++;
    }
}
