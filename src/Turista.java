public class Turista {

    //atributos
    private String nome;
    private String cpf;
    //construtor
    Turista(){}

    Turista(String _nome, String _cpf){
        this.nome = _nome;
        this.cpf = _cpf;

    }

    public Turista(String lindsay) {

    }

    //metodos
    public String viajar(){
        return  "Viajou!!!";
    }
    // Getters e Setters

    public String getNome() {
        return nome;
    }
    //sobrecarga do construtor
    public void setNome(String nome) {
        // validar nome
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // validar CPF

        this.cpf = cpf;
    }
}
