/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.modelos.Expressao;
import dominio.modelos.Usuario;
import dominio.controllers.ExpressaoController;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Vynicius
 */
public class AdmFrame extends javax.swing.JFrame {

    private DefaultListModel listaAdmDeExpressoesModel = new DefaultListModel();
    private DefaultListModel listaBuscaDeExpressoesModel = new DefaultListModel();
    private final ExpressaoController controller;

    public AdmFrame() {
        this.controller = ExpressaoController.getInstance();
        initComponents();

    }

    private void carregarListaAdm() {
        listaAdmDeExpressoesModel.clear();
        this.controller.listarExpressoes().forEach((expressao) -> {
            listaAdmDeExpressoesModel.addElement(expressao);
        });
    }
    
    private void carregarListaBusca(List<Expressao> expressoes) {
        listaBuscaDeExpressoesModel.clear();
        expressoes.forEach((expressao) -> {
            listaBuscaDeExpressoesModel.addElement(expressao);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        listaAdm = new javax.swing.JTabbedPane();
        painelBusca = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        radioPorPalavra = new javax.swing.JRadioButton();
        radioPorLetra = new javax.swing.JRadioButton();
        radioPorQuantidade = new javax.swing.JRadioButton();
        radioFraseExata = new javax.swing.JRadioButton();
        campoPorPalavra = new javax.swing.JTextField();
        campoPorLetra = new javax.swing.JTextField();
        campoPorQuantidade = new javax.swing.JSpinner();
        campoPorFraseExata = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        radioBuscaLivre = new javax.swing.JRadioButton();
        campoBuscaLivre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaBusca = new javax.swing.JList<>();
        painelAlteracao = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botaoAdicionar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        botaoLogin = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        buttonGroup1.add(radioPorPalavra);
        radioPorPalavra.setSelected(true);
        radioPorPalavra.setText("Por Palavra");

        buttonGroup1.add(radioPorLetra);
        radioPorLetra.setText("Por letra inicial");

        buttonGroup1.add(radioPorQuantidade);
        radioPorQuantidade.setText("Por Quantidade");
        radioPorQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPorQuantidadeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioFraseExata);
        radioFraseExata.setText("Frase Exata");

        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBuscaLivre);
        radioBuscaLivre.setText("Livre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioPorLetra)
                    .addComponent(radioPorQuantidade)
                    .addComponent(radioPorPalavra))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPorQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(radioBuscaLivre)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campoPorPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(radioFraseExata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoBuscaLivre)
                            .addComponent(campoPorFraseExata, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPorPalavra)
                    .addComponent(campoPorPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFraseExata)
                    .addComponent(campoPorFraseExata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPorLetra)
                            .addComponent(campoPorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBuscaLivre)
                            .addComponent(campoBuscaLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPorQuantidade)
                    .addComponent(campoPorQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        listaBusca.setModel(listaBuscaDeExpressoesModel);
        jScrollPane1.setViewportView(listaBusca);

        javax.swing.GroupLayout painelBuscaLayout = new javax.swing.GroupLayout(painelBusca);
        painelBusca.setLayout(painelBuscaLayout);
        painelBuscaLayout.setHorizontalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        painelBuscaLayout.setVerticalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        listaAdm.addTab("Busca de Expressões", painelBusca);

        painelAlteracao.setFocusCycleRoot(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoAdicionar.setText("Adicionar Expressão");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar Expressão");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover Expressão");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        jList2.setModel(listaAdmDeExpressoesModel);
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout painelAlteracaoLayout = new javax.swing.GroupLayout(painelAlteracao);
        painelAlteracao.setLayout(painelAlteracaoLayout);
        painelAlteracaoLayout.setHorizontalGroup(
            painelAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlteracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelAlteracaoLayout.setVerticalGroup(
            painelAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlteracaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        listaAdm.addTab("Alteração de Expressões", painelAlteracao);

        botaoLogin.setText("Login");
        botaoLogin.setName("botaoLogin"); // NOI18N
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        loginLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaAdm)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginLabel)
                        .addGap(18, 18, 18)
                        .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLogin)
                    .addComponent(loginLabel))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        LoginDialog dialog = new LoginDialog(this);
        dialog.setVisible(true);
        Usuario usuarioLogado = dialog.getUsuarioLogado();
        if(dialog.getUsuarioLogado() != null)
            this.atualizarLoginLabel(usuarioLogado.getNome());
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        if (this.jList2.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(AdmFrame.this, "Selecione algum elemento", "",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(this.jList2.getSelectedValue());
        AlterarExpressaoDialog dialog = new AlterarExpressaoDialog(this, this.controller, this.jList2.getSelectedValue());
        dialog.setVisible(true);
        if(dialog.isAlteracaoSucedida())
            carregarListaAdm();
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        AdicionarExpressaoDialog dialog = new AdicionarExpressaoDialog(this, controller);
        dialog.setVisible(true);
        if(dialog.isAdicaoSucedida())
            carregarListaAdm();
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed

        if (this.jList2.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(AdmFrame.this, "Selecione algum elemento", "",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Boolean succeeded = this.controller.removerExpressao(this.jList2.getSelectedValue());

        if (succeeded) {
            JOptionPane.showMessageDialog(AdmFrame.this, "Expressão Removida", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            this.carregarListaAdm();

        } else {
            JOptionPane.showMessageDialog(AdmFrame.this, "Erro ao remover expressão: Expressão não encontrada", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void radioPorQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPorQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPorQuantidadeActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        if (radioPorLetra.isSelected()) {
            if (campoPorLetra.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(AdmFrame.this, "Preencha todos os campos", "Campos vazios encontrados",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.carregarListaBusca(this.controller.listarPorLetraInicial(this.campoPorLetra.getText()));
        }else if(radioPorQuantidade.isSelected()){
            this.carregarListaBusca(this.controller.listarPorNumeroPalavras((int)campoPorQuantidade.getValue()));
        }else if(radioPorPalavra.isSelected()){
            if (campoPorPalavra.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(AdmFrame.this, "Preencha todos os campos", "Campos vazios encontrados",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.carregarListaBusca(this.controller.listarPorPalavra(this.campoPorPalavra.getText()));
        }else if(radioFraseExata.isSelected()){
            if (campoPorFraseExata.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(AdmFrame.this, "Preencha todos os campos", "Campos vazios encontrados",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.carregarListaBusca(this.controller.listarPorFraseExata(this.campoPorFraseExata.getText()));
        }else if(radioBuscaLivre.isSelected()){
            if (campoBuscaLivre.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(AdmFrame.this, "Preencha todos os campos", "Campos vazios encontrados",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.carregarListaBusca(this.controller.listarPorFraseLivre(this.campoBuscaLivre.getText()));
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void atualizarLoginLabel(String texto) {
        this.listaAdm.setEnabledAt(1, true);
        this.botaoLogin.setVisible(false);
        this.loginLabel.setText("Administrador " + texto + " logado");
        carregarListaAdm();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {

            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    break;
                }
            }*/
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            AdmFrame tela = new AdmFrame();
            tela.setVisible(true);
            tela.listaAdm.setEnabledAt(1, false);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoBuscaLivre;
    private javax.swing.JTextField campoPorFraseExata;
    private javax.swing.JTextField campoPorLetra;
    private javax.swing.JTextField campoPorPalavra;
    private javax.swing.JSpinner campoPorQuantidade;
    private javax.swing.JList<Expressao> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane listaAdm;
    private javax.swing.JList<Expressao> listaBusca;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel painelAlteracao;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JRadioButton radioBuscaLivre;
    private javax.swing.JRadioButton radioFraseExata;
    private javax.swing.JRadioButton radioPorLetra;
    private javax.swing.JRadioButton radioPorPalavra;
    private javax.swing.JRadioButton radioPorQuantidade;
    // End of variables declaration//GEN-END:variables
}
