public class Main {
    public static void main(String[] args) {
        Hospede lucas = new Hospede("Lucas", "012312312");
        Hospede jose = new Hospede("Jose", "123123123");

        Quartos q1 = new Quartos(1,"Suíte", 123);
        Quartos q2 = new Quartos(2,"Standard", 124);

        Hotel hotel = new Hotel("Hotel Maringá", "Av. Paraná");
        hotel.adicionarQuarto(q1);
        hotel.adicionarQuarto(q2);

        hotel.exibirRelatorio();
        System.out.println("\n======================\n");

        hotel.hospedar(lucas, 1);
        hotel.hospedar(jose, 1);
        hotel.hospedar(jose, 2);

        hotel.exibirRelatorio();

        hotel.realizarCheckout(1);
        hotel.exibirRelatorio();
    }
}
