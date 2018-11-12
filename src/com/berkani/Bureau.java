package com.berkani;



import java.util.Scanner;

public class Bureau {

    private static String[] BureauTab=new String[300];
    private   String IDb;
    private   int Langeur;
    private   int Largeur;
    private   String Qualite;
    private   String Couleur;
    private   String Etat;
    private boolean valideId;
      static int compte;

    public Bureau(String Id,int langeur, int largeur, String qualite, String couleur) {
       Id=Id.toUpperCase();
        Scanner read=new Scanner(System.in);
        boolean acceptId;
        Langeur = langeur;
        Largeur = largeur;
        Qualite = qualite;
        Couleur = couleur;
        if (Identifiants.checkValide(Id,"B")&&Identifiants.checkExistance(BureauTab,Id,compte))
        {
            IDb=Id;
            BureauTab[compte]=IDb;
        }else {
            do{
                IDb=read.nextLine();
                IDb=IDb.toUpperCase();
                if (Identifiants.checkValide(IDb,"B")&&Identifiants.checkExistance(BureauTab,IDb,compte))
                {
                    System.out.println("Id accepté");
                    acceptId=true;
                }

                else acceptId=false;
                if(acceptId) BureauTab[compte]=IDb;
            }while (!acceptId);
        }
        System.out.println("vous avez ajouté un bureau en passant des parametres au constructeur");
    }

    public Bureau() {

        System.out.println("vous avez ajouter un bureau");
        System.out.println("voulliez entrez un Id");
        Scanner read=new Scanner(System.in);
       if(compte==0)
       {
           do{
               IDb=read.nextLine();
               IDb=IDb.toUpperCase();
                valideId=Identifiants.checkValide(IDb,"B");
           }while (!valideId==true);
           BureauTab[compte]=IDb.toUpperCase();
       }
       else {
           boolean acceptId=false;
          do{
              IDb=read.nextLine();
              IDb=IDb.toUpperCase();
             if (Identifiants.checkValide(IDb,"B")&&Identifiants.checkExistance(BureauTab,IDb,compte))
             {
                 System.out.println("Id accepté");
                 acceptId=true;
             }

             else acceptId=false;
             if(acceptId) BureauTab[compte]=IDb;
          }while (!acceptId);



       }


     /*   Identifiants.IdBureau[compte] = IDb;
        while (i<300){
            if (compte==i)
                break;
            if(Identifiants.IdBureau[i].equals(IDb)){
                do {
                    System.out.println("l'Id est deja existant voulliez le resaisir");
                    System.out.println("nouveau ID: ");
                    Idnum=read.nextInt() ;
                    this.IDb="B"+Idnum;

                    Identifiants.IdBureau[compte] = IDb;
                }while (Identifiants.IdBureau[i].equals(IDb));
                break;
            }
            if(!(Identifiants.IdBureau[i].equals(IDb)) ) i++;
        }*/
        System.out.println("entrez la langeur");
        Langeur = read.nextInt();
        System.out.println("entrez la largeur");
        Largeur = read.nextInt();
        System.out.println("entrez la quality");
        Scanner e=new Scanner(System.in);
       Qualite=e.nextLine();
        System.out.println("entrez la couleur");
        this.Couleur=read.nextLine();
        read.nextLine();
        System.out.println("entrez un numero pour definir l'etat 1 pour(en fonction) 0 pour hors fonction ");
        Etat = read.nextLine();
       switch (Etat){
           case ("0"): Etat="en fonction";
           break;
           case ("1"): Etat="hors fonction";
           break;
           default: Etat="non definit";
           break;

        }
        compte++;
    }
    public static void modifierBureau(Bureau bur){
        Scanner e=new Scanner(System.in);
        System.out.println("est-ce-que vous voulez modifier les information de Bureau");
        String modification=e.nextLine();
        modification.toLowerCase();
        if (modification.equals("oui")){

            System.out.println("l'ancienne langeur est "+bur.Langeur+" entrez la nouvelle langeur");
            bur.Langeur=e.nextInt();
            System.out.println("l'ancienne largeur est "+bur.Largeur+" entrez la nouvelle largeur");
            bur.Largeur=e.nextInt();
            System.out.println("l'ancienne qualité du bureau est "+bur.Qualite+" entrez la nouvelle qualité de bureau P pour PDG et N pour normal");
            Scanner s=new Scanner(System.in);
            bur.Qualite=s.nextLine();
            System.out.println("l'ancienne couleur est "+bur.Couleur+" modifier la couleur");
            bur.Couleur=s.nextLine();
            System.out.println("le bureau est  "+bur.Etat+" \nmodifier l'etat du bureau (oui ou non)");
            bur.Etat=s.nextLine();
            if(bur.Etat.equals("oui")){

                bur.Etat="en fonction";
            }
            else if(bur.Etat.equals("non"))

                bur.Etat="hors fonction";
            }

        }
    public String getIdfromTab(int Index)
    {
        return BureauTab[Index];
    }

    public static String[] getBureauTab() {
        return BureauTab;
    }

    public String getIDb() {
        return IDb;
    }

    public void setIDb(String IDb) {
        this.IDb = IDb;
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

    public String getQualite() {
        return Qualite;
    }

    public void setQualite(String qualite) {
        Qualite = qualite;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String etat) {
        Etat = etat;
    }

    public static int getCompte() {
        return compte;
    }

    public static void setCompte(int compte) {
        Bureau.compte = compte;
    }

 }

