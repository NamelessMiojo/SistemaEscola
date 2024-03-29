/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AlunoController;
import controller.TurmaController;
import dominio.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import dominio.Turma;
import enumerator.eModEnsino;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author savio
 */
public class telaRelacionar extends javax.swing.JInternalFrame {

    TurmaController controller = new TurmaController();
    AlunoController controllerAluno = new AlunoController();

    /**
     * Creates new form telaRelacionar
     */
    public telaRelacionar() {
        initComponents();
        listar(new Turma(), 2);
        eModEnsino mod;

        DefaultComboBoxModel cbModel = new DefaultComboBoxModel(eModEnsino.values());
        cbModel.insertElementAt("TODOS", 0);
        jcbModEnsino.setModel(cbModel);
        jcbModEnsino.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGPCD = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTurmaCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTurmaNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRBSim = new javax.swing.JRadioButton();
        jRBNao = new javax.swing.JRadioButton();
        jRbAmbos = new javax.swing.JRadioButton();
        jcbModEnsino = new javax.swing.JComboBox<>();
        jBBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTurmaAno = new javax.swing.JTextField();
        jbSelecionar = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOME", "ENSINO", "ANO", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TELA DE TURMAS");

        jLabel2.setText("SELECIONE UMA TURMA");

        jBVoltar.setText("VOLTAR");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Turma"));

        jLabel3.setText("CÓDIGO: ");

        jLabel4.setText("NOME:");

        jLabel11.setText("MODELO DE ENSINO:");

        jLabel8.setText("ALUNO COM DEFICIÊNCIA:");

        bGPCD.add(jRBSim);
        jRBSim.setText("SIM");

        bGPCD.add(jRBNao);
        jRBNao.setText("NÃO");

        bGPCD.add(jRbAmbos);
        jRbAmbos.setText("AMBOS");

        jcbModEnsino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "FUNDAMENTAL", "FUNDAMENTAL I", "MEDIO" }));

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("ANO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBNao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRbAmbos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTurmaCodigo)
                                    .addComponent(txtTurmaNome)
                                    .addComponent(jcbModEnsino, 0, 217, Short.MAX_VALUE)
                                    .addComponent(txtTurmaAno)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jBBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTurmaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTurmaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTurmaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbModEnsino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRBSim)
                    .addComponent(jRBNao)
                    .addComponent(jRbAmbos))
                .addGap(18, 18, 18)
                .addComponent(jBBuscar)
                .addGap(45, 45, 45))
        );

        jbSelecionar.setText("SELECIONAR TURMA");
        jbSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarActionPerformed(evt);
            }
        });

        jbAtualizar.setText("ATUALIZAR TURMA");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jbSelecionar)
                                .addGap(32, 32, 32)
                                .addComponent(jbAtualizar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBVoltar)
                                .addGap(141, 141, 141)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVoltar)
                    .addComponent(jbSelecionar)
                    .addComponent(jbAtualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        Turma t = new Turma();
        Integer pcd = 2;
        t.setCodigo(!txtTurmaCodigo.getText().isEmpty() ? Integer.parseInt(txtTurmaCodigo.getText()) : null);
        t.setNome(!txtTurmaNome.getText().isEmpty() ? txtTurmaNome.getText() : null);
        if (jRBSim.isSelected()) {
            pcd = 1;
        } else if (jRBNao.isSelected()) {
            pcd = 0;
        } else {
            jRbAmbos.setSelected(true);            
        }
        t.setAno(!txtTurmaAno.getText().isEmpty() ? Integer.parseInt(txtTurmaAno.getText()) : null);
        t.setEnsino(jcbModEnsino.getSelectedIndex() != 0 ? jcbModEnsino.getSelectedItem().toString() : null);
        listar(t, pcd);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        Integer codigo = (Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
        Turma turma = controller.buscarTurmaPorCodigo(codigo);
        
        telaRelacionarAluno telaRA = new telaRelacionarAluno(turma);
        telaPrincipal.desktopPane.add(telaRA);
        telaRA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        Integer codigo = (Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
        Turma turma = controller.buscarTurmaPorCodigo(codigo);
        
        telaTurma telaT = new telaTurma(turma);
        telaPrincipal.desktopPane.add(telaT);
        telaT.setVisible(true);
    }//GEN-LAST:event_jbAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(telaRelacionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRelacionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRelacionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRelacionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRelacionar().setVisible(true);
            }
        });
    }

    public void listar(Turma t, Integer pcd) {
        List<Turma> novalista = new ArrayList<Turma>();
        try {
            List<Turma> lista = controller.buscarTurmasFiltrado(t, pcd);            
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);

            if (pcd == 1) {
                for (Turma turma : lista) {
                    List<Aluno> alunos = controllerAluno.buscarTodosAlunosTurma(turma);
                    for (Aluno a : alunos) {
                        if (a.getPCD() == pcd) {
                            if (!novalista.contains(a.getTurma())) {
                                novalista.add(a.getTurma());
                                break;
                            }
                        }

                    }
                }

            }else if (pcd == 0) {
                int aux = 0;
                for (Turma turma : lista) {
                    List<Aluno> alunos = controllerAluno.buscarTodosAlunosTurma(turma);
                    for (Aluno a : alunos) {
                        if (a.getPCD() == 1) {
                            aux = 1;
                        }

                    }
                    if (aux == 0) {
                        novalista.add(turma);

                    }
                    aux=0;
                }

            } else {
                novalista = lista;
            }

            for (Turma turma : novalista) {
                modelo.addRow(new Object[]{
                    turma.getCodigo(),
                    turma.getNome(),
                    turma.getEnsino(),
                    turma.getAno(),
                    turma.getQuantidade()
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Listar" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGPCD;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBNao;
    private javax.swing.JRadioButton jRBSim;
    private javax.swing.JRadioButton jRbAmbos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox<String> jcbModEnsino;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtTurmaAno;
    private javax.swing.JTextField txtTurmaCodigo;
    private javax.swing.JTextField txtTurmaNome;
    // End of variables declaration//GEN-END:variables
}
