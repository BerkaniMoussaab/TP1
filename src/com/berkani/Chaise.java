package com.berkani;

import java.util.Scanner;

public class Chaise {
    private static String[] ChaiseIds=new String[300];
    private   String IDc;
    private String  Type;
    private String Place;
    private String Etat;
    private boolean valideId;
    static int compte;



    public Chaise() {


        System.out.println("vous avez ajouter une chaise");
        Scanner read=new Scanner(System.in);
        System.out.println("entrez un Id pour definir l'ID de La chaise\n( Doit etre debuter par (C ou c) suivi par un numero d'entier )");

        if(compte==0)
        {
            do{
                IDc=read.nextLine();
                IDc=IDc.toUpperCase();
                valideId=Identifiants.checkValide(IDc,"C");
            }while (!valideId==true);
            ChaiseIds[compte]=IDc.toUpperCase();
        }
        else {
            boolean acceptId=false;
            do{
                IDc=read.nextLine();
                IDc=IDc.toUpperCase();
                if (Identifiants.checkValide(IDc,"C")&&Identifiants.checkExistance(ChaiseIds,IDc,compte))
                {
                    System.out.println("Id accepté");
                    acceptId=true;
                }

                else acceptId=false;
                if(acceptId) ChaiseIds[compte]=IDc;
            }while (!acceptId);



        }



        System.out.println("entrez le type de la chaise");
        Type = read.nextLine();


        do{
            System.out.println("donnez un bureau dans le quel la chaise est placé");
            Place = read.nextLine();
            read.nextLine();
            Place=Place.toUpperCase();
            if(Identifiants.checkExistance(Bureau.getBureauTab(),Place,compte+1))
                System.out.println("Ce bureau n'existe pas");

        }while (!Identifiants.checkExistance(Bureau.getBureauTab(),Place,compte+1));

        System.out.println("la chaise est en etat de fonction ou non");
        Etat =read.nextLine();

        compte++;

    }
    public static void modifierLaChaise(Chaise chaise){
        Scanner e=new Scanner(System.in);
        System.out.println("est-ce-que vous voulez modifier les information de la chaise");
        String modification=e.nextLine();
        modification.toLowerCase();
        if (modification.equals("oui")){
            System.out.println("l'ancienne Type est "+chaise.Type+chaise.Type+" modifier le type");
            chaise.Type=e.nextLine();
            System.out.println("l'ancien emplacment est"+chaise.Place+"modifier la place");
            chaise.Place=e.nextLine();
            System.out.println("la chaise est etat de"+chaise.Etat +"l'etat de la chaise repondez par oui ou non ");
            chaise.Etat =e.nextLine();
            chaise.Etat.toLowerCase();
            if (chaise.Etat.equals("oui")){

                chaise.Etat ="en fonction";
            }
            else {
                chaise.Etat ="hors fonction";

            }
        }
    }






    public String getIDc() {
        return IDc;
    }

    public void setIDc(String IDc) {
        this.IDc = IDc;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String etat) {
        this.Etat = etat;
    }

    public static int getCompte() {
        return compte;
    }

    public static void setCompte(int compte) {
        Chaise.compte = compte;
    }
}