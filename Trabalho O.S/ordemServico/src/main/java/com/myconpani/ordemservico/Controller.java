/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myconpani.ordemservico;

import java.util.ArrayList;

/**
 *
 * @author allan
 */
public class Controller {
    private static Controller instancia;
    
    private ArrayList<Cliente>listaCliente;
    private ArrayList<Veiculo>listaVeiculo;
    private ArrayList<Produtos>listaProduto;
    
    public static Controller getInstance(){
        if(instancia == null) {
            return instancia = new Controller();
        }else{
            return instancia;
        }
    }
    
    private Controller(){
        listaCliente = new ArrayList<>();
        listaVeiculo = new ArrayList<>();
        listaProduto = new ArrayList<>();
        
    }
    
    public void salvarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }
    
    public ArrayList<Cliente> retornarCliente(){
        return listaCliente;
    }
    
    public void salvarVeiculo(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }
    
    public ArrayList<Veiculo> retornarVeiculo(){
        return listaVeiculo;
    }
    
    public void salvarProduto(Produtos produto){
        listaProduto.add(produto);
    }
    public ArrayList<Produtos> retornaProduto(){
        return listaProduto;
    }
}
