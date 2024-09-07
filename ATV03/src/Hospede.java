public class Hospede {
    private String nome;
    private int idade;

    public Hospede(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome; // 1ª Dado
    }

    public int getIdade() {
        return idade; // 2ª Dado
    }

    // nome + idade = um espaço na ArrayList e pula pro próximo
}
