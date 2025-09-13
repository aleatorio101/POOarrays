import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private List<Quartos> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<Quartos>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Quartos> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quartos> quartos) {
        this.quartos = quartos;
    }

    public void adicionarQuarto(Quartos quartos){
        this.quartos.add(quartos);
    }
    public void hospedar(Hospede hospede, int numeroQuarto){
        for (Quartos quarto: quartos) {
            if(quarto.getNumero() == numeroQuarto){
                quarto.ocupar(hospede);
            }
        }
    }

    public void realizarCheckout(int numeroQuarto){
        for (Quartos quarto: quartos) {
            if(quarto.getNumero() == numeroQuarto){
                quarto.liberar();
            }
        }
    }

    public void exibirRelatorio(){
        for (Quartos quarto: quartos) {
            System.out.printf("Status: %s - ", quarto.isOcupado() ? "Ocupado" : "Desocupado");
            System.out.printf("numero: %d - ", quarto.getNumero());
            System.out.printf("tipo: %s - ", quarto.getTipo());
            System.out.printf("preco: %.2f - ", quarto.getPrecoPorNoite());
            System.out.printf("hospedes: %s%n", 
            quarto.getHospede() == null ? "vazio" : quarto.getHospede().getNome());
        }
    }
}
