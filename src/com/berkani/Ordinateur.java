package com.berkani;

import java.util.Scanner;

public class Ordinateur {

    private static String[] OrdinateurIds=new String[300];
    private   String IDo;
    private String Type;
    private  String Processeur;
    private  int memoire;
    private int DimenstionEcran;
    private String Place;
    private String fonctionnment;
    private boolean valideId;
     static int compte;

    public Ordinateur( ) {

        System.out.println("vous avez ajouter un ordinateur");
        Scanner read=new Scanner(System.in);
        System.out.println("entrez un Id pour definir l'ID de L'Ordinateur\n( Doit etre debuter par (O ou o) suivi par un numero d'entier )");

        if(compte==0) {
                      do{
                           IDo=read.nextLine();
                           IDo=IDo.toUpperCase();
                           valideId=Identifiants.checkValide(IDo,"O");

                      }while (!valideId==true);
                       OrdinateurIds[compte]=IDo.toUpperCase();
        } else {
                     boolean acceptId=false;
                    do{
                       IDo=read.nextLine();
                       IDo=IDo.toUpperCase();
                        if (Identifiants.checkValide(IDo,"O")&&Identifiants.checkExistance(OrdinateurIds,IDo,compte))
                        {
                            System.out.println("Id accepté");
                          acceptId=true;
                        } else
                            acceptId=false;
                        if(acceptId)
                            OrdinateurIds[compte]=IDo;
                    }while (!acceptId);



        }

        System.out.println("donnez le type de l'ordinateur");
        Type =read.nextLine();
        System.out.println("entrez le type du prossesseur");
        Processeur =read.nextLine();

        System.out.println("entrez la taille de la memoire en gega bits");
        this.memoire =read.nextInt();
        System.out.println("entrez la dimention d'ecarn");
        DimenstionEcran =read.nextInt();
        do{
            System.out.println("donnez un bureau dans le quel l'ordinateur est placé");
            Place = read.nextLine();
            read.nextLine();
            Place=Place.toUpperCase();
            if(Identifiants.checkExistance(Bureau.getBureauTab(),Place,compte+1))
                System.out.println("Ce bureau n'existe pas");

        }while (!Identifiants.checkExistance(Bureau.getBureauTab(),Place,compte+1));
        System.out.println("entrez l'etat de l'ordinateur repondez par (oui ou non) ");
        fonctionnment=read.nextLine();
      do{  if(fonctionnment.equals("oui")){
            fonctionnment="en etat de fonction";
        }
        else if(fonctionnment.equals("non"))
            fonctionnment="hors fonction";}
        while(!(fonctionnment.equals("en etat de fonction") || fonctionnment.equals("hors fonction")) );

        compte++;




    }
    public static void modifierOrdinateur(Ordinateur ordi){
        Scanner e=new Scanner(System.in);
        System.out.println("est-ce-que vous voulez modifier les information de l'ordinateur");
        String modification=e.nextLine();
        modification.toLowerCase();
        if (modification.equals("oui")){
            System.out.println("l'ancien type est " +ordi.Type+" entrez le nouveau type d'ordinateur");

            ordi.Type=e.nextLine();
            System.out.println("l'ancien prossesseur est "+ordi.Processeur+" entrez le nouveau proccesseur");
            ordi.Processeur=e.nextLine();
            System.out.println("l'ancienne memoire est "+ordi.memoire+" entrez la nouvelle memoire");
            ordi.memoire=e.nextInt();
            System.out.println("l'ancein dimension est "+ordi.DimenstionEcran+" entrez la nouvelle dimension d'ecran");
            ordi.DimenstionEcran=e.nextInt();
            Scanner s=new Scanner(System.in);
            System.out.println("l'ancienne place est "+ordi.Place+ " entrez le nouveau emplacment");
            ordi.Place=e.nextLine();e.nextLine();
            System.out.println("l'ordinateur est en "+ordi.fonctionnment+"entrez le nouveau etat l'etat de " +
                    "l'ordinateur repondez par(oui ou non)");
            ordi.fonctionnment=s.nextLine();
            ordi.fonctionnment.toLowerCase();
            if(ordi.fonctionnment.equals("oui")){

                ordi.fonctionnment="en fonction";

            }
            else {
                ordi.fonctionnment="hors fonction";
            }
        }

    }



    public String getIDo() {
        return IDo;
    }

    public void setIDo(String IDo) {
        this.IDo = IDo;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getProcesseur() {
        return Processeur;
    }

    public void setProcesseur(String processeur) {
        Processeur = processeur;
    }

    public int getMemoire() {
        return memoire;
    }

    public void setMemoire(int memoire) {
        this.memoire = memoire;
    }

    public int getDimenstionEcran() {
        return DimenstionEcran;
    }

    public void setDimenstionEcran(int dimenstionEcran) {
        DimenstionEcran = dimenstionEcran;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getFonctionnment() {
        return fonctionnment;
    }

    public void setFonctionnment(String fonctionnment) {
        this.fonctionnment = fonctionnment;
    }

    public static int getCompte() {
        return compte;
    }

    public static void setCompte(int compte) {
        Ordinateur.compte = compte;
    }
}
