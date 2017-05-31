/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.Expressao;
import dominio.controllers.ExpressaoController;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vynicius
 */
public class AlterarExpressaoDialog extends javax.swing.JDialog {

    private final Expressao expressaoAtual;
    private final ExpressaoController controller;
    private boolean alteracaoSucedida = false;

    /**
     * Creates new form AdicionarExpressaoDialog
     *
     * @param parent
     * @param controller
     * @param expressaoAtual
     */
    public AlterarExpressaoDialog(Frame parent, ExpressaoController controller, Expressao expressaoAtual) {
        super(parent, true);
        this.expressaoAtual = expressaoAtual;
        initComponents();
        this.campoExpressao.setText(expressaoAtual.getTexto());
        this.controller = controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoExpressao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botaoAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Expressão");
        setResizable(false);

        jLabel1.setText("Editar Expressão");

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAlterar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        if (campoExpressao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(AlterarExpressaoDialog.this, "Preencha todos os campos", "Campos vazios encontrados",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        Boolean succeeded = this.controller.alterarExpressao(expressaoAtual, campoExpressao.getText());

        if (succeeded) {
            JOptionPane.showMessageDialog(AlterarExpressaoDialog.this, "Expressão Alterada", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            this.alteracaoSucedida = true;
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(AlterarExpressaoDialog.this, "Erro ao alterar expressão: Expressão já existe", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed
    
    public boolean isAlteracaoSucedida(){
        return this.alteracaoSucedida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JTextField campoExpressao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
