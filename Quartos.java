public class Quartos {

    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospede;

    public Quartos(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void ocupar(Hospede hospede){
    if (isOcupado()){
        System.out.printf("O quarto ja esta ocupado o hospede %s não pode ser hospedado\n", hospede.getNome());
        return;
    }

    this.ocupado = true;
    this.hospede = hospede;
    System.out.printf("%s hospedado com sucesso%n", hospede.getNome());
}
    public boolean liberar() {
        if (!this.ocupado) {
            System.out.printf("Quarto %d já está desocupado.%n", this.numero);
            return false;
        }
        this.ocupado = false;
        this.hospede = null;
        System.out.printf("Quarto %d liberado com sucesso.%n", this.numero);
        return true;
    }

}
