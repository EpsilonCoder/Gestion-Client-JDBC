package présentation;

import java.io.File;
import java.util.Scanner;

import com.agence.dao.ClientImpl;
import com.agence.entities.Client;
import com.jdbc.model.Employee;


public class Presentation {

	public static void main(String[] args) throws Exception {
        boolean enAction=true;
        while (enAction) {
		    ClientImpl implementation=new ClientImpl();
        	Scanner s = new Scanner(System.in);
        	
        	File file=new File("C://Users/simplon/Desktop/Java/Atelier-JDBC/ok.txt");
        	Scanner reader=new Scanner(file);
        	
        	while(reader.hasNextLine()) {
        		String line=reader.nextLine();
        		System.out.println(line);
        		Thread.sleep(100);
        	}
        	System.out.println("1 . Ajouter un client");
        	System.out.println("2 . Aficher tout les clients");
        	System.out.println("3 . Selectionner un client par son Id");
        	System.out.println("4 . Supprimer un client");
        	System.out.println("5 . Modifier un client");
        	System.out.println("6 . Quitter");
        	
        	int choix = Integer.parseInt(s.nextLine());
        	
        	switch (choix) {
        	case 1:
        		System.out.println("Enter le prenom , Nom & telephone du client :");
        		implementation.InsererClient(new Client(s.nextLine(), s.nextLine(), s.nextLine()));
        		break;
        	case 2:
        		implementation.afficherClient();
        		break;
        	case 3:
        		System.out.println("Entrer l identifiant du client que vous cherchez");
        		implementation.afficherClientById(s.nextInt());
        		break;
        	case 4:
        		System.out.println("Entrer l identifiant du client a supprimer");
        		implementation.supprimerClient(s.nextInt());
        		break;
        	case 5:
        		System.out.println("Entrer l identifiant du client a mettre a jour");
				int updateId = Integer.parseInt(s.nextLine());
				
				boolean isfound= implementation.afficherClientById(updateId);
				
				if(isfound) {
					 System.out.println("Entrer, Prenom ,Nom et le Telephone du client");
					 Client clt=new Client(updateId, s.nextLine(),  s.nextLine(),  s.nextLine());
					 implementation.modifierClient(clt); 
				}
        		
        		
        		break;
        	case 6:
        		System.out.println("A Bientot !!!");
        		enAction=false;
        		break;
        	default:
        		System.out.println("Choix non disponible");
        		break;
        	}
		}

	}

}
