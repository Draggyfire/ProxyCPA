import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Bar {
    private HashMap<Integer,Client> map;

    public Bar() {
        this.map = new HashMap<Integer,Client>();
    }

    public void lire(String filename){
        try {
            Scanner sc = new Scanner(new File(filename));
            String nom;
            int age,id = 0;

            while(sc.hasNextLine()){
                nom = sc.next();
                age = sc.nextInt();
                map.put(id,new Client(nom,age));
                id++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static void main(String[] args) {

    }
}
