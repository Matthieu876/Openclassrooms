import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import vehicules.Vehicule;

public class Garage {
	
	// Prend objet List pour les véhicules
	// Doit charger le contenu du garage à l'instanciation dans Main
	// Deux Méthodes: toString (qui renvoie un string) et add (véhicules) de type void avec sauvegarde dans un fichier
	
	//CONSTRUCTEUR GARAGE
	public Garage() throws IOException{

		List voitures = new LinkedList();
		Path path = Paths.get("fichiers", "voitures.txt");
		// Chargement fichier voitures.txt
		
		for(String ligne: Files.readAllLines(path)){
			System.out.println(ligne);
		}
		System.out.println("\nAjouter un véhicule:");
		Scanner sc = new Scanner(System.in);
		String newCar = sc.nextLine();
		String newEntry = newCar + ": ";
		//ajout de la nouvelle entrée
		Files.write(path, newEntry.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
		
		//purge du scanner avant nouvelle utilisation
		sc.nextLine();
		System.out.println("\nAjouter une option:");
		String newOption = sc.nextLine();
		String newEntry2 = newOption + " ";
		//ajout de la nouvelle entrée:
		Files.write(path, newEntry2.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
		
		//purge du scanner avant nouvelle utilisation
		sc.nextLine();
		System.out.println("\nAjouter Moteur:");
		String newEngine = sc.nextLine();
		String newEntry3 = newEngine + " ";
		//ajout de la nouvelle entrée:
		Files.write(path, newEntry3.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
		
		String backspace = "\n";
		Files.write(path, backspace.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
		
	}
	
	//METHODE TOSTRING
	private String name;
	public String toString(){
		return name;
	}
	
	//METHODE ADD (avec FICHIER)
	public void add(){
		//A COMPLETER
	}

}
