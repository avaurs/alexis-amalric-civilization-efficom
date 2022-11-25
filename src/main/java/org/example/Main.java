package org.example;

import org.example.enumGlobal.Ability;
import org.example.enumGlobal.Country;
import org.example.enumGlobal.Name;
import org.example.pojo.Leader;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Combien de personnages souhaitez-vous générer ?");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean check = false;

        while(!check){
            try {
                input = sc.nextInt();
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Votre saisie est incorrecte. Veuillez saisir un chiffre.");
                sc.next();
            }
        }

        for(int i = 0 ; i < input ; i++){
            Name name = randomName();
            Country country = randomCountry();
            Ability ability = randomAbility();
            int attack = randomStat();
            int defense = randomStat();

            Leader myLeader = new Leader (name, country, ability, attack, defense);
            System.out.println(myLeader);
        }
    }

    public static Name randomName(){
        Name name = null;

        Random random = new Random();

        int randomNumber = random.nextInt(6);

        switch(randomNumber) {
            case 1:
                name = Name.GENGHIS_KHAN;
                break;
            case 2:
                name = Name.ELEANOR_OF_AQUITAINE;
                break;
            case 3:
                name = Name.GANDHI;
                break;
            case 4:
                name = Name.SEONDEOK;
                break;
            case 5:
                name = Name.FREDERICK_BARBAROSSA;
                break;
            default :
                name = Name.CLEOPATRA;
        }

        return name;
    }

    public static Ability randomAbility(){
        Ability ability = null;

        Random random = new Random();

        int randomNumber = random.nextInt(6);

        switch(randomNumber) {
            case 1:
                ability = Ability.MILITARY;
                break;
            case 2:
                ability = Ability.RELIGIOUS;
                break;
            case 3:
                ability = Ability.TECHNICAL;
                break;
            case 4:
                ability = Ability.CULTURAL;
                break;
            case 5:
                ability = Ability.ECONOMIST;
                break;
            default :
                ability = Ability.TOURIST;
        }

        return ability;
    }

    public static Country randomCountry() {
        Country country = null;

        Random random = new Random();

        int randomNumber = random.nextInt(6);

        switch (randomNumber) {
            case 1:
                country = Country.ALLEMAGNE;
                break;
            case 2:
                country = Country.COREE;
                break;
            case 3:
                country = Country.MONGOLIE;
                break;
            case 4:
                country = Country.INDE;
                break;
            case 5:
                country = Country.FRANCE;
                break;
            default:
                country = Country.EGYPTE;
        }

        return country;
    }

    public static int randomStat(){
        Random random = new Random();

        return random.nextInt(101);
    }
}