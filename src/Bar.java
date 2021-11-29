import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Bar {
    private IBarman barman;
    private HashMap<Integer,Client> map;
    private int dernierClient=1;

    public Bar() {
        this.map = new HashMap<Integer,Client>();
        barman = new ProxyBarman();
    }

    public void lire(String filename){
        try {
            Scanner sc = new Scanner(new File(filename));
            String nom;
            int age,id=1;

            while(sc.hasNextLine()){
                id = sc.nextInt();
                nom = sc.next();
                age = sc.nextInt();
                map.put(id,new Client(nom,age));
            }
            dernierClient=id++;
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void veutBoire(Client c){
        if(!map.containsValue(c))
            map.put(dernierClient,c);
        barman.servir(c);
    }
    public void boireTous(){
        for(int i=1;i<map.size()+1;i++){
            barman.servir(map.get(i));
        }
    }
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.lire("clients.txt");
        bar.boireTous();
        bar.veutBoire(new Client("Tristan",19));
    }
}
