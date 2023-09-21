package classes;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnCalc = new javax.swing.JButton();
        resultImc = new javax.swing.JLabel();
        resultSituation = new javax.swing.JLabel();
        btnCleanAll = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAbout = new javax.swing.JMenu();
        MenuHelp = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora De IMC");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 23)); // NOI18N
        jLabel1.setText("Calculadora de IMC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Altura(M):");

        textHeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textHeight.setForeground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Peso(KG):");

        txtWeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(51, 51, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/altura-icon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso-icon.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        BtnCalc.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        BtnCalc.setForeground(new java.awt.Color(51, 51, 255));
        BtnCalc.setText("Calcular IMC");
        BtnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcActionPerformed(evt);
            }
        });

        resultImc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        resultImc.setForeground(new java.awt.Color(51, 51, 255));
        resultImc.setText("Indíce de massa corporal");

        resultSituation.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        resultSituation.setForeground(new java.awt.Color(255, 51, 51));
        resultSituation.setText("Situação");

        btnCleanAll.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCleanAll.setForeground(new java.awt.Color(255, 51, 51));
        btnCleanAll.setText("Limpar Valores");
        btnCleanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanAllActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Informe Seus Dados:");

        MenuAbout.setText("Sobre");
        MenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuAbout);

        MenuHelp.setText("Ajuda");
        MenuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHelpMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuHelp);

        MenuExit.setText("Sair");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultImc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultSituation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnCalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BtnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(resultImc)
                .addGap(18, 18, 18)
                .addComponent(resultSituation)
                .addGap(44, 44, 44)
                .addComponent(jLabel6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BtnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcActionPerformed
       float altura = Float.parseFloat(textHeight.getText().replaceAll(",", "."));
       float peso = Float.parseFloat(txtWeight.getText().replaceAll(",", "."));
       
       float imc = peso / (altura * altura);
       
       resultImc.setText("Seu Imc: " + Float.toString(imc).format("%.2f", imc));
       
       if(imc < 18.5){
           resultSituation.setText("Abaixo do Peso!");
       }else if(imc >= 18.6 && imc <= 24.9){
           resultSituation.setText("Peso Ideal, Parabéns!");
       }else if(imc >= 25.0 && imc <= 29.9){
           resultSituation.setText("Levemente Acima do Peso!");
       }else if (imc >= 30.0 && imc <= 34.9){
           resultSituation.setText("Obesidade Grau 1!");
       }else if(imc >= 35.0 && imc <= 39.9){
           resultSituation.setText("Obesidade Grau 2! (Severa)");
       }else if(imc > 40){
           resultSituation.setText("Obesidade Grau 3! (Mórbida)");
       }
    }//GEN-LAST:event_BtnCalcActionPerformed

    private void btnCleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanAllActionPerformed
        textHeight.setText("");
        txtWeight.setText("");
        
        resultImc.setText("Indíce de massa corporal");
        resultSituation.setText("Situação");
    }//GEN-LAST:event_btnCleanAllActionPerformed

    private void MenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAboutMouseClicked
        JOptionPane.showMessageDialog(null, "'IMC' Ou índice de massa corporal é uma medida internacional\n usada para calcular se uma pessoa está no peso ideal.");
    }//GEN-LAST:event_MenuAboutMouseClicked

    private void MenuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHelpMouseClicked
        JOptionPane.showMessageDialog(null, "Para Usar é bem simples, basta informar seu peso e altura logo abaixo\n após isso clique em 'Calcular IMC' e o resultado irá aparecer abaixo!");
    }//GEN-LAST:event_MenuHelpMouseClicked

    private void MenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MenuExitMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalc;
    private javax.swing.JMenu MenuAbout;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JButton btnCleanAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel resultImc;
    private javax.swing.JLabel resultSituation;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}