public class Barman implements IBarman{

    @Override
    public void servir(Client c) {
        System.out.println(c.getNom()+": Glou glou");
    }
}
