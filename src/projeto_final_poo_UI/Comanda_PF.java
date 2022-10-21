package projeto_final_poo_UI;
public class Comanda_PF {
    String descricao_prato, valor;

    
    public void setDescricao_prato(String descricao_prato) {
        this.descricao_prato = descricao_prato;
    }
 
    void Valores(){
        if((this.descricao_prato.equals("Hambúrguer Simples")) || (this.descricao_prato.equals("Hambúrguer Duplo")) || (this.descricao_prato.equals("Hambúrguer Triplo"))) {
           if(this.descricao_prato.equals("Hambúrguer Simples")){
               this.valor = "R$ 19,90";
           }
           else if(this.descricao_prato.equals("Hambúrguer Duplo")){
               this.valor = "R$ 24,90";
           }
           else if(this.descricao_prato.equals("Hambúrguer Triplo")){
               this.valor = "R$ 29,90";
           }
        } else {
           System.out.println("Erro");
        }
    }
    
     void ChamadaComanda(){
        System.out.println("\n----- Comanda: -----");
        System.out.println("Item: " + this.descricao_prato);
        System.out.println("Preço: " + this.valor);
    }
}
