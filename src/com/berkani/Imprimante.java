package com.berkani;

import java.util.Scanner;

public class Imprimante {
    private static String[]  ImrimantIds=new String[300];
    private String IDi;
    private    int Langeur;
    private int Largeur;
    private   int Hauteur;
    private int Capacite ;
    private   boolean BlackOrColor;
    private    String Place;
    private boolean valideId;
    private static int compte;



    public Imprimante() {

        System.out.println("vous avez ajouter une imprimante");
        Scanner read=new Scanner(System.in);
        System.out.println("entrez un Id pour definir l'ID de l'mprimante\n( Doit etre debuter par (I ou i) suivi par un numero d'entier )");

        if(compte==0)
        {
            do{
                IDi=read.nextLine();
                IDi=IDi.toUpperCase();
                valideId=Identifiants.checkValide(IDi,"I");
            }while (!valideId==true);
            ImrimantIds[compte]=IDi.toUpperCase();
        }
        else {
            boolean acceptId=false;
            do{
                IDi=read.nextLine();
                IDi=IDi.toUpperCase();
                if (Identifiants.checkValide(IDi,"I")&&Identifiants.checkExistance(ImrimantIds,IDi,compte))
                {
                    System.out.println("Id accepté");
                    acceptId=true;
                }

                else acceptId=false;
                if(acceptId) ImrimantIds[compte]=IDi;
            }while (!acceptId);



        }


        System.out.println("entrez la langeur");
            Langeur = read.nextInt();
            System.out.println("entrez la largeur");
            Largeur = read.nextInt();
            System.out.println("entrez la hauteur");
            Hauteur = read.nextInt();
            System.out.println("entrez la capacite");
            Capacite = read.nextInt();
            System.out.println("l'imprimante supporte les couleur ou non ? \nrepondez par (true || false)");
            BlackOrColor = read.nextBoolean();
            System.out.println("ou l'imprimante est placée");
            do{
                System.out.println("donnez un bureau dans le quel l'imprimante est placé");
                Place = read.nextLine();
                read.nextLine();
                Place=Place.toUpperCase();
                if(Identifiants.checkExistance(Bureau.getBureauTab(),Place,compte+1))
                    System.out.println("Ce bureau n'existe pas");

            }while (!Identifiants.checkExistance(Bureau.getBureauTab(),Place,compte+1));

        compte++;

    }
    public static void modifierLimprimante(Imprimante imprimante){
        Scanner e=new Scanner(System.in);
        System.out.println("est-ce-que vous voulez modifier les information de l'imprimente (oui || non)");
        String modification=e.nextLine();
        modification.toLowerCase();
        if (modification.equals("oui")){

            System.out.println("l'ancienne langeur est "+imprimante.Langeur+" modifier la langeur");
            imprimante.Langeur=e.nextInt();
            System.out.println("l'ancieene largeurest "+imprimante.Largeur+" modifier la largeur");
            imprimante.Largeur=e.nextInt();
            System.out.println("l'ancienne hauteur est "+imprimante.Hauteur+" modifier la hauteur");
            imprimante.Hauteur=e.nextInt();
            System.out.println("l'ancienne capacité est "+imprimante.Capacite+" modifier la capacité");
            imprimante.Capacite=e.nextInt();
            System.out.println("support de couleur "+imprimante.BlackOrColor+" couleur ou non (répondez par oui ou non)");
            String BlackorColor=e.nextLine();e.nextLine();
            BlackorColor.toLowerCase();
            if(BlackorColor.equals("oui"));
            imprimante.BlackOrColor=true;
            System.out.println("modifier l'emplacement");
            imprimante.Place=e.nextLine();
        }
    }


    public String getIDi() {
        return IDi;
    }

    public void setIDi(String IDi) {
        this.IDi = IDi;
    }

    public int getLangeur() {
        return Langeur;
    }

    public void setLangeur(int langeur) {
        Langeur = langeur;
    }

    public int getLargeur() {
        return Largeur;
    }

    public void setLargeur(int largeur) {
        Largeur = largeur;
    }

    public int getHauteur() {
        return Hauteur;
    }

    public void setHauteur(int hauteur) {
        Hauteur = hauteur;
    }

    public int getCapacite() {
        return Capacite;
    }

    public void setCapacite(int capacite) {
        Capacite = capacite;
    }

    public boolean isBlackOrColor() {
        return BlackOrColor;
    }

    public void setBlackOrColor(boolean blackOrColor) {
        BlackOrColor = blackOrColor;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public static int getCompte() {
        return compte;
    }

    public static void setCompte(int compte) {
        Imprimante.compte = compte;
    }

}

