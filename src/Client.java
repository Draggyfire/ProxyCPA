public class Client {
    private int age;
    private String nom;

    public Client(String nom,int age) {
        this.age = age;
        this.nom= nom;

    }

    public boolean estMajeur(){
        return age >=18;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }
}