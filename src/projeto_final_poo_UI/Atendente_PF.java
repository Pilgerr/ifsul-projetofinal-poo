package projeto_final_poo_UI;
public class Atendente_PF extends Pessoa_PF{
    String matricula;
    String turno;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
     void ChamadaAtendente(){
        System.out.println("\n>>> Dados de cadastro do ATENDENTE: ");
        System.out.println("Nome do atendente: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Turno: " + this.turno);
    }
}
