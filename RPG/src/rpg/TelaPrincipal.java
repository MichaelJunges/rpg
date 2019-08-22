/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author michael.junges
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    Personagem personagem1;
    Inimigo inimigo1;
    
    public TelaPrincipal() {
        initComponents();
        personagem1 = new Personagem();
        inimigo1 = new Inimigo();
        
        personagem1.setNome("Draconato");
        personagem1.setVida(1000);
        personagem1.setAtaque(100);
        
        inimigo1.setNome("Tiamat");
        inimigo1.setVida(6000);
        inimigo1.setAtaque(2000);
        
        LblNomePerso.setText(personagem1.getNome());
        LblVidaPerso.setText(String.valueOf(personagem1.getVida()));
        LblAtaquePerso.setText(String.valueOf(personagem1.getAtaque()));

        LblNomeIni.setText(inimigo1.getNome());
        LblVidaIni.setText(String.valueOf(inimigo1.getVida()));
        LblAtaqueIni.setText(String.valueOf(inimigo1.getAtaque()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAtacar = new javax.swing.JButton();
        LblNome = new javax.swing.JLabel();
        LblVida = new javax.swing.JLabel();
        LblAtaque = new javax.swing.JLabel();
        LblNome2 = new javax.swing.JLabel();
        LblVida2 = new javax.swing.JLabel();
        LblAtaque2 = new javax.swing.JLabel();
        LblNomePerso = new javax.swing.JLabel();
        LblVidaPerso = new javax.swing.JLabel();
        LblAtaquePerso = new javax.swing.JLabel();
        LblNomeIni = new javax.swing.JLabel();
        LblVidaIni = new javax.swing.JLabel();
        LblAtaqueIni = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAtacar.setText("Atacar");
        BtnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtacarActionPerformed(evt);
            }
        });

        LblNome.setText("Personagem:");

        LblVida.setText("Vida:");

        LblAtaque.setText("Ataque:");

        LblNome2.setText("Inimigo:");

        LblVida2.setText("Vida:");

        LblAtaque2.setText("Ataque:");

        LblNomePerso.setText("...");

        LblVidaPerso.setText("...");

        LblAtaquePerso.setText("...");

        LblNomeIni.setText("...");

        LblVidaIni.setText("...");

        LblAtaqueIni.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNome)
                    .addComponent(LblVida)
                    .addComponent(LblAtaque))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAtaquePerso)
                    .addComponent(LblNomePerso)
                    .addComponent(LblVidaPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblAtaque2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblVida2)
                            .addComponent(LblNome2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNomeIni)
                    .addComponent(LblVidaIni)
                    .addComponent(LblAtaqueIni))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(BtnAtacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNome)
                    .addComponent(LblNome2)
                    .addComponent(LblNomePerso)
                    .addComponent(LblNomeIni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblVida)
                    .addComponent(LblVida2)
                    .addComponent(LblVidaPerso)
                    .addComponent(LblVidaIni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblAtaque)
                    .addComponent(LblAtaque2)
                    .addComponent(LblAtaquePerso)
                    .addComponent(LblAtaqueIni))
                .addGap(18, 18, 18)
                .addComponent(BtnAtacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtacarActionPerformed
        
        
    }//GEN-LAST:event_BtnAtacarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtacar;
    private javax.swing.JLabel LblAtaque;
    private javax.swing.JLabel LblAtaque2;
    private javax.swing.JLabel LblAtaqueIni;
    private javax.swing.JLabel LblAtaquePerso;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNome2;
    private javax.swing.JLabel LblNomeIni;
    private javax.swing.JLabel LblNomePerso;
    private javax.swing.JLabel LblVida;
    private javax.swing.JLabel LblVida2;
    private javax.swing.JLabel LblVidaIni;
    private javax.swing.JLabel LblVidaPerso;
    // End of variables declaration//GEN-END:variables
}
