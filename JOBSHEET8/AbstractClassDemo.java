package JOBSHEET8;
public class AbstractClassDemo {
    public static void main(String[] args) {
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println();
        Ular ular1 = new Ular(true, 2.5, "Tikus", "Padang Rumput");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}
