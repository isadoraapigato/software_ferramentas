
package visualizacao;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Ferramenta;

public class Emprestimovisualizacao extends javax.swing.JFrame {
    Amigo amigo = new Amigo();
    Ferramenta ferramenta = new Ferramenta();
    
    Color whiteColor = Color.decode("#6E6E6E");
    public Emprestimovisualizacao() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Relatório_de_Empréstimos_Realizados = new javax.swing.JButton();
        Relatório_de_Empréstimos_ativos = new javax.swing.JButton();
        Escolher_Amigos = new javax.swing.JButton();
        Emprestar_Ferramentas = new javax.swing.JButton();
        Escolher_Ferramentas2 = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(17, 212, 158));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Relatório_de_Empréstimos_Realizados.setBackground(new java.awt.Color(17, 212, 158));
        Relatório_de_Empréstimos_Realizados.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Relatório_de_Empréstimos_Realizados.setText("Relatório de Empréstimos Realizados");
        Relatório_de_Empréstimos_Realizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatório_de_Empréstimos_RealizadosActionPerformed(evt);
            }
        });

        Relatório_de_Empréstimos_ativos.setBackground(new java.awt.Color(17, 212, 158));
        Relatório_de_Empréstimos_ativos.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Relatório_de_Empréstimos_ativos.setText("Relatório de Empréstimos Ativos");
        Relatório_de_Empréstimos_ativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatório_de_Empréstimos_ativosActionPerformed(evt);
            }
        });

        Escolher_Amigos.setBackground(new java.awt.Color(17, 212, 158));
        Escolher_Amigos.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Escolher_Amigos.setText("Escolher Amigos");
        Escolher_Amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Escolher_AmigosActionPerformed(evt);
            }
        });

        Emprestar_Ferramentas.setBackground(new java.awt.Color(17, 212, 158));
        Emprestar_Ferramentas.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Emprestar_Ferramentas.setText("Emprestar Ferramentas");
        Emprestar_Ferramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emprestar_FerramentasActionPerformed(evt);
            }
        });

        Escolher_Ferramentas2.setBackground(new java.awt.Color(17, 212, 158));
        Escolher_Ferramentas2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Escolher_Ferramentas2.setText("Escolher Ferramentas");
        Escolher_Ferramentas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Escolher_Ferramentas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Escolher_Ferramentas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Emprestar_Ferramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Escolher_Amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Relatório_de_Empréstimos_ativos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Relatório_de_Empréstimos_Realizados, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Escolher_Ferramentas2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Relatório_de_Empréstimos_ativos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Emprestar_Ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Escolher_Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Relatório_de_Empréstimos_Realizados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Voltar.setBackground(new java.awt.Color(222, 222, 222));
        Voltar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Voltar.setText(" < ");
        Voltar.setBorder(null);
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarMouseExited(evt);
            }
        });
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setText("Empréstimo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseEntered
        Voltar.setBackground(whiteColor);
    }//GEN-LAST:event_VoltarMouseEntered

    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited

    }//GEN-LAST:event_VoltarMouseExited

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.setEnabled(false);
 

    }//GEN-LAST:event_VoltarActionPerformed

    private void Relatório_de_Empréstimos_RealizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatório_de_Empréstimos_RealizadosActionPerformed
        String nome = JOptionPane.showInputDialog(null,"nome");
        String telefone = JOptionPane.showInputDialog(null,"telefone");
        amigo.addAmigo(nome, telefone);
    }//GEN-LAST:event_Relatório_de_Empréstimos_RealizadosActionPerformed

    private void Relatório_de_Empréstimos_ativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatório_de_Empréstimos_ativosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Relatório_de_Empréstimos_ativosActionPerformed

    private void Escolher_AmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Escolher_AmigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Escolher_AmigosActionPerformed

    private void Emprestar_FerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emprestar_FerramentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emprestar_FerramentasActionPerformed

    private void Escolher_Ferramentas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Escolher_Ferramentas2ActionPerformed
        String nome_ferramenta = JOptionPane.showInputDialog(null, "Nome da ferramenta: ");
        String marca_ferramenta = JOptionPane.showInputDialog(null, "Marca da ferramenta: "); 
        Escolher_Ferramentas2.setText(nome_ferramenta+ " "+ marca_ferramenta);
    }//GEN-LAST:event_Escolher_Ferramentas2ActionPerformed

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
            java.util.logging.Logger.getLogger(Emprestimovisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestimovisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestimovisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimovisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprestimovisualizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Emprestar_Ferramentas;
    private javax.swing.JButton Escolher_Amigos;
    private javax.swing.JButton Escolher_Ferramentas2;
    private javax.swing.JButton Relatório_de_Empréstimos_Realizados;
    private javax.swing.JButton Relatório_de_Empréstimos_ativos;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
