
package visualizacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Amigo;
import modelo.Ferramenta;

public class Ferramentavisualizacao extends javax.swing.JFrame {
        Ferramenta ferramenta = new Ferramenta();
    ArrayList minhaLista = new ArrayList();
    public Ferramentavisualizacao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelferramenta = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botaoexcluir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jVoltarferramenta = new javax.swing.JButton();
        jLabelferramenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelferramenta.setBackground(new java.awt.Color(17, 212, 158));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(17, 212, 158));
        jButton2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton2.setText("Adicionar Ferramenta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(17, 212, 158));
        jButton1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton1.setText("Gerenciar Ferramenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botaoexcluir.setBackground(new java.awt.Color(17, 212, 158));
        botaoexcluir.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        botaoexcluir.setText("Excluir Ferramenta");
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(17, 212, 158));
        jButton4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton4.setText("Relatório da Ferramenta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(17, 212, 158));
        jButton5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton5.setText("Custo Total");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(211, 211, 211))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jVoltarferramenta.setBackground(new java.awt.Color(222, 222, 222));
        jVoltarferramenta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jVoltarferramenta.setForeground(new java.awt.Color(255, 255, 255));
        jVoltarferramenta.setText(" < ");
        jVoltarferramenta.setBorder(null);
        jVoltarferramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jVoltarferramentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jVoltarferramentaMouseExited(evt);
            }
        });
        jVoltarferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarferramentaActionPerformed(evt);
            }
        });

        jLabelferramenta.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabelferramenta.setText("Ferramentas");

        javax.swing.GroupLayout jPanelferramentaLayout = new javax.swing.GroupLayout(jPanelferramenta);
        jPanelferramenta.setLayout(jPanelferramentaLayout);
        jPanelferramentaLayout.setHorizontalGroup(
            jPanelferramentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelferramentaLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabelferramenta)
                .addGap(211, 211, 211)
                .addComponent(jVoltarferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelferramentaLayout.setVerticalGroup(
            jPanelferramentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelferramentaLayout.createSequentialGroup()
                .addGroup(jPanelferramentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelferramentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jVoltarferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelferramentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelferramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelferramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVoltarferramentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoltarferramentaMouseEntered

    }//GEN-LAST:event_jVoltarferramentaMouseEntered

    private void jVoltarferramentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoltarferramentaMouseExited

    }//GEN-LAST:event_jVoltarferramentaMouseExited

    private void jVoltarferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarferramentaActionPerformed
        this.setEnabled(false);

    }//GEN-LAST:event_jVoltarferramentaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = JOptionPane.showInputDialog(null,"nome");
        String marca = JOptionPane.showInputDialog(null,"marca");
        double custo = Double.parseDouble(JOptionPane.showInputDialog(null,"custo"));
        ferramenta.addFerramenta(nome, marca, custo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        String Nome = JOptionPane.showInputDialog(null, "Nome:");
        String marca = JOptionPane.showInputDialog(null, "marca:");
        ferramenta.deleteFerramentaBD(Nome,marca); 
    }//GEN-LAST:event_botaoexcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nome = JOptionPane.showInputDialog("Nome: ");
        String Marca = JOptionPane.showInputDialog("Marca: ");
        int ferramentaid = ferramenta.getId(Nome,Marca);
    
        if(ferramentaid == -1){
           JOptionPane.showMessageDialog(null, "Dados não encontrados!"); 
        }else{
            // Definindo o look and feel do sistema operacional
           try {
               UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
               e.printStackTrace();
           }

           // Opções de botões
           String[] options = {"Nome", "Marca", "Custo", "Cancelar"};

           // Mensagem da caixa de diálogo
           String message = "Qual dado você gostaria de alterar?";

           // Título da caixa de diálogo
           String title = "Editando dados de ferramenta";

           // Exibindo o JOptionPane com botões personalizados
           int option = JOptionPane.showOptionDialog(
                   null,                                 // Componente pai
                   message,                              // Mensagem
                   title,                                // Título
                   JOptionPane.YES_NO_CANCEL_OPTION,     // Tipo de opção
                   JOptionPane.QUESTION_MESSAGE,         // Tipo de mensagem
                   null,                                 // Ícone
                   options,                              // Botões personalizados
                   options[0]                            // Botão padrão
           );

           // Tratamento da opção selecionada
           switch (option) {
               case 0: // Salvar
                   String novoNome = JOptionPane.showInputDialog("Novo nome: ");
                   ferramenta.setNome(ferramentaid, novoNome);
                   break;
               case 1: // Não Salvar
                   String novaMarca = JOptionPane.showInputDialog("Nova marca: ");
                   ferramenta.setMarca(ferramentaid, novaMarca);
                   break;
                case 2: // Não Salvar
                   double novoCusto  = Double.parseDouble(JOptionPane.showInputDialog("Novo custo: "));
                   ferramenta.setCusto(ferramentaid, novoCusto);
                   break;
               case 3: // Cancelar
                   JOptionPane.showMessageDialog(null, "Operação cancelada!");
                   break;
               default:
                   System.out.println("Nenhuma opção selecionada");
                   break;
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        minhaLista.clear();
        minhaLista = ferramenta.getFerramenta();
         // Verificar se a lista não está vazia
        String tupla = "Nome | Marca|Custo\n";
        int cont = 0;
        while(cont < minhaLista.size()){
            // Verificar o tipo do primeiro objeto na lista
            Object FerramentaAtual = minhaLista.get(cont);
            if (FerramentaAtual instanceof Ferramenta) {
                // Exibir os dados do amigo atual na lista
                String nome = ((Ferramenta) FerramentaAtual).getNome();
                String marca = ((Ferramenta) FerramentaAtual).getMarca();
                double custo = ((Ferramenta) FerramentaAtual).getCusto();
                tupla += nome+"    ->     "+marca+"    ->     "+custo+"\n";
                cont++;
            } else {
                // Tipo de objeto inesperado
                System.out.println("O objeto na lista não é do tipo Ferramenta.");
            }
        } 
        JOptionPane.showMessageDialog(null, tupla);
        if (minhaLista.isEmpty()){
            // Exibir mensagem informando que a lista está vazia
            JOptionPane.showMessageDialog(null, "A lista de Ferramentas está vazia.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        minhaLista.clear();
        minhaLista = ferramenta.getListaFerramenta();
        double somaCusto = 0; 
        int cont = 0;
        while(cont < minhaLista.size()){
            // Verificar o tipo do primeiro objeto na lista
            Object FerramentaAtual = minhaLista.get(cont);
            if (FerramentaAtual instanceof Ferramenta) {
                somaCusto += ((Ferramenta) FerramentaAtual).getCusto();
            }
            cont++; 
        }
        JOptionPane.showMassageDialog(null,"A soma total do custo das ferramentas equivale à R$ "+somaCusto);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferramentavisualizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabelferramenta;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelferramenta;
    private javax.swing.JButton jVoltarferramenta;
    // End of variables declaration//GEN-END:variables
}
