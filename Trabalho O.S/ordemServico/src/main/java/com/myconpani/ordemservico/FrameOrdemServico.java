/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.myconpani.ordemservico;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allan
 */
public class FrameOrdemServico extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private int linhaselecionada = -1;

    /**
     * Creates new form FrameOrdemServico
     */
    
    public FrameOrdemServico() {
        initComponents();
        setLocationRelativeTo(this);
        carregarTabela();
        
    }
    
    public void carregarTabela(){
        
        modelo.addColumn("Descrição");
        modelo.addColumn("QTDE.");
        modelo.addColumn("VLR.UNITARIO");
        tbProdutos.setModel(modelo);
        
        tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(120);
        tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
        tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(20);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel35 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpClienteVeiculo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        tfPlaca = new javax.swing.JTextField();
        tfChassi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jpCadastroProduto = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfDescricaoProduto = new javax.swing.JTextField();
        tfQuantidadeProduto = new javax.swing.JTextField();
        tfValorUnitario = new javax.swing.JTextField();
        tfDetalhesVeiculo = new javax.swing.JTextField();
        tfDefeitoVeiculo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        btSalvarOs = new javax.swing.JButton();
        btCancelarOs = new javax.swing.JButton();
        tfValorTotal = new javax.swing.JTextField();
        btCadastrarProduto = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ordem de Serviço");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel3.setText("Nome:");

        jLabel4.setText("CPF/CNPJ:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Email:");

        jLabel7.setText("Endereço:");

        tfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNomeCliente.setText("Juca Bala");
        tfNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeClienteActionPerformed(evt);
            }
        });

        tfCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfCPF.setText("999.999.999-99");

        tfTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefone.setText("(45) 99989-7346");

        tfEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEmail.setText("eumesmo@hotmail.com");

        tfEndereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEndereco.setText("Rua de lá pra cá 69");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Veículo:");

        jLabel9.setText("Marca:");

        jLabel10.setText("Modelo:");

        jLabel11.setText("Ano:");

        jLabel12.setText("Placa:");

        jLabel13.setText("Chassi:");

        tfMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfMarca.setText("FIAT");

        tfModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfModelo.setText("UNO (COM ESCADA)");

        tfAno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfAno.setText("2004");

        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfPlaca.setText("BUC1A69");

        tfChassi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfChassi.setText("OOSOOS666AS66AS-999");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("*");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("*");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("*");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("*");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setText("*");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("*");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setText("*");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setText("*");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));
        jLabel29.setText("*");

        javax.swing.GroupLayout jpClienteVeiculoLayout = new javax.swing.GroupLayout(jpClienteVeiculo);
        jpClienteVeiculo.setLayout(jpClienteVeiculoLayout);
        jpClienteVeiculoLayout.setHorizontalGroup(
            jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                        .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel21))
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24))
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25))
                            .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpClienteVeiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpClienteVeiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel28))))
                        .addGap(18, 18, 18)
                        .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNomeCliente)
                            .addComponent(tfCPF)
                            .addComponent(tfTelefone)
                            .addComponent(tfEmail))))
                .addGap(35, 35, 35)
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                        .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29))
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31))
                            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)))
                        .addGap(25, 25, 25)
                        .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfModelo)
                            .addComponent(tfAno)
                            .addComponent(tfChassi)
                            .addComponent(tfMarca))))
                .addContainerGap())
        );
        jpClienteVeiculoLayout.setVerticalGroup(
            jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpClienteVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tfChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("Produtos/Serviços:");

        jLabel15.setText("DESCRIÇÃO:");

        jLabel16.setText("QTDE.:");

        jLabel17.setText("VLR.UNITÁRIO:");

        tfDescricaoProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfDescricaoProduto.setText("TROCA DE ÓLEO");

        tfQuantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfQuantidadeProduto.setText("1");

        tfValorUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValorUnitario.setText("200");

        tfDetalhesVeiculo.setText("Farol frontal direito queimado, luz de placa trazeira queimada, parachoque trazeiro arranhado");
        tfDetalhesVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDetalhesVeiculoActionPerformed(evt);
            }
        });

        tfDefeitoVeiculo.setText("-Óleo passou da kilometragem, - Troca de lampadas queimadas, -Martelinho de ouro");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("Destalhes do estado do veículo:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Defeitos do veículo:");

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRICAO", "QTDE.", "VLR.UNITARIO"
            }
        ));
        jScrollPane1.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setMinWidth(100);
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setText("Valor total:");

        btSalvarOs.setText("Salvar O.S");
        btSalvarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarOsActionPerformed(evt);
            }
        });

        btCancelarOs.setText("Cancelar");
        btCancelarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarOsActionPerformed(evt);
            }
        });

        tfValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValorTotal.setText("0,00");

        btCadastrarProduto.setText("Cadastrar");
        btCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProdutoActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("*");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));
        jLabel32.setText("*");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("*");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("*");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 51, 51));
        jLabel36.setText("*");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 51));
        jLabel37.setText("*");

        javax.swing.GroupLayout jpCadastroProdutoLayout = new javax.swing.GroupLayout(jpCadastroProduto);
        jpCadastroProduto.setLayout(jpCadastroProdutoLayout);
        jpCadastroProdutoLayout.setHorizontalGroup(
            jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23))
                            .addComponent(tfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))
                            .addComponent(tfQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37))
                            .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addGap(255, 255, 255))
                            .addComponent(tfDefeitoVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroProdutoLayout.createSequentialGroup()
                                        .addComponent(btCancelarOs)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSalvarOs))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addComponent(btCadastrarProduto, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jpCadastroProdutoLayout.setVerticalGroup(
            jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadastrarProduto)
                .addGap(3, 3, 3)
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32))
                .addGap(17, 17, 17)
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDetalhesVeiculo)
                    .addComponent(tfDefeitoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarOs)
                    .addComponent(btCancelarOs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpClienteVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpClienteVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jpCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean contemApenasLetras(String texto) {
        return texto.matches("[a-zA-Z]+");
    }

    private boolean contemApenasNumeros(String texto) {
        return texto.matches("[0-9]+");
    }
    
    private void btSalvarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarOsActionPerformed
       
        try{
            if (tbProdutos.getRowCount() == 0) {
            throw new Exception("Não foram informados produtos na O.S. Adicione pelo menos um produto para prosseguir.");
        }    
           
        String nome = tfNomeCliente.getText();
        String cpf = tfCPF.getText();
        String telefone = tfTelefone.getText();
        String email = tfEmail.getText();
        String endereco = tfEndereco.getText();
    
        String marca =  tfMarca.getText();
        String modelo =  tfModelo.getText();
        String ano =  tfAno.getText();
        String placa =  tfPlaca.getText();
        String chassi =  tfChassi.getText();
                
        String detalhes = tfDetalhesVeiculo.getText();
        
        String defeito = tfDefeitoVeiculo.getText();
        
        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || email.isEmpty() || endereco.isEmpty()
                || marca.isEmpty() || modelo.isEmpty() || ano.isEmpty() || placa.isEmpty() || chassi.isEmpty()
                || detalhes.isEmpty() || defeito.isEmpty()) {
            throw new Exception("Por favor, preencha todos os campos obrigatórios(*).");
        }
        
        if (!contemApenasLetras(nome)) {
            throw new Exception("A descrição deve conter apenas letras.");
        }

        if (!contemApenasNumeros(cpf)) {
            throw new Exception("O CPF/CNPJ deve conter apenas números.");
        }
        
        if (!contemApenasNumeros(telefone)) {
            throw new Exception("O telefone deve conter apenas números.");
        }       
        
        if (!contemApenasNumeros(ano)) {
            throw new Exception("O ano deve conter apenas números.");
        }
        
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        
        Controller.getInstance().salvarCliente(cliente);        
        
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setAno(ano);
        veiculo.setPlaca(placa);
        veiculo.setChassi(chassi);
        veiculo.setDetalhes(detalhes);
        veiculo.setDefeito(defeito);
        
        Controller.getInstance().salvarVeiculo(veiculo);
        
        new FramePedido().setVisible(true);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Campos obrigatórios não informados", JOptionPane.ERROR_MESSAGE);
        if (tfNomeCliente.getText().isEmpty()) {
            tfNomeCliente.requestFocus();
        } else if (tfCPF.getText().isEmpty()) {
            tfCPF.requestFocus();
        } else if (tfTelefone.getText().isEmpty()) {
            tfTelefone.requestFocus();
        }else if (tfEmail.getText().isEmpty()) {
            tfEmail.requestFocus();
        }else if (tfEndereco.getText().isEmpty()) {
            tfEndereco.requestFocus();
        }else if (tfMarca.getText().isEmpty()) {
            tfMarca.requestFocus();
        }else if (tfModelo.getText().isEmpty()) {
            tfModelo.requestFocus();
        }else if (tfAno.getText().isEmpty()) {
            tfAno.requestFocus();
        }else if (tfPlaca.getText().isEmpty()) {
            tfPlaca.requestFocus();
        }else if (tfChassi.getText().isEmpty()) {
            tfChassi.requestFocus();
        } 
}
        
    }//GEN-LAST:event_btSalvarOsActionPerformed

    double valorTotal;
    
    
    private void btCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProdutoActionPerformed
        
        try{
        String descricao = tfDescricaoProduto.getText();
        String qtde = tfQuantidadeProduto.getText();
        String vlrUnitario = tfValorUnitario.getText();
        
        if (descricao.isEmpty() || qtde.isEmpty() || vlrUnitario.isEmpty()) {
            throw new IllegalArgumentException("Por favor, preencha todos os campos.");
        }
        
        if (!contemApenasNumeros(qtde)) {
            throw new Exception("A quantidade deve conter apenas números.");
        }
        
        if (!contemApenasNumeros(vlrUnitario)) {
            throw new Exception("O valor unitário deve conter apenas números.");
        }
        
        if(linhaselecionada >= 0){
            modelo.removeRow(linhaselecionada);
            modelo.insertRow(linhaselecionada, 
                    new Object[]{descricao, qtde, vlrUnitario});
        }else{
             modelo.addRow(new Object[]{descricao, qtde, vlrUnitario});
        }
        
        JOptionPane.showMessageDialog(this,
                "Produto lançado com sucesso!");
        tfDescricaoProduto.setText("");
        tfQuantidadeProduto.setText("");
        tfValorUnitario.setText("");
        tfDescricaoProduto.requestFocus();
        linhaselecionada = -1;
        
        Produtos produto = new Produtos();
        produto.setDescricao(descricao);
        produto.setQtde(qtde);
        produto.setValorUnitario(vlrUnitario);
        
        Controller.getInstance().salvarProduto(produto);
         
        
        double valor = Double.parseDouble(vlrUnitario);
        int quantidade= Integer.parseInt(qtde);
        double somaValores= valor*quantidade;
        valorTotal+=somaValores;
        
         String valorFinal= String.valueOf(valorTotal);
         tfValorTotal.setText(valorFinal);
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Por favor, preencha todos os campos.", JOptionPane.ERROR_MESSAGE);
        if (tfDescricaoProduto.getText().isEmpty()) {
            tfDescricaoProduto.requestFocus();
        } else if (tfQuantidadeProduto.getText().isEmpty()) {
            tfQuantidadeProduto.requestFocus();
        }else if (tfValorUnitario.getText().isEmpty()) {
            tfValorUnitario.requestFocus();
        }
}    
    }//GEN-LAST:event_btCadastrarProdutoActionPerformed

    private void tfNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeClienteActionPerformed

    private void btCancelarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarOsActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar? Todos as iformações da O.S serão perdidas!",
                "Confirmação", JOptionPane.YES_NO_OPTION);
    
    if (resposta == JOptionPane.YES_OPTION) {
        this.dispose();
}  
    }//GEN-LAST:event_btCancelarOsActionPerformed

    private void tfDetalhesVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDetalhesVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDetalhesVeiculoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarProduto;
    private javax.swing.JButton btCancelarOs;
    private javax.swing.JButton btSalvarOs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCadastroProduto;
    private javax.swing.JPanel jpClienteVeiculo;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfChassi;
    private javax.swing.JTextField tfDefeitoVeiculo;
    private javax.swing.JTextField tfDescricaoProduto;
    private javax.swing.JTextField tfDetalhesVeiculo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfQuantidadeProduto;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfValorTotal;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
