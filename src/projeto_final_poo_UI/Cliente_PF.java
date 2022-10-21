package projeto_final_poo_UI;
public class Cliente_PF extends Pessoa_PF{
    String cpf;
    String data_nasc;
    String endereco;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
     void ChamadaCliente(){
        System.out.println("\n>>> Dados de cadastro do CLIENTE: ");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.data_nasc);
        System.out.println("Endereço: " + this.endereco);
    }
    
}
