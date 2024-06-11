package visualizacao;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Ferramenta;
import modelo.Emprestimo;

public class Emprestimovisualizacao extends javax.swing.JFrame {
    Amigo amigo = new Amigo();
    Ferramenta ferramenta = new Ferramenta();
    Emprestimo emprestimo = new Emprestimo();
    ArrayList<Object> minhaLista = new ArrayList<>();

    public Emprestimovisualizacao() {
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Amigos_com_mais_Empréstimos = new javax.swing.JButton();
        Relatório_de_Empréstimos_ativos = new javax.swing.JButton();
        Escolher_Amigos = new javax.swing.JButton();
        Emprestar_Ferramentas = new javax.swing.JButton();
        Escolher_Ferramentas2 = new javax.swing.JButton();
        Relatório_de_Empréstimos_Realizados1 = new javax.swing.JButton();
        Devolver_Ferramentas1 = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(17, 212, 158));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Amigos_com_mais_Empréstimos.setBackground(new java.awt.Color(17, 212, 158));
        Amigos_com_mais_Empréstimos.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Amigos_com_mais_Empréstimos.setText("Amigos com mais Empréstimos");
        Amigos_com_mais_Empréstimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Amigos_com_mais_EmpréstimosActionPerformed(evt);
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

        Relatório_de_Empréstimos_Realizados1.setBackground(new java.awt.Color(17, 212, 158));
        Relatório_de_Empréstimos_Realizados1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Relatório_de_Empréstimos_Realizados1.setText("Relatório de Empréstimos Realizados");
        Relatório_de_Empréstimos_Realizados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relatório_de_Empréstimos_Realizados1ActionPerformed(evt);
            }
        });

        Devolver_Ferramentas1.setBackground(new java.awt.Color(17, 212, 158));
        Devolver_Ferramentas1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Devolver_Ferramentas1.setText("Devolver Ferramentas");
        Devolver_Ferramentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Devolver_Ferramentas1ActionPerformed(evt);
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
                    .addComponent(Escolher_Amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Devolver_Ferramentas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Amigos_com_mais_Empréstimos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Relatório_de_Empréstimos_ativos, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Relatório_de_Empréstimos_Realizados1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Escolher_Ferramentas2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Relatório_de_Empréstimos_Realizados1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Emprestar_Ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Devolver_Ferramentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Relatório_de_Empréstimos_ativos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Escolher_Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amigos_com_mais_Empréstimos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        Voltar.setBackground(new java.awt.Color(204, 204, 204));
        Voltar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
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
                        .addContainerGap(24, Short.MAX_VALUE)
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

    }//GEN-LAST:event_VoltarMouseEntered

    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited

    }//GEN-LAST:event_VoltarMouseExited

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.setVisible(false);
        Menuvisualizacao menu  = new Menuvisualizacao();
        menu.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void Amigos_com_mais_EmpréstimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Amigos_com_mais_EmpréstimosActionPerformed
         JOptionPane.showMessageDialog(null, emprestimo.AmigoMaisEmprestimos());
    }//GEN-LAST:event_Amigos_com_mais_EmpréstimosActionPerformed

    private void Relatório_de_Empréstimos_ativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatório_de_Empréstimos_ativosActionPerformed
        minhaLista.clear();
        minhaLista = emprestimo.getrelatorioAtivos();
         // Verificar se a lista não está vazia
        String tupla = "AMIGO | FERRAMENTA | DATA DO EMPRESTIMO\n";
        int cont = 0;
        while(cont < minhaLista.size()){
            // Verificar o tipo do primeiro objeto na lista
            Object primeiroEmprestimo = minhaLista.get(cont);
            if (primeiroEmprestimo instanceof Emprestimo) {
                // Exibir os dados do amigo atual na lista
                String amigo_emprestimo = ((Emprestimo) primeiroEmprestimo).getAmigo();
                String ferramenta_emprestimo = ((Emprestimo) primeiroEmprestimo).getFerramenta();
                String dataEmprestimo = ((Emprestimo) primeiroEmprestimo).getDataEmprestimo();
                tupla += amigo_emprestimo+"           "+ferramenta_emprestimo+"                 "+dataEmprestimo+"\n";
                cont++;
            } else {
                // Tipo de objeto inesperado
                System.out.println("O objeto na lista não é do tipo Emprestimo.");
            }
        } 
        
        if (minhaLista.isEmpty()){
            // Exibir mensagem informando que a lista está vazia
            JOptionPane.showMessageDialog(null, "A lista de empréstimos está vazia.");
        }else{JOptionPane.showMessageDialog(null, tupla);}
    }//GEN-LAST:event_Relatório_de_Empréstimos_ativosActionPerformed

    private void Escolher_AmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Escolher_AmigosActionPerformed
        String nome = JOptionPane.showInputDialog(null,"nome do amigo: ");
        String telefone = JOptionPane.showInputDialog(null,"telefone do amigo: ");
        Escolher_Amigos.setText(nome+ " "+ telefone);
    }//GEN-LAST:event_Escolher_AmigosActionPerformed

    private void Emprestar_FerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emprestar_FerramentasActionPerformed
        String[] amigoSelecionado = Escolher_Amigos.getText().split(" ");
        String[] ferramentaSelecionada = Escolher_Ferramentas2.getText().split(" "); 
        int ferramentaid = ferramenta.getId(ferramentaSelecionada[0], ferramentaSelecionada[1]);
        int amigoid = amigo.getIdAmigo(amigoSelecionado[0]);
        String data = JOptionPane.showInputDialog(null, "Data: ");
        if (emprestimo.verificarAmigo(amigoid) != -1){
            emprestimo.addEmprestimo(amigoid, ferramentaid, data);
        }else{
            String resposta = JOptionPane.showInputDialog(null, "Amigo possui emprestimos ativos, deseja emprestar mesmo assim?\n S/N");
            if ((resposta.compareTo("S") == 0) || (resposta.compareTo("s") == 0)){
                emprestimo.addEmprestimo(amigoid, ferramentaid, data);
            } else {
                JOptionPane.showMessageDialog(null, "Empréstimo cancelado!");
            }
        }
    }//GEN-LAST:event_Emprestar_FerramentasActionPerformed

    private void Escolher_Ferramentas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Escolher_Ferramentas2ActionPerformed
        String nome_ferramenta = JOptionPane.showInputDialog(null, "Nome da ferramenta: ");
        String marca_ferramenta = JOptionPane.showInputDialog(null, "Marca da ferramenta: "); 
        Escolher_Ferramentas2.setText(nome_ferramenta+ " "+ marca_ferramenta);
    }//GEN-LAST:event_Escolher_Ferramentas2ActionPerformed

    private void Relatório_de_Empréstimos_Realizados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relatório_de_Empréstimos_Realizados1ActionPerformed
        Emprestimo emprestimosHist = new Emprestimo();
        minhaLista.clear();
        minhaLista = emprestimosHist.getrelatorioRealizados();
         // Verificar se a lista não está vazia
        String tupla = "AMIGO | FERRAMENTA | DATA EMPRESTIMO | DATA DEVOLUÇÃO\n";
        int cont = 0;
         while(cont < minhaLista.size()){
            // Verificar o tipo do primeiro objeto na lista
            Object atualEmprestimo = minhaLista.get(cont);
            if (atualEmprestimo instanceof Emprestimo) {
                // Exibir os dados da primeira ferramenta na lista
                String amigo = ((Emprestimo) atualEmprestimo).getAmigo();
                String ferramenta = ((Emprestimo) atualEmprestimo).getFerramenta();
                String dataEmprestimo = ((Emprestimo) atualEmprestimo).getDataEmprestimo();
                String dataDevolucao = ((Emprestimo) atualEmprestimo).getDataDevolucao();
                tupla += amigo+"           "+ferramenta+"                 "+dataEmprestimo+"                         "+dataDevolucao+"\n";
                cont++;
            } else {
                // Tipo de objeto inesperado
                System.out.println("O objeto na lista não é do tipo Ferramenta.");
            }
        }
        
        if (minhaLista.isEmpty()){
            // Exibir mensagem informando que a lista está vazia
            JOptionPane.showMessageDialog(null, "A lista de empréstimos está vazia.");
        }else{JOptionPane.showMessageDialog(null, tupla);}
    }//GEN-LAST:event_Relatório_de_Empréstimos_Realizados1ActionPerformed

    private void Devolver_Ferramentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Devolver_Ferramentas1ActionPerformed
        String Data_Devolucao = JOptionPane.showInputDialog(null, "Data de devolução");
        String[] amigoSelecionado = Escolher_Amigos.getText().split(" ");
        String[] ferramentaSelecionada = Escolher_Ferramentas2.getText().split(" "); 
        
        int amigoid = amigo.getIdAmigo(amigoSelecionado[0]);
        int ferramentaid = ferramenta.getId(ferramentaSelecionada[0], ferramentaSelecionada[1]);
        
        int emprestimoid = emprestimo.getEmprestimoid(amigoid, ferramentaid);
        emprestimo.addDevolucao(emprestimoid, Data_Devolucao);
    }//GEN-LAST:event_Devolver_Ferramentas1ActionPerformed

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
    private javax.swing.JButton Amigos_com_mais_Empréstimos;
    private javax.swing.JButton Devolver_Ferramentas1;
    private javax.swing.JButton Emprestar_Ferramentas;
    private javax.swing.JButton Escolher_Amigos;
    private javax.swing.JButton Escolher_Ferramentas2;
    private javax.swing.JButton Relatório_de_Empréstimos_Realizados1;
    private javax.swing.JButton Relatório_de_Empréstimos_ativos;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
