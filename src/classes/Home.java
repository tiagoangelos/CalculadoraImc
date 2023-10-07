package classes;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    Imc imc = new Imc();
    
    public Home() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblTitleHeight = new javax.swing.JLabel();
        textHeight = new javax.swing.JTextField();
        lblTitleWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        BtnCalc = new javax.swing.JButton();
        lblResultImc = new javax.swing.JLabel();
        lblResultSituation = new javax.swing.JLabel();
        btnCleanAll = new javax.swing.JButton();
        lblInstruction = new javax.swing.JLabel();
        lblIconHeight = new javax.swing.JLabel();
        lblIconWeight = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAbout = new javax.swing.JMenu();
        MenuHelp = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora De IMC");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Verdana", 1, 23)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Calculadora de IMC");

        lblTitleHeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTitleHeight.setText("Altura(M):");

        textHeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textHeight.setForeground(new java.awt.Color(51, 51, 255));

        lblTitleWeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTitleWeight.setText("Peso(KG):");

        txtWeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(51, 51, 255));

        BtnCalc.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        BtnCalc.setForeground(new java.awt.Color(37, 199, 255));
        BtnCalc.setText("Calcular IMC");
        BtnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcActionPerformed(evt);
            }
        });

        lblResultImc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblResultImc.setForeground(new java.awt.Color(51, 51, 255));
        lblResultImc.setText("Indíce de massa corporal");

        lblResultSituation.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblResultSituation.setForeground(new java.awt.Color(255, 96, 96));
        lblResultSituation.setText("Situação");

        btnCleanAll.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCleanAll.setForeground(new java.awt.Color(255, 96, 96));
        btnCleanAll.setText("Limpar Valores");
        btnCleanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanAllActionPerformed(evt);
            }
        });

        lblInstruction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInstruction.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInstruction.setText("Informe Seus Dados:");

        lblIconHeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/height-icon(64x64).png"))); // NOI18N

        lblIconWeight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weight-icon(64x64).png"))); // NOI18N

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
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconHeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitleHeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addComponent(lblIconWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitleWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblInstruction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultSituation)
                            .addComponent(lblResultImc, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblInstruction)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblTitleWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIconWeight)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTitleHeight)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblIconHeight)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(BtnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblResultImc)
                .addGap(18, 18, 18)
                .addComponent(lblResultSituation)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BtnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcActionPerformed
       float altura = Float.parseFloat(textHeight.getText().replaceAll(",", "."));
       float peso = Float.parseFloat(txtWeight.getText().replaceAll(",", "."));
       
       float calcImc = imc.calcImc(altura, peso);
       String classify = imc.classify(calcImc);
       
       lblResultImc.setText("Seu Imc: " + Float.toString(calcImc).format("%.2f", calcImc));
       lblResultSituation.setText(classify);
    }//GEN-LAST:event_BtnCalcActionPerformed

    private void btnCleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanAllActionPerformed
        textHeight.setText("");
        txtWeight.setText("");
        
        lblResultImc.setText("Indíce de massa corporal");
        lblResultSituation.setText("Situação");
    }//GEN-LAST:event_btnCleanAllActionPerformed

    private void MenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAboutMouseClicked
        JOptionPane.showMessageDialog(null,
                "IMC\n\n"
              + "'IMC' Ou índice de massa corporal é uma medida\n"
              + "internacional usada para calcular se uma\n"
              + "pessoa está no peso ideal."
              , "IMC", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_MenuAboutMouseClicked

    private void MenuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHelpMouseClicked
        JOptionPane.showMessageDialog(null,
                "AJUDA\n\n"
              + "Para Usar é bem simples, basta informar seu peso e altura\n"
              + "logo abaixo após isso clique em Calcular IMC'\n"
              + "e o resultado irá aparecer abaixo!"
              , "AJUDA", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_MenuHelpMouseClicked

    private void MenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMouseClicked
        int response = JOptionPane.showConfirmDialog(null,
              "Sair\n\n"
            + "• Deseja mesmo sair da aplicação ?"
            , "Sair", JOptionPane.INFORMATION_MESSAGE
        );
        
        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
        } 
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblIconHeight;
    private javax.swing.JLabel lblIconWeight;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JLabel lblResultImc;
    private javax.swing.JLabel lblResultSituation;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleHeight;
    private javax.swing.JLabel lblTitleWeight;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}