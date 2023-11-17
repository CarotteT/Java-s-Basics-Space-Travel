import java.util.Scanner;

public class SpaceTravel
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the SpaceTravel agency");
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to do ? [h for help]");
      
        
        do
        { 
            String choice = scan.nextLine();  
            char monchoix=choice.charAt(0);         
            switch(monchoix)
            {
                case 'h': 
                    System.out.println("h: print this help screen \n" + "q : quit the program");
                    break;
                case 'q': 
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                case '1':
                    Planet[] valuesArray = Planet.values(); // Recuperation du tableau
                    for (int i = 0 ; i < valuesArray.length ; i++) // Parcours du tableau
                    { 
                        System.out.println("Planet contient l'instance" +valuesArray[i].name()+"qui est à la position"+valuesArray[i].ordinal());
                    }
                default:
                    System.out.println("Unknown command. Type h for help");
                    break; 
            }
         } while(true);
    }
}


import java.util.Scanner;

public class SpaceTravel
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the SpaceTravel agency");
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to do ? [h for help]");
      
        
        do
        { 
            String choice = scan.nextLine();  
            char monchoix=choice.charAt(0);         
            switch(monchoix)
            {
                case 'h': 
                    System.out.println("h: print this help screen \n" + "q : quit the program");
                    break;
                case 'q': 
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                case 'l':
                    Planet[] valuesArray = Planet.values(); // Recuperation du tableau
                    for (int i = 0 ; i < valuesArray.length ; i++) // Parcours du tableau
                    { 
                        System.out.println(valuesArray[i]);
                    }
                default:
                    System.out.println("Unknown command. Type h for help");
                    break; 
            }
         } while(true);
    }
}
