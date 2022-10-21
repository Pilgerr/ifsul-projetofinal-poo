package projeto_final_poo_UI;
public class Pessoa_PF {
    String nome;
    String email;
    String celular;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    void ChamadaPessoa(){
        System.out.println(">>> Dados de cadastro da PESSOA: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Celular: " + this.celular);
    }
}
