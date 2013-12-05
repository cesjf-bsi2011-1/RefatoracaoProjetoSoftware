/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aluguelautomoveis.controllerview;

import com.aluguelautomoveis.model.Automovel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.aluguelautomoveis.model.dao.AutomovelDao;

/**
 *
 * @author Locadora de Veículo
 */
public class FormCadastroAutomovel extends javax.swing.JFrame {

    /**
     * Creates new form FormCadastroAutomovel
     */
    public FormCadastroAutomovel() {
        initComponents();
    }

    Automovel auto = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtmodelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jfplaca = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jfano = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtcor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jccombustivel = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jcportas = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jfvalor = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jtstatus = new javax.swing.JTextField();
        jtmarca = new javax.swing.JTextField();
        jtchassi = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jctipo = new javax.swing.JComboBox();
        jbinserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jfplacabusca = new javax.swing.JFormattedTextField();
        btpesquisar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        btpesquisartodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtauto = new javax.swing.JTable();
        jbeditarauto = new javax.swing.JButton();
        jbexcluir = new javax.swing.JButton();
        jbatualizar = new javax.swing.JButton();
        jbsair = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Automóvel"));

        jLabel1.setText("Modelo");

        jLabel2.setText("Placa");

        try {
            jfplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfplacaActionPerformed(evt);
            }
        });

        jLabel3.setText("Ano");

        try {
            jfano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfanoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cor");

        jLabel5.setText("Marca");

        jLabel6.setText("Combustível");

        jccombustivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Gasolina", " Etanol", " Diesel", " Flex" }));
        jccombustivel.setSelectedIndex(-1);

        jLabel7.setText("Portas");

        jcportas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2 Portas", "4 Portas ", "Não Possui" }));
        jcportas.setSelectedIndex(-1);

        jLabel8.setText("Chassi");

        jLabel10.setText("Valor R$");

        try {
            jfvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Status");

        jtstatus.setEnabled(false);
        jtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtstatusActionPerformed(evt);
            }
        });

        try {
            jtchassi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#?????###??######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Tipo");

        jctipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A - Moto", "B - Carro", "C - Caminhonete", "D - Ônibus", "E - Caminhão" }));
        jctipo.setSelectedIndex(-1);
        jctipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jccombustivel, 0, 117, Short.MAX_VALUE)
                    .addComponent(jtmarca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jcportas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtchassi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtmodelo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtstatus)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jctipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jfplaca, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtcor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jfano, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jccombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcportas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtchassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbinserir.setText("Inserir Automóvel");
        jbinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinserirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Automóvel"));

        jLabel12.setText("Placa");

        try {
            jfplacabusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfplacabusca.setEnabled(false);
        jfplacabusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfplacabuscaActionPerformed(evt);
            }
        });

        btpesquisar.setText("Pesquisar");
        btpesquisar.setEnabled(false);
        btpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisarActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Pesquisar Automóvel ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btpesquisartodos.setText("Pesquisar Todos");
        btpesquisartodos.setEnabled(false);
        btpesquisartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisartodosActionPerformed(evt);
            }
        });

        jtauto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Cor", "Ano", "Valor", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtauto.getTableHeader().setReorderingAllowed(false);
        jtauto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtautoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtauto);
        if (jtauto.getColumnModel().getColumnCount() > 0) {
            jtauto.getColumnModel().getColumn(0).setResizable(false);
            jtauto.getColumnModel().getColumn(1).setResizable(false);
            jtauto.getColumnModel().getColumn(2).setResizable(false);
            jtauto.getColumnModel().getColumn(3).setResizable(false);
            jtauto.getColumnModel().getColumn(4).setResizable(false);
            jtauto.getColumnModel().getColumn(5).setResizable(false);
        }

        jbeditarauto.setText("Editar Automóvel");
        jbeditarauto.setEnabled(false);
        jbeditarauto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditarautoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jfplacabusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btpesquisartodos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbeditarauto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(0, 375, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfplacabusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpesquisar)
                    .addComponent(btpesquisartodos)
                    .addComponent(jbeditarauto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
        );

        jbexcluir.setText("Excluir Automóvel");
        jbexcluir.setEnabled(false);
        jbexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbexcluirActionPerformed(evt);
            }
        });

        jbatualizar.setText("Atualizar Automóvel");
        jbatualizar.setEnabled(false);
        jbatualizar.setMaximumSize(new java.awt.Dimension(145, 27));
        jbatualizar.setMinimumSize(new java.awt.Dimension(145, 27));
        jbatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbatualizarActionPerformed(evt);
            }
        });

        jbsair.setText("Sair");
        jbsair.setMaximumSize(new java.awt.Dimension(145, 27));
        jbsair.setMinimumSize(new java.awt.Dimension(145, 27));
        jbsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsairActionPerformed(evt);
            }
        });

        jblimpar.setText("Limpar Busca");
        jblimpar.setEnabled(false);
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbinserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jblimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblimpar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbinserir)
                        .addComponent(jbexcluir)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinserirActionPerformed

        if (checacampos(null) == true) {
            Automovel auto = new Automovel();
            auto.setMarca(jtmarca.getText());
            auto.setModelo(jtmodelo.getText());
            auto.setCor(jtcor.getText());
            auto.setAno(jfano.getText());
            auto.setCombustivel(jccombustivel.getSelectedItem().toString());
            auto.setValor(Float.parseFloat(jfvalor.getText()));
            auto.setPortas(jcportas.getSelectedItem().toString());
            auto.setChassi(jtchassi.getText());
            auto.setStatus("Disponível");
            auto.setPlaca(jfplaca.getText());
            auto.setTipo(jctipo.getSelectedItem().toString());

            if (AutomovelDao.getAutomovel(auto.getPlaca()) == null) {
                AutomovelDao.addAutomovel(auto);
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
                limpacampos();
            } else {
                JOptionPane.showMessageDialog(null, "Já existe Automóvel cadastrado com esta placa!");
            }
        } else {

        }
    }//GEN-LAST:event_jbinserirActionPerformed

    private void jbsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsairActionPerformed
        this.dispose();

    }//GEN-LAST:event_jbsairActionPerformed

    private void btpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisarActionPerformed
        limparTabelaAutomovel();
        auto = AutomovelDao.getAutomovel(jfplacabusca.getText());

        DefaultTableModel modelo = (DefaultTableModel) jtauto.getModel();
        if (auto != null) {
            modelo.addRow(auto.getAutomovel());
            jfplacabusca.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Automóvel Inexistente!\nNão foi possivel encontrar o Automóvel especificado!", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
        }
        jfplacabusca.setText(null);
    }//GEN-LAST:event_btpesquisarActionPerformed


    private void jfplacabuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfplacabuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfplacabuscaActionPerformed

    private void jbexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexcluirActionPerformed

        String placa = jfplaca.getText();
        if (AutomovelDao.getAutomovel(placa) != null) {

            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este automóvel?", "Remover", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == 0) {

                if (auto.getStatus().equals("Alugado")) {

                    JOptionPane.showMessageDialog(null, "Automóvel não pode ser removido, pois encontra-se Alugado!", "Atenção", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (auto != null) {

                        AutomovelDao.removerAutomovel(placa);
                        JOptionPane.showMessageDialog(null, "O automóvel foi removido com sucesso!!!");
                        limparTabelaAutomovel();
                        limpacampos();
                        jtmarca.setEnabled(true);
                        jctipo.setEnabled(true);
                        jtmodelo.setEnabled(true);
                        jtcor.setEnabled(true);
                        jfano.setEnabled(true);
                        jccombustivel.setEnabled(true);
                        jfvalor.setEnabled(true);
                        jcportas.setEnabled(true);
                        jtchassi.setEnabled(true);
                        jfplaca.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Automóvel não pode ser removido, pois não existe no sistema!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    }
                    jbexcluir.setEnabled(false);
                    jbatualizar.setEnabled(false);
                    jbinserir.setEnabled(true);
                    limpacampos();
                    jfplaca.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_jbexcluirActionPerformed

    private void jbatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbatualizarActionPerformed
        if (auto.getStatus() == "Alugado") {

            JOptionPane.showMessageDialog(null, "Automóvel não pode ser Atualizado pois encontra-se Alugado!", "Atenção", JOptionPane.ERROR_MESSAGE);
        } else {

            auto = new Automovel();
            auto.setMarca(jtmarca.getText());
            auto.setModelo(jtmodelo.getText());
            auto.setCor(jtcor.getText());
            auto.setAno(jfano.getText());
            auto.setCombustivel(jccombustivel.getSelectedItem().toString());
            auto.setValor(Float.parseFloat(jfvalor.getText()));
            auto.setPortas(jcportas.getSelectedItem().toString());
            auto.setChassi(jtchassi.getText());
            auto.setPlaca(jfplaca.getText());
            auto.setTipo(jctipo.getSelectedItem().toString());
            auto.setStatus(jtstatus.getText());

            AutomovelDao.atualizarAutomovel(auto);

            JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");
            limparTabelaAutomovel();
            limpacampos();
            jbeditarauto.setEnabled(false);
            btpesquisar.setEnabled(false);
            btpesquisartodos.setEnabled(false);
            jbexcluir.setEnabled(false);
            jbatualizar.setEnabled(false);
            jCheckBox1.setSelected(false);
            jbinserir.setEnabled(true);

    }//GEN-LAST:event_jbatualizarActionPerformed
    }
    private void jfanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfanoActionPerformed

    private void jtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtstatusActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtstatus.setText("Disponível");        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jfplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfplacaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jtmarca.setEnabled(false);
            jctipo.setEnabled(false);
            jtmodelo.setEnabled(false);
            jtcor.setEnabled(false);
            jfano.setEnabled(false);
            jccombustivel.setEnabled(false);
            jfvalor.setEnabled(false);
            jcportas.setEnabled(false);
            jtchassi.setEnabled(false);
            jfplaca.setEnabled(false);
            jfplacabusca.setEnabled(false);
            jfplacabusca.setEnabled(true);
            btpesquisar.setEnabled(true);
            btpesquisartodos.setEnabled(true);
            jblimpar.setEnabled(true);
            limpacampos();
            limparTabelaAutomovel();
        } else {
            jfplacabusca.setEnabled(false);
            btpesquisar.setEnabled(false);
            btpesquisartodos.setEnabled(false);
            jblimpar.setEnabled(false);
            jtmarca.setEnabled(true);
            jctipo.setEnabled(true);
            jtmodelo.setEnabled(true);
            jtcor.setEnabled(true);
            jfano.setEnabled(true);
            jccombustivel.setEnabled(true);
            jfvalor.setEnabled(true);
            jcportas.setEnabled(true);
            jtchassi.setEnabled(true);
            jfplaca.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jctipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jctipoActionPerformed

    private void btpesquisartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisartodosActionPerformed
        limpacampos();

        jfplaca.setText("");

        ArrayList<Automovel> lista = AutomovelDao.getTodosAutomoveis();

        DefaultTableModel modelo = (DefaultTableModel) jtauto.getModel();

        if (!lista.isEmpty()) {

            for (int i = 0; i < lista.size(); i++) {

                modelo.addRow(lista.get(i).getAutomovel());

            }
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não existe Automóveis disponíveis para locação!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Automóvel cadastrado!", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btpesquisartodosActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        limparTabelaAutomovel();
        limpacampos();
        jbeditarauto.setEnabled(false);
        btpesquisar.setEnabled(false);
        btpesquisartodos.setEnabled(false);
        jbexcluir.setEnabled(false);
        jbatualizar.setEnabled(false);
        jCheckBox1.setSelected(false);
        jbinserir.setEnabled(true);
    }//GEN-LAST:event_jblimparActionPerformed

    private void jtautoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtautoMouseClicked
        if (jtauto.getSelectedRow() >= -1) {
            jbeditarauto.setEnabled(true);
            btpesquisar.setEnabled(false);
            btpesquisartodos.setEnabled(false);
            jbatualizar.setEnabled(false);
            jbexcluir.setEnabled(false);
            jbinserir.setEnabled(false);
        } else {

        }

    }//GEN-LAST:event_jtautoMouseClicked

    private void jbeditarautoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditarautoActionPerformed
        int linha = jtauto.getSelectedRow();
        String placa = ((String) jtauto.getModel().getValueAt(linha, 5));
        auto = AutomovelDao.getAutomovel(placa);

        jtmarca.setText(auto.getMarca());
        jtstatus.setText(auto.getStatus());
        jtmodelo.setText(auto.getModelo());
        jtcor.setText(auto.getCor());
        jfano.setText(auto.getAno());
        jccombustivel.setSelectedItem(auto.getCombustivel());
        jfvalor.setText(String.valueOf(auto.getValor()));
        jcportas.setSelectedItem(auto.getPortas());
        jtchassi.setText(auto.getChassi());
        jfplaca.setText(auto.getPlaca());
        jctipo.setSelectedItem(auto.getTipo());
        jtmarca.setEnabled(true);
        jctipo.setEnabled(true);
        jtmodelo.setEnabled(true);
        jtcor.setEnabled(true);
        jfano.setEnabled(true);
        jccombustivel.setEnabled(true);
        jfvalor.setEnabled(true);
        jcportas.setEnabled(true);
        jtchassi.setEnabled(true);
        jfplaca.setEnabled(true);
        jbexcluir.setEnabled(true);
        jbatualizar.setEnabled(true);
        jbeditarauto.setEnabled(false);
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jbeditarautoActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroAutomovel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpesquisar;
    private javax.swing.JButton btpesquisartodos;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbatualizar;
    private javax.swing.JButton jbeditarauto;
    private javax.swing.JButton jbexcluir;
    private javax.swing.JButton jbinserir;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jbsair;
    private javax.swing.JComboBox jccombustivel;
    private javax.swing.JComboBox jcportas;
    private javax.swing.JComboBox jctipo;
    private javax.swing.JFormattedTextField jfano;
    private javax.swing.JFormattedTextField jfplaca;
    private javax.swing.JFormattedTextField jfplacabusca;
    private javax.swing.JFormattedTextField jfvalor;
    private javax.swing.JTable jtauto;
    private javax.swing.JFormattedTextField jtchassi;
    private javax.swing.JTextField jtcor;
    private javax.swing.JTextField jtmarca;
    private javax.swing.JTextField jtmodelo;
    private javax.swing.JTextField jtstatus;
    // End of variables declaration//GEN-END:variables

    public void limpacampos() {
        jtmarca.setText(null);
        jtmodelo.setText(null);
        jtcor.setText(null);
        jfano.setText(null);
        jccombustivel.setSelectedIndex(-1);
        jfvalor.setText(null);
        jcportas.setSelectedIndex(-1);
        jtchassi.setText(null);
        jfplaca.setText(null);
        jfplacabusca.setText(null);
        jctipo.setSelectedIndex(-1);
        jtstatus.setText("Disponível");
    }

    public boolean checacampos(String str) {
        str = "";

        if (jtmarca.getText().trim().isEmpty()) {
            str = "Marca\n";
        }

        if (jtmodelo.getText().trim().isEmpty()) {
            str += "Modelo\n";
        }

        if (jfplaca.getText().equals("   -    ")) {
            str += "Placa\n";
        }

        if (jtcor.getText().trim().isEmpty()) {
            str += "Cor\n";
        }

        if (jfano.getText().trim().isEmpty()) {
            str += "Ano\n";
        }

        if (jccombustivel.getSelectedItem() == (null)) {
            str += "Combustível\n";
        }

        if (jcportas.getSelectedItem() == (null)) {
            str += "Número de portas\n";
        }

        if (jtchassi.getText().trim().isEmpty()) {
            str += "Chassi\n";
        }

        if (jfvalor.getText().equals("    .  ")) {
            str += "Valor\n";
        }

        if (jctipo.getSelectedItem() == null) {
            str += "Tipo\n";
        }

        if (str == "") {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Favor preencher os seguintes campos: \n" + str);
            return false;
        }
    }

    private void limparTabelaAutomovel() {
        DefaultTableModel modelo = (DefaultTableModel) jtauto.getModel();
        for (int i = jtauto.getRowCount() - 1; i >= 0; --i) {
            modelo.removeRow(i);
        }

    }
}
