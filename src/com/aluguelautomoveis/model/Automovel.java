
package com.aluguelautomoveis.model;

import java.io.Serializable;



    
public class Automovel implements Serializable{
    private String marca;
    private String modelo;
    private String cor;
    private String ano;
    private String combustivel;
    private float valor;
    private String portas;
    private String chassi;
    private String placa;
    private String status;
    private String tipo;
    
    
    public Automovel(String marca, String modelo, String cor, String ano, String combustivel, float valor, String portas, String chassi,
            String placa, String tipo) 
    {
    	this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.combustivel = combustivel;
        this.valor = valor;
        this.portas = portas;
        this.chassi = chassi;
        this.placa = placa;
        this.status = status;
        this.tipo = tipo;
    }
    
    public Automovel(){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.combustivel = combustivel;
        this.valor = valor;
        this.portas = portas;
        this.chassi = chassi;
        this.placa = placa;
        this.status = status;
        this.tipo = tipo;
     }
        
   
    
    public String exibir()
    {
        String str = "";
        
        str = str + " Marca \t Modelo \t Cor \t Ano \t Combustível \t Valor \t Portas \t Chassi \t \t Placa \t Tipo \n";
        str = str +  " " + getMarca() + "\t"
         + getModelo() + "\t" + getCor() + "\t" + getAno() + "\t" + getCombustivel() + "\t" + getValor() + "\t" + getPortas() + "\t"
        + getChassi() + "\t" + getPlaca() + "\t" + getTipo() + "\n";
        
        return str;
    }
    
    public String Alugar(){
    
        status = "Alugado";
             
        return status;   
        
    }
    public String Devolver(){
         status = "Disponível";
        
        return status;
    }
    
    public String getAno() {
        return ano;
    }

   
    
    public void setAno(String ano) {
        this.ano = ano;
    }
           
    public String getMarca() {
        return marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getModelo() {
        return modelo;
    }

  
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public String getCor() {
        return cor;
    }

   
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public String getCombustivel() {
        return combustivel;
    }

    
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    
    public float getValor() {
        return valor;
    }

    
    public void setValor(float valor) {
        this.valor = valor;
    }

   
    public String getPortas() {
        return portas;
    }

    
    public void setPortas(String portas) {
        this.portas = portas;
    }

    
    public String getChassi() {
        return chassi;
    }

    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    

    
    public String getPlaca() {
        return placa;
    }

    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

   public Object[] getAutomovel()
    {
        Object v[] = {marca,modelo,cor,ano,valor,placa,portas,chassi};
        return v;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
