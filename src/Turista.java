public class Turista {

    //atributos
    private String nome;
    private String cpf;
    //construtor
    Turista(){}
    Turista(String _nome){
        this.nome = _nome;

    }
    //metodos
    public String viajar(){
        return  "Viajou!!!";
    }
    // Getters e Setters

    public String getNome() {
        return nome;
    }

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
