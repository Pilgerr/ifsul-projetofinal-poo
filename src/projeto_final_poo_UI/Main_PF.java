/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_final_poo_UI;

/**
 *
 * @author kaue
 */
public class Main_PF extends javax.swing.JFrame {

    /**
     * Creates new form Main_PF
     */
    public Main_PF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        b_finalizacao = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        v_nome = new javax.swing.JTextField();
        v_email = new javax.swing.JTextField();
        v_celular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        v_cpf = new javax.swing.JTextField();
        v_data_nasc = new javax.swing.JTextField();
        v_endereco = new javax.swing.JTextField();
        b_pedido = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        v_desc_pedido = new javax.swing.JTextField();
        c_true = new javax.swing.JCheckBox();
        v_atendente = new javax.swing.JTextField();

        jLabel8.setText("Item(s):");

        jRadioButton2.setText("Não");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kaue", "Fabio", "Amanda" }));

        jLabel9.setText("Delivery?");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hambúrguer Simples", "Hambúrguer Duplo", "Hambúrguer Triplo" }));

        b_finalizacao.setText("Finalizar Pedido");
        b_finalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_finalizacaoActionPerformed(evt);
            }
        });

        jLabel10.setText("Atendente:");

        jRadioButton1.setText("Sim");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_final_poo_UI/Logo Grupo Manus (3)_ccexpress.png"))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Celular:");

        v_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_nomeActionPerformed(evt);
            }
        });

        v_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_celularActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço:");

        v_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_enderecoActionPerformed(evt);
            }
        });

        b_pedido.setText("Realizar Pedido");
        b_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pedidoActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        jLabel7.setText("Dt Nasc:");

        jLabel11.setText("Item(s):");

        jLabel12.setText("Delivery?");

        jLabel13.setText("Atendente:");

        c_true.setText("Sim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(v_email)
                            .addComponent(v_celular, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(v_nome))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(v_data_nasc)
                                    .addComponent(v_endereco)
                                    .addComponent(v_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v_desc_pedido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_true)
                                .addGap(0, 153, Short.MAX_VALUE))
                            .addComponent(v_atendente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(b_pedido)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(v_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(v_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(v_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(v_atendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(v_desc_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(c_true)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(v_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(v_data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(v_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(b_pedido)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void v_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_celularActionPerformed

    private void v_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_nomeActionPerformed

    private void v_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_enderecoActionPerformed

    private void b_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pedidoActionPerformed
   
        String s_nome, s_email, s_celular, s_cpf, s_data_nasc, s_endereco, s_desc_pedido, s_atendente;
        boolean delivery;
        
        s_nome = (v_nome.getText());
        s_email = (v_email.getText());
        s_celular = (v_celular.getText());
        s_cpf = (v_cpf.getText());
        s_data_nasc = (v_data_nasc.getText());
        s_endereco = (v_endereco.getText());
        s_desc_pedido = (v_desc_pedido.getText());
        s_atendente = (v_atendente.getText());
        delivery = (c_true.isSelected());
        
        Pessoa_PF P1 = new Pessoa_PF();
        P1.setNome(s_nome);
        P1.setEmail(s_email);
        P1.setCelular(s_celular);
        
        Cliente_PF C1 =  new Cliente_PF();
        C1.setData_nasc(s_data_nasc);
        C1.setEndereco(s_endereco);
        C1.setCpf(s_cpf);
        
        Atendente_PF A1 = new Atendente_PF();
        A1.setNome(s_atendente);
        A1.setMatricula("54525");
        A1.setTurno("Dia");
        
        Comanda_PF CMD1 = new Comanda_PF();
        CMD1.setDescricao_prato(s_desc_pedido);
        CMD1.Valores();
        
        Pedido_PF PED1 = new Pedido_PF();
        PED1.setCliente(C1);
        PED1.setAtendente(A1);
        PED1.setData_hora_pedido("14/04/2004 11:45");
        PED1.setDelivery(delivery);
        
        P1.ChamadaPessoa();
        C1.ChamadaCliente();
        A1.ChamadaAtendente();
        CMD1.ChamadaComanda();
        PED1.ChamadaPedido();
        
        new Conclusao_PF_Frame().setVisible(true);

    }//GEN-LAST:event_b_pedidoActionPerformed

    private void b_finalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_finalizacaoActionPerformed
        new Conclusao_PF_Frame().setVisible(true);
    }//GEN-LAST:event_b_finalizacaoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_PF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_finalizacao;
    private javax.swing.JButton b_pedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JCheckBox c_true;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField v_atendente;
    private javax.swing.JTextField v_celular;
    private javax.swing.JTextField v_cpf;
    private javax.swing.JTextField v_data_nasc;
    private javax.swing.JTextField v_desc_pedido;
    private javax.swing.JTextField v_email;
    private javax.swing.JTextField v_endereco;
    private javax.swing.JTextField v_nome;
    // End of variables declaration//GEN-END:variables
}