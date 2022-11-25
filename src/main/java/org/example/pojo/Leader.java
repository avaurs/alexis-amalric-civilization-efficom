package org.example.pojo;

import org.example.enumGlobal.Ability;
import org.example.enumGlobal.Country;
import org.example.enumGlobal.Name;

public class Leader {

    private Name name;

    private Country country;

    private Ability ability;

    private Integer attack;

    private Integer defense;

    public Leader(){
        name = Name.CLEOPATRA;
        country = Country.MONGOLIE;
        ability = Ability.TOURIST;
        attack = 0;
        defense = 0;
    }

    public Leader(Name name, Country country, Ability ability, Integer attack, Integer defense) {
        this.name = name;
        this.country = country;
        this.ability = ability;
        this.attack = attack;
        this.defense = defense;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @Override
    public String toString(){
        return "Bonjour, mon nom est " + this.name + ", je suis le leader de " + this.country + " et ma spécialité est " + this.ability + ". Attaque : " + this.attack + ". Défense : " + this.defense + ".";
    }
}