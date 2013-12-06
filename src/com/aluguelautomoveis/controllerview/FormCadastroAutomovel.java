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
        textFieldModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jfplaca = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jfano = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtcor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxCombustivel = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboBoxPortas = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textFormattedValor = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        textFieldStatus = new javax.swing.JTextField();
        textFieldMarca = new javax.swing.JTextField();
        textFieldChassi = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        textFieldTipo = new javax.swing.JComboBox();
        buttonInserirAutomovel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        textFormattedPlaca = new javax.swing.JFormattedTextField();
        buttonPesquisaPlaca = new javax.swing.JButton();
        checkBoxPesquisa = new javax.swing.JCheckBox();
        buttonPesquisaTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAutomovel = new javax.swing.JTable();
        buttonEditarAutomovel = new javax.swing.JButton();
        buttonExcluirAutomovel = new javax.swing.JButton();
        buttonAtualizarAutomovel = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonLimparBusca = new javax.swing.JButton();

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

        comboBoxCombustivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Gasolina", " Etanol", " Diesel", " Flex" }));
        comboBoxCombustivel.setSelectedIndex(-1);

        jLabel7.setText("Portas");

        comboBoxPortas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2 Portas", "4 Portas ", "Não Possui" }));
        comboBoxPortas.setSelectedIndex(-1);

        jLabel8.setText("Chassi");

        jLabel10.setText("Valor R$");

        try {
            textFormattedValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Status");

        textFieldStatus.setEnabled(false);
        textFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldStatusActionPerformed(evt);
            }
        });

        try {
            textFieldChassi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#?????###??######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Tipo");

        textFieldTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A - Moto", "B - Carro", "C - Caminhonete", "D - Ônibus", "E - Caminhão" }));
        textFieldTipo.setSelectedIndex(-1);
        textFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTipoActionPerformed(evt);
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
                    .addComponent(comboBoxCombustivel, 0, 117, Short.MAX_VALUE)
                    .addComponent(textFieldMarca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(comboBoxPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(textFormattedValor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textFieldModelo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldStatus)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(textFieldTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(textFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFormattedValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonInserirAutomovel.setText("Inserir Automóvel");
        buttonInserirAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirAutomovelActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Automóvel"));

        jLabel12.setText("Placa");

        try {
            textFormattedPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFormattedPlaca.setEnabled(false);
        textFormattedPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFormattedPlacaActionPerformed(evt);
            }
        });

        buttonPesquisaPlaca.setText("Pesquisar");
        buttonPesquisaPlaca.setEnabled(false);
        buttonPesquisaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaPlacaActionPerformed(evt);
            }
        });

        checkBoxPesquisa.setText("Pesquisar Automóvel ");
        checkBoxPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPesquisaActionPerformed(evt);
            }
        });

        buttonPesquisaTodos.setText("Pesquisar Todos");
        buttonPesquisaTodos.setEnabled(false);
        buttonPesquisaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaTodosActionPerformed(evt);
            }
        });

        tableAutomovel.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAutomovel.getTableHeader().setReorderingAllowed(false);
        tableAutomovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAutomovelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAutomovel);
        if (tableAutomovel.getColumnModel().getColumnCount() > 0) {
            tableAutomovel.getColumnModel().getColumn(0).setResizable(false);
            tableAutomovel.getColumnModel().getColumn(1).setResizable(false);
            tableAutomovel.getColumnModel().getColumn(2).setResizable(false);
            tableAutomovel.getColumnModel().getColumn(3).setResizable(false);
            tableAutomovel.getColumnModel().getColumn(4).setResizable(false);
            tableAutomovel.getColumnModel().getColumn(5).setResizable(false);
        }

        buttonEditarAutomovel.setText("Editar Automóvel");
        buttonEditarAutomovel.setEnabled(false);
        buttonEditarAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarAutomovelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxPesquisa)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textFormattedPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPesquisaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPesquisaTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditarAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(0, 505, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(checkBoxPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFormattedPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisaPlaca)
                    .addComponent(buttonPesquisaTodos)
                    .addComponent(buttonEditarAutomovel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
        );

        buttonExcluirAutomovel.setText("Excluir Automóvel");
        buttonExcluirAutomovel.setEnabled(false);
        buttonExcluirAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirAutomovelActionPerformed(evt);
            }
        });

        buttonAtualizarAutomovel.setText("Atualizar Automóvel");
        buttonAtualizarAutomovel.setEnabled(false);
        buttonAtualizarAutomovel.setMaximumSize(new java.awt.Dimension(145, 27));
        buttonAtualizarAutomovel.setMinimumSize(new java.awt.Dimension(145, 27));
        buttonAtualizarAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarAutomovelActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.setMaximumSize(new java.awt.Dimension(145, 27));
        buttonSair.setMinimumSize(new java.awt.Dimension(145, 27));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        buttonLimparBusca.setText("Limpar Busca");
        buttonLimparBusca.setEnabled(false);
        buttonLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparBuscaActionPerformed(evt);
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
                        .addComponent(buttonInserirAutomovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExcluirAutomovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAtualizarAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLimparBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(buttonAtualizarAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLimparBusca))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonInserirAutomovel)
                        .addComponent(buttonExcluirAutomovel)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInserirAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirAutomovelActionPerformed

        if (checacampos(null) == true) {
            Automovel auto = new Automovel();
            auto.setMarca(textFieldMarca.getText());
            auto.setModelo(textFieldModelo.getText());
            auto.setCor(jtcor.getText());
            auto.setAno(jfano.getText());
            auto.setCombustivel(comboBoxCombustivel.getSelectedItem().toString());
            auto.setValor(Float.parseFloat(textFormattedValor.getText()));
            auto.setPortas(comboBoxPortas.getSelectedItem().toString());
            auto.setChassi(textFieldChassi.getText());
            auto.setStatus("Disponível");
            auto.setPlaca(jfplaca.getText());
            auto.setTipo(textFieldTipo.getSelectedItem().toString());

            if (AutomovelDao.getAutomovel(auto.getPlaca()) == null) {
                AutomovelDao.addAutomovel(auto);
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
                limpacampos();
            } else {
                JOptionPane.showMessageDialog(null, "Já existe Automóvel cadastrado com esta placa!");
            }
        } else {

        }
    }//GEN-LAST:event_buttonInserirAutomovelActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        this.dispose();

    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPesquisaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisaPlacaActionPerformed
        limparTabelaAutomovel();
        auto = AutomovelDao.getAutomovel(textFormattedPlaca.getText());

        DefaultTableModel modelo = (DefaultTableModel) tableAutomovel.getModel();
        if (auto != null) {
            modelo.addRow(auto.getAutomovel());
            textFormattedPlaca.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Automóvel Inexistente!\nNão foi possivel encontrar o Automóvel especificado!", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
        }
        textFormattedPlaca.setText(null);
    }//GEN-LAST:event_buttonPesquisaPlacaActionPerformed


    private void textFormattedPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFormattedPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFormattedPlacaActionPerformed

    private void buttonExcluirAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirAutomovelActionPerformed

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
                        textFieldMarca.setEnabled(true);
                        textFieldTipo.setEnabled(true);
                        textFieldModelo.setEnabled(true);
                        jtcor.setEnabled(true);
                        jfano.setEnabled(true);
                        comboBoxCombustivel.setEnabled(true);
                        textFormattedValor.setEnabled(true);
                        comboBoxPortas.setEnabled(true);
                        textFieldChassi.setEnabled(true);
                        jfplaca.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Automóvel não pode ser removido, pois não existe no sistema!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    }
                    buttonExcluirAutomovel.setEnabled(false);
                    buttonAtualizarAutomovel.setEnabled(false);
                    buttonInserirAutomovel.setEnabled(true);
                    limpacampos();
                    jfplaca.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_buttonExcluirAutomovelActionPerformed

    private void buttonAtualizarAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarAutomovelActionPerformed
        if (auto.getStatus() == "Alugado") {

            JOptionPane.showMessageDialog(null, "Automóvel não pode ser Atualizado pois encontra-se Alugado!", "Atenção", JOptionPane.ERROR_MESSAGE);
        } else {

            auto = new Automovel();
            auto.setMarca(textFieldMarca.getText());
            auto.setModelo(textFieldModelo.getText());
            auto.setCor(jtcor.getText());
            auto.setAno(jfano.getText());
            auto.setCombustivel(comboBoxCombustivel.getSelectedItem().toString());
            auto.setValor(Float.parseFloat(textFormattedValor.getText()));
            auto.setPortas(comboBoxPortas.getSelectedItem().toString());
            auto.setChassi(textFieldChassi.getText());
            auto.setPlaca(jfplaca.getText());
            auto.setTipo(textFieldTipo.getSelectedItem().toString());
            auto.setStatus(textFieldStatus.getText());

            AutomovelDao.atualizarAutomovel(auto);

            JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");
            limparTabelaAutomovel();
            limpacampos();
            buttonEditarAutomovel.setEnabled(false);
            buttonPesquisaPlaca.setEnabled(false);
            buttonPesquisaTodos.setEnabled(false);
            buttonExcluirAutomovel.setEnabled(false);
            buttonAtualizarAutomovel.setEnabled(false);
            checkBoxPesquisa.setSelected(false);
            buttonInserirAutomovel.setEnabled(true);

    }//GEN-LAST:event_buttonAtualizarAutomovelActionPerformed
    }
    private void jfanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfanoActionPerformed

    private void textFieldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldStatusActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        textFieldStatus.setText("Disponível");        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jfplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfplacaActionPerformed

    private void checkBoxPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPesquisaActionPerformed
        if (checkBoxPesquisa.isSelected()) {
            textFieldMarca.setEnabled(false);
            textFieldTipo.setEnabled(false);
            textFieldModelo.setEnabled(false);
            jtcor.setEnabled(false);
            jfano.setEnabled(false);
            comboBoxCombustivel.setEnabled(false);
            textFormattedValor.setEnabled(false);
            comboBoxPortas.setEnabled(false);
            textFieldChassi.setEnabled(false);
            jfplaca.setEnabled(false);
            textFormattedPlaca.setEnabled(false);
            textFormattedPlaca.setEnabled(true);
            buttonPesquisaPlaca.setEnabled(true);
            buttonPesquisaTodos.setEnabled(true);
            buttonLimparBusca.setEnabled(true);
            limpacampos();
            limparTabelaAutomovel();
        } else {
            textFormattedPlaca.setEnabled(false);
            buttonPesquisaPlaca.setEnabled(false);
            buttonPesquisaTodos.setEnabled(false);
            buttonLimparBusca.setEnabled(false);
            textFieldMarca.setEnabled(true);
            textFieldTipo.setEnabled(true);
            textFieldModelo.setEnabled(true);
            jtcor.setEnabled(true);
            jfano.setEnabled(true);
            comboBoxCombustivel.setEnabled(true);
            textFormattedValor.setEnabled(true);
            comboBoxPortas.setEnabled(true);
            textFieldChassi.setEnabled(true);
            jfplaca.setEnabled(true);
        }
    }//GEN-LAST:event_checkBoxPesquisaActionPerformed

    private void textFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTipoActionPerformed

    private void buttonPesquisaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisaTodosActionPerformed
        limpacampos();

        jfplaca.setText("");

        ArrayList<Automovel> lista = AutomovelDao.getTodosAutomoveis();

        DefaultTableModel modelo = (DefaultTableModel) tableAutomovel.getModel();

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
    }//GEN-LAST:event_buttonPesquisaTodosActionPerformed

    private void buttonLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparBuscaActionPerformed
        limparTabelaAutomovel();
        limpacampos();
        buttonEditarAutomovel.setEnabled(false);
        buttonPesquisaPlaca.setEnabled(false);
        buttonPesquisaTodos.setEnabled(false);
        buttonExcluirAutomovel.setEnabled(false);
        buttonAtualizarAutomovel.setEnabled(false);
        checkBoxPesquisa.setSelected(false);
        buttonInserirAutomovel.setEnabled(true);
    }//GEN-LAST:event_buttonLimparBuscaActionPerformed

    private void tableAutomovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAutomovelMouseClicked
        if (tableAutomovel.getSelectedRow() >= -1) {
            buttonEditarAutomovel.setEnabled(true);
            buttonPesquisaPlaca.setEnabled(false);
            buttonPesquisaTodos.setEnabled(false);
            buttonAtualizarAutomovel.setEnabled(false);
            buttonExcluirAutomovel.setEnabled(false);
            buttonInserirAutomovel.setEnabled(false);
        } else {

        }

    }//GEN-LAST:event_tableAutomovelMouseClicked

    private void buttonEditarAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarAutomovelActionPerformed
        int linha = tableAutomovel.getSelectedRow();
        String placa = ((String) tableAutomovel.getModel().getValueAt(linha, 5));
        auto = AutomovelDao.getAutomovel(placa);

        textFieldMarca.setText(auto.getMarca());
        textFieldStatus.setText(auto.getStatus());
        textFieldModelo.setText(auto.getModelo());
        jtcor.setText(auto.getCor());
        jfano.setText(auto.getAno());
        comboBoxCombustivel.setSelectedItem(auto.getCombustivel());
        textFormattedValor.setText(String.valueOf(auto.getValor()));
        comboBoxPortas.setSelectedItem(auto.getPortas());
        textFieldChassi.setText(auto.getChassi());
        jfplaca.setText(auto.getPlaca());
        textFieldTipo.setSelectedItem(auto.getTipo());
        textFieldMarca.setEnabled(true);
        textFieldTipo.setEnabled(true);
        textFieldModelo.setEnabled(true);
        jtcor.setEnabled(true);
        jfano.setEnabled(true);
        comboBoxCombustivel.setEnabled(true);
        textFormattedValor.setEnabled(true);
        comboBoxPortas.setEnabled(true);
        textFieldChassi.setEnabled(true);
        jfplaca.setEnabled(true);
        buttonExcluirAutomovel.setEnabled(true);
        buttonAtualizarAutomovel.setEnabled(true);
        buttonEditarAutomovel.setEnabled(false);
        checkBoxPesquisa.setSelected(false);
    }//GEN-LAST:event_buttonEditarAutomovelActionPerformed

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
    private javax.swing.JButton buttonAtualizarAutomovel;
    private javax.swing.JButton buttonEditarAutomovel;
    private javax.swing.JButton buttonExcluirAutomovel;
    private javax.swing.JButton buttonInserirAutomovel;
    private javax.swing.JButton buttonLimparBusca;
    private javax.swing.JButton buttonPesquisaPlaca;
    private javax.swing.JButton buttonPesquisaTodos;
    private javax.swing.JButton buttonSair;
    private javax.swing.JCheckBox checkBoxPesquisa;
    private javax.swing.JComboBox comboBoxCombustivel;
    private javax.swing.JComboBox comboBoxPortas;
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
    private javax.swing.JFormattedTextField jfano;
    private javax.swing.JFormattedTextField jfplaca;
    private javax.swing.JTextField jtcor;
    private javax.swing.JTable tableAutomovel;
    private javax.swing.JFormattedTextField textFieldChassi;
    private javax.swing.JTextField textFieldMarca;
    private javax.swing.JTextField textFieldModelo;
    private javax.swing.JTextField textFieldStatus;
    private javax.swing.JComboBox textFieldTipo;
    private javax.swing.JFormattedTextField textFormattedPlaca;
    private javax.swing.JFormattedTextField textFormattedValor;
    // End of variables declaration//GEN-END:variables

    public void limpacampos() {
        textFieldMarca.setText(null);
        textFieldModelo.setText(null);
        jtcor.setText(null);
        jfano.setText(null);
        comboBoxCombustivel.setSelectedIndex(-1);
        textFormattedValor.setText(null);
        comboBoxPortas.setSelectedIndex(-1);
        textFieldChassi.setText(null);
        jfplaca.setText(null);
        textFormattedPlaca.setText(null);
        textFieldTipo.setSelectedIndex(-1);
        textFieldStatus.setText("Disponível");
    }

    public boolean checacampos(String str) {
        str = "";

        if (textFieldMarca.getText().trim().isEmpty()) {
            str = "Marca\n";
        }

        if (textFieldModelo.getText().trim().isEmpty()) {
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

        if (comboBoxCombustivel.getSelectedItem() == (null)) {
            str += "Combustível\n";
        }

        if (comboBoxPortas.getSelectedItem() == (null)) {
            str += "Número de portas\n";
        }

        if (textFieldChassi.getText().trim().isEmpty()) {
            str += "Chassi\n";
        }

        if (textFormattedValor.getText().equals("    .  ")) {
            str += "Valor\n";
        }

        if (textFieldTipo.getSelectedItem() == null) {
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
        DefaultTableModel modelo = (DefaultTableModel) tableAutomovel.getModel();
        for (int i = tableAutomovel.getRowCount() - 1; i >= 0; --i) {
            modelo.removeRow(i);
        }

    }
}
