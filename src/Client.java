public class Client {
    private int age;
    private String nom;

    public Client(int age) {
        this.age = age;
    }

    public boolean estMajeur(){
        return age >=18;
    }
}
