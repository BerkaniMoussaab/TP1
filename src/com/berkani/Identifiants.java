package com.berkani;

public class Identifiants {



   public static boolean checkExistance(String[]Tab,String Idb,int Case)
   {
       boolean Existance=true;
       int i=0;
      if(Case>0){
          while (i<Case)
       {
           if(Tab[i].equals(Idb))
           {
               System.out.println("Mais deja existant voullier le resaisir");
               Existance=false;
               break;
           }else {
               Existance=true;

               i++;
           }
       }
   }
       return Existance;
   }
    public static boolean checkValide(String Id,String firstletter)
    {
        boolean Valid=false;
        boolean Valid2=false;
        if(Id.startsWith(firstletter)   )
        {
            System.out.println("Id est valide");
            Valid=true;
        } else {
            System.out.println("Id doit etre debuter par "+firstletter);
            Valid=false;
        }
        if(Id.substring(1).matches("[0-9]+"))
            Valid2=true;
        else {
            Valid2=false;
            System.out.println("vous n'avez pas entrez un entier positive");
        }
        return (Valid && Valid2);
    }



   }
