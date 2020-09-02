package br.com.listinha1.projeto.continuada1;

import com.sun.prism.paint.Color;
import java.util.Arrays;
import java.util.Random;

public class Continuada1 extends javax.swing.JFrame {

    // Variáveis da Cpu
    Integer valorCpuMax = 0;
    Integer valorCpuMedia = 0;
    Integer valorCpuMin = 100;

    // Variável do disco
    Integer valorDiscoMax = 0;
    Integer valorDiscoMedia = 0;
    Integer valorDiscoMin = 100;

    // Variáveis da memória
    Integer valorMemMax = 0;
    Integer valorMemMedia = 0;
    Integer valorMemMin = 100;

    // Contador de divisão
    Integer contador = 0;

    public Continuada1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLeituras = new javax.swing.JButton();
        pgbCpu = new javax.swing.JProgressBar();
        lblMaxCpuTitulo = new javax.swing.JLabel();
        lblValorMaxCpu = new javax.swing.JLabel();
        lblMediaCpuTitulo = new javax.swing.JLabel();
        lblValorMediaCpu = new javax.swing.JLabel();
        lblMinCpuTitulo = new javax.swing.JLabel();
        lblValorMinCpu = new javax.swing.JLabel();
        pgbDisc = new javax.swing.JProgressBar();
        lblMaxDiscTitulo = new javax.swing.JLabel();
        lblValorMaxDisc = new javax.swing.JLabel();
        lblMediaDiscTitulo = new javax.swing.JLabel();
        lblValorMediaDisc = new javax.swing.JLabel();
        lblMinDiscTitulo = new javax.swing.JLabel();
        lblValorMinDisc = new javax.swing.JLabel();
        pgbMemo = new javax.swing.JProgressBar();
        lblMaxMemoTitulo = new javax.swing.JLabel();
        lblValorMaxMemo = new javax.swing.JLabel();
        lblMediaMemoTitulo = new javax.swing.JLabel();
        lblValorMediaMemo = new javax.swing.JLabel();
        lblMinMemoTitulo = new javax.swing.JLabel();
        lblValorMinMemo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CPU");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DISCO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MEMÓRIA");

        btnLeituras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLeituras.setText("Fazer leitura dos dados");
        btnLeituras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeiturasActionPerformed(evt);
            }
        });

        pgbCpu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pgbCpu.setForeground(new java.awt.Color(51, 51, 51));
        pgbCpu.setToolTipText("");
        pgbCpu.setAutoscrolls(true);
        pgbCpu.setBorder(null);
        pgbCpu.setBorderPainted(false);
        pgbCpu.setStringPainted(true);

        lblMaxCpuTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMaxCpuTitulo.setText("Máximo:");

        lblValorMaxCpu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMediaCpuTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMediaCpuTitulo.setText("Média:");

        lblValorMediaCpu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMinCpuTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMinCpuTitulo.setText("Mínimo:");

        lblValorMinCpu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        pgbDisc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pgbDisc.setToolTipText("");
        pgbDisc.setAutoscrolls(true);
        pgbDisc.setBorder(null);
        pgbDisc.setBorderPainted(false);
        pgbDisc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pgbDisc.setStringPainted(true);

        lblMaxDiscTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMaxDiscTitulo.setText("Máximo:");

        lblValorMaxDisc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMediaDiscTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMediaDiscTitulo.setText("Média:");

        lblValorMediaDisc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMinDiscTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMinDiscTitulo.setText("Mínimo:");

        lblValorMinDisc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        pgbMemo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pgbMemo.setForeground(new java.awt.Color(51, 51, 51));
        pgbMemo.setToolTipText("");
        pgbMemo.setAutoscrolls(true);
        pgbMemo.setBorder(null);
        pgbMemo.setBorderPainted(false);
        pgbMemo.setStringPainted(true);

        lblMaxMemoTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMaxMemoTitulo.setText("Máximo:");

        lblValorMaxMemo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMediaMemoTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMediaMemoTitulo.setText("Média:");

        lblValorMediaMemo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMinMemoTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMinMemoTitulo.setText("Mínimo:");

        lblValorMinMemo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMinCpuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMinCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMediaCpuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMediaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxCpuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMaxCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pgbDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMediaDiscTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMinDiscTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaxDiscTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblValorMediaDisc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(lblValorMinDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblValorMaxDisc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pgbMemo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMediaMemoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMediaMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMinMemoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMinMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxMemoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMaxMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnLeituras)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnLeituras)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgbCpu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(pgbMemo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgbDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaxCpuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorMaxCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMediaCpuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorMediaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMinCpuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorMinCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaxMemoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorMaxMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMediaMemoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorMediaMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMinMemoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorMinMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaxDiscTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorMaxDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMediaDiscTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorMediaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorMinDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMinDiscTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeiturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeiturasActionPerformed

        // Somando ao contador de divisão
        contador++;

        // Gerando valores aleatórios
        Random valorRandom = new Random();

        // Convertendo os valores gerados para Integer
        Integer valorRandomCpu = valorRandom.nextInt(101);
        Integer valorRandomDisco = valorRandom.nextInt(101);
        Integer valorRandomMemo = valorRandom.nextInt(101);

        // Comparando os valores da CPU
        if (valorRandomCpu > valorCpuMax) { // Máximo
            valorCpuMax = valorRandomCpu;
        }

        if (valorRandomCpu < valorCpuMin) { // Mínimo
            valorCpuMin = valorRandomCpu;
        }

        valorCpuMedia += valorRandomCpu; // Média

        //Comparando os valores do Disco
        if (valorRandomDisco > valorDiscoMax) { // Máximo
            valorDiscoMax = valorRandomDisco;
        }

        if (valorRandomDisco < valorDiscoMin) { // Mínimo
            valorDiscoMin = valorRandomDisco;
        }

        valorDiscoMedia += valorRandomDisco; // Média

        // Comparando os valores da memória
        if (valorRandomMemo > valorMemMax) { // Máximo
            valorMemMax = valorRandomMemo;
        }

        if (valorRandomMemo < valorMemMin) { // Mínimo
            valorMemMin = valorRandomMemo;
            
        }

            valorMemMedia += valorRandomMemo; // Média

            // Inserindo os valores nas barras de progresso
            pgbCpu.setValue(valorRandomCpu);
            pgbDisc.setValue(valorRandomDisco);
            pgbMemo.setValue(valorRandomMemo);

            // Convertendo em String e inserindo os valores da CPU
            // Máximo
            lblValorMaxCpu.setText(String.valueOf(valorCpuMax) + "%");

            // Média
            lblValorMediaCpu.setText(String.valueOf((valorCpuMedia) / contador) + "%");

            // Mínimo
            lblValorMinCpu.setText(String.valueOf(valorCpuMin) + "%");

            // Convertendo em String e inserindo os valores da Disco
            // Máximo
            lblValorMaxDisc.setText(String.valueOf(valorDiscoMax) + "%");

            // Média
            lblValorMediaDisc.setText(String.valueOf((valorDiscoMedia) / contador) + "%");

            // Mínimo
            lblValorMinDisc.setText(String.valueOf(valorDiscoMin) + "%");

            // Convertendo em String e inserindo os valores da memória
            // Máximo
            lblValorMaxMemo.setText(String.valueOf(valorMemMax) + "%");

            // Média
            lblValorMediaMemo.setText(String.valueOf((valorMemMedia) / contador) + "%");

            // Mínimo
            lblValorMinMemo.setText(String.valueOf(valorMemMin) + "%");

    }//GEN-LAST:event_btnLeiturasActionPerformed

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
            java.util.logging.Logger.getLogger(Continuada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Continuada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Continuada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Continuada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Continuada1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeituras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMaxCpuTitulo;
    private javax.swing.JLabel lblMaxDiscTitulo;
    private javax.swing.JLabel lblMaxMemoTitulo;
    private javax.swing.JLabel lblMediaCpuTitulo;
    private javax.swing.JLabel lblMediaDiscTitulo;
    private javax.swing.JLabel lblMediaMemoTitulo;
    private javax.swing.JLabel lblMinCpuTitulo;
    private javax.swing.JLabel lblMinDiscTitulo;
    private javax.swing.JLabel lblMinMemoTitulo;
    private javax.swing.JLabel lblValorMaxCpu;
    private javax.swing.JLabel lblValorMaxDisc;
    private javax.swing.JLabel lblValorMaxMemo;
    private javax.swing.JLabel lblValorMediaCpu;
    private javax.swing.JLabel lblValorMediaDisc;
    private javax.swing.JLabel lblValorMediaMemo;
    private javax.swing.JLabel lblValorMinCpu;
    private javax.swing.JLabel lblValorMinDisc;
    private javax.swing.JLabel lblValorMinMemo;
    private javax.swing.JProgressBar pgbCpu;
    public static javax.swing.JProgressBar pgbDisc;
    private javax.swing.JProgressBar pgbMemo;
    // End of variables declaration//GEN-END:variables
}
