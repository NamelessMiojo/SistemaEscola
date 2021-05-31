/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.TurmaController;
import dao.TurmaDao;
import dominio.Turma;
import enumerator.eModEnsino;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class telaTurma extends javax.swing.JFrame {
    
    TurmaController controller = new TurmaController();
    
    /**
     * Creates new form telaTurma
     */
    public telaTurma() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtCodigo.setEnabled(false);
        //List<String> mods = new ArrayList<>();
        //eModEnsino modEnsino;
        //eModEnsino.values().
        //System.out.println(modEnsino.getDescricao());
        
        //ComboBoxModel cbm = new ComboBoxModel();
        jcbModEnsino.setModel(new javax.swing.DefaultComboBoxModel(eModEnsino.values()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCadastrar = new javax.swing.JButton();
        jBAtualizar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcbModEnsino = new javax.swing.JComboBox<>();
        txtAno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBCadastrar.setText("CADASTRAR");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBAtualizar.setText("ATUALIZAR");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBExcluir.setText("EXCLUIR");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TELA TURMA");

        jcbModEnsino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUNDAMENTAL ", "FUNDAMENTAL I", "MEDIO" }));
        jcbModEnsino.setSelectedIndex(-1);

        jLabel11.setText("MODELO DE ENSINO");

        jLabel2.setText("CÓDIGO: ");

        jLabel3.setText("NOME:");

        jLabel4.setText("ANO:");

        jBvoltar.setText("VOLTAR");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbModEnsino, 0, 247, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome)
                        .addComponent(txtCodigo)
                        .addComponent(txtAno, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jBCadastrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBvoltar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbModEnsino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBAtualizar)
                    .addComponent(jBExcluir))
                .addGap(26, 26, 26)
                .addComponent(jBvoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed

        try {
            Integer.parseInt(txtAno.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido!");
            return;
        }

        Turma turma = new Turma();
        turma.setNome(txtNome.getText());
        turma.setAno(Integer.parseInt(txtAno.getText()));
        turma.setEnsino(jcbModEnsino.getSelectedItem().toString());

        
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed

        if(Integer.parseInt(txtAno.getText()) > 0){
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido!");
            return;
        }

        Turma turma = new Turma();
        turma.setCodigo(Integer.parseInt(txtCodigo.getText()));
        turma.setNome(txtNome.getText());
        turma.setAno(Integer.parseInt(txtAno.getText()));

        /*if(jRBSim.isSelected()){
            turma.setPCD(1);
        }else if(jRBNao.isSelected()){
            turma.setPCD(0);
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todas as informações.");
            return;
        }

        //turma.setTurma(turma);

        controller.atualizarCadastro(turma);

        if(turma.getMatricula() != null){
            JOptionPane.showMessageDialog(null, "turma atualizado com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao atualizar turma!");
        }*/
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        Turma turma = null;
        turma = controller.removerTurma(Integer.parseInt(txtCodigo.getText()));

        if(turma != null){
            JOptionPane.showMessageDialog(null, "Registro excluído com Sucesso!");

            telaPrincipal tela = new telaPrincipal();
            tela.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao excluir Registro!");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        telaPrincipal tela = new telaPrincipal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcbModEnsino;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
