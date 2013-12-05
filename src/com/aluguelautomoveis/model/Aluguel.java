package com.aluguelautomoveis.model;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;



public class Aluguel implements Serializable{
private double numero;
private Cliente cliente;
private Automovel automovel;
private double valorTotal;
private int numerodias;
private Date datalocacao;
private Date datadevolucao;
private double multa;
private int diasmulta;
public String validacao;


public Aluguel (){
    
}

public String validahabilitacao(){

String validacao = "NOTOK";
String a = "A - Moto";
String b = "B - Carro";
String c = "C - Caminhonete";
String d = "D - Ônibus";
String e = "E - Caminhões"; 

  String tipohabilitacao = getCliente().getTipo();
  String tipoautomovel = getAutomovel().getTipo();
  
   if (tipohabilitacao.equals("A") && tipoautomovel.equals(a)) {
      validacao = "ok";
   }
        else if (tipohabilitacao.equals("B") && tipoautomovel.equals(b)){
                 validacao = "ok";  
       }
                 else if  (tipohabilitacao.equals("C") && tipoautomovel.equals(b) || tipoautomovel.equals(c)){
                           validacao = "ok";   
           }
              else if (tipohabilitacao.equals("D") && tipoautomovel.equals(b) || tipoautomovel.equals(c) || tipoautomovel.equals(d)){
                                    validacao = "ok";        
                 }
                                    else if (tipohabilitacao.equals("E") && tipoautomovel.equals(b) || tipoautomovel.equals(c) || tipoautomovel.equals(d) || tipoautomovel.equals(e)) {
                                    validacao = "ok";        
                                    }
                                    else {
                                        validacao = "NOTOK";
                                    }

   return validacao;
}

public double calcularValorTotal(){
        setValorTotal(getAutomovel().getValor() * getNumerodias());
        
return  getValorTotal();
}


public int diferencaDias(Date d1, Date d2) {
GregorianCalendar ini = new GregorianCalendar();
GregorianCalendar fim = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

ini.setTime(getDatalocacao());
fim.setTime(getDatadevolucao());

long dt1 = ini.getTimeInMillis();
long dt2 = fim.getTimeInMillis();
long diferenca = (dt2-dt1)/86400000;

        setNumerodias((int)diferenca);
return  getNumerodias();

}

public int diasMulta(Date d1, Date d2) {
GregorianCalendar ini = new GregorianCalendar();
GregorianCalendar fim = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Date hoje = new Date();
ini.setTime(getDatadevolucao());
fim.setTime(hoje);

long dt1 = ini.getTimeInMillis();
long dt2 = fim.getTimeInMillis();
long diferenca = (dt2-dt1)/86400000;

        setDiasmulta((int)diferenca);
return  getDiasmulta();

}

public double calcularMulta(){
        setMulta(getAutomovel().getValor() * getDiasmulta());
       if (multa < 0){
          multa = 0;
 }
          return multa;
}


   public String getAlguel(){
 String str = "";
  str+= (getNumero()+"\n"+getCliente()+"\n"+getAutomovel()+"\n"+getValorTotal()+"\n"+getDatalocacao()+"\n"+getDatadevolucao()+"\n"+getNumerodias());
  return str;
   }



   public Object[] getAluguelo()
    {
        Object v[] = {getNumero(),getCliente().getNome(),getCliente().getCpf(),getCliente().getHabilitacao(),getAutomovel().getMarca(),getAutomovel().getModelo(),getAutomovel().getPlaca(),valorTotal,Utils.DateToStr(datalocacao),Utils.DateToStr(datadevolucao)};
        return v;
    }

    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the automovel
     */
    public Automovel getAutomovel() {
        return automovel;
    }

    /**
     * @param automovel the automovel to set
     */
    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the numerodias
     */
    public int getNumerodias() {
        return numerodias;
    }

    /**
     * @param numerodias the numerodias to set
     */
    public void setNumerodias(int numerodias) {
        this.numerodias = numerodias;
    }

    /**
     * @return the datalocacao
     */
    public Date getDatalocacao() {
        return datalocacao;
    }

    /**
     * @param datalocacao the datalocacao to set
     */
    public void setDatalocacao(Date datalocacao) {
        this.datalocacao = datalocacao;
    }

    /**
     * @return the datadevolucao
     */
    public Date getDatadevolucao() {
        return datadevolucao;
    }

    /**
     * @param datadevolucao the datadevolucao to set
     */
    public void setDatadevolucao(Date datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    /**
     * @return the multa
     */
    public double getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(double multa) {
        this.multa = multa;
    }

    /**
     * @return the diasmulta
     */
    public int getDiasmulta() {
        return diasmulta;
    }

    /**
     * @param diasmulta the diasmulta to set
     */
    public void setDiasmulta(int diasmulta) {
        this.diasmulta = diasmulta;
    }

   public String Locacao(){
Date hoje = new Date();
diasMulta(getDatadevolucao(),hoje);
calcularMulta();
       String str = "";
   
   str += "Aluguel Automóveis - Locação de Transportes Ltda.\t"+"\n";
   str += "\n";
   str += "Rua B, 112 - Centro - Juiz de Fora - MG - CEP: 36.000-000"+"\n";
   str += "\n";
   str += "Telefone: (32)3333-3333"+" Fax: (32)3333-3333";
   str += "\n";
   str += "CNPJ: 01.123.111.0000-99\t\t\t\t" + "\n";
   str += "\n";
   str += "\t \t \t \t  NOTA FISCAL";
   str += "\t \t \t \t \t "+"\n";
   str += "Data: " + Utils.DateToStr(getDatalocacao()) + "\t \t \t \t \t \t \t Número NF: " + getNumero()+"\n";
   str += "\n";
   str += "\n";
   str += "--------- Dados do Cliente: ----------------------------------------\t"+"\n";
   str += " \t"+"\n";
   str += "\n";
   str += "Nome: "+cliente.getNome()+"\t CPF: "+cliente.getCpf()+ "\t Data de Nascimento: "+ Utils.DateToStr(cliente.getDatanascimento())+ "\n";
   str += "Endereço: "+ "Rua: "+cliente.getRua()+"\t Nº. "+ cliente.getNumero() + "\t Complemento: " +cliente.getComplemento()+"\n";
   str += "CEP: "+cliente.getCep()+"\t Bairro: "+cliente.getBairro()+"\t Cidade: "+cliente.getCidade()+"\t Estado: "+cliente.getEstado()+ " \n";
   str += "E-mail: "+cliente.getEmail()+"\n";
   str += " \t"+"\n";
   str += "--------- Dados do Automóvel: --------------------------------------\t"+"\n";
   str += " \t"+"\n";
   str += "\n";
   str += getAutomovel().exibir();
   str += "\n";
   str += "--------- Dados da Locação: -----------------------------------------\n";
   str += " \t"+"\n";
   str += "\n";
   str += "Data da Locação: " + Utils.DateToStr(getDatalocacao())+"\n";
   str += "Data da Devolução: " +Utils.DateToStr(getDatadevolucao())+"\n";
   str += "Valor Multa: "+getMulta()+"\n";
   str += "Valor Total: " +getValorTotal()+ "\n";
   
       return str;
   }

}
