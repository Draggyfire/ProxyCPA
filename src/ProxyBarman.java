public class ProxyBarman implements IBarman{
    private Barman b;

    public ProxyBarman() {
        this.b = new Barman();
    }

    @Override
    public void servir(Client c) {
        if(c.estMajeur()){
            b.servir(c);
        }else {
            System.out.println("Désolé tu est mineur");
        }
    }
}
