

package classes;


import java.io.Serializable;
import java.util.Date;



public class Cliente implements Serializable{
    private String codigo;
    private String nome;
    private String cpf;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String email;
    private String habilitacao;
    private String tipo;
    private Date datanascimento;
    private String celular;
    private String sexo;
    
    
    public Cliente(){
        
    }
    public Cliente(String codigo, String nome, String cpf, String rua, String numero, String complemento, String bairro, String cidade,
            String estado, String cep, String telefone,String email, String habilitacao, String tipo,Date datanascimento,String celular, String sexo){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.habilitacao = habilitacao;
        this.tipo = tipo;
        this.datanascimento = datanascimento;
        this.celular = celular;
        this.sexo = sexo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
    public String Exibir(){
        String str = "";
        str+= "Código:"+codigo+"\nNome:"+nome+"\nSexo:"+sexo+"\nData Nascimento:"+datanascimento+"\nCPF:"+cpf+"\nRua:"+rua+"\nNúmero:"+numero+
       "\nComplemento:"+complemento+"\nBairro:"+bairro+"\nCidade:"+cidade+"\nEstado:"+estado+"\nCep:"+cep+"\nTelefone:"+telefone+"\nCelular:"
       +celular+"\nEmail:"+email+"\nHabilitação:"+habilitacao+"\nTipo:"+tipo+"\n";
        return str;
    }
    
    boolean validarCliente(String c){
        if(c.equals(cpf)){
            return true;
        }
        else
            return false;
    }

    /**
     * @return the habilitacao
     */
    public String getHabilitacao() {
        return habilitacao;
    }

    /**
     * @param habilitacao the habilitacao to set
     */
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
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

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the datanascimento
     */
    public Date getDatanascimento() {
        return datanascimento;
    }

    /**
     * @param datanascimento the datanascimento to set
     */
    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Object[] getCliente()
    {
        Object c[] = {codigo,nome,cpf,habilitacao,tipo,telefone};
        return c;
    }
    
    /**
     *
     * @return
     */
    public String Cliente(){


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
   
   
   str += "--------- Dados do Cliente: ----------------------------------------\t"+"\n";
   str += " \t"+"\n";
   str += "\n";
   str += "Nome: "+getNome()+"\t CPF: "+getCpf()+ "\t Data de Nascimento: "+ Utils.DateToStr(getDatanascimento())+ "\n";
   str += "Endereço: "+ "Rua: "+getRua()+"\t Nº. "+getNumero() + "\t Complemento: " +getComplemento()+"\n";
   str += "CEP: "+getCep()+"\t Bairro: "+getBairro()+"\t Cidade: "+getCidade()+"\t Estado: "+getEstado()+ " \n";
   str += "E-mail: "+getEmail()+"\n";
   str += " \t"+"\n";
   str += "--------- Dados do Automóvel: --------------------------------------\t"+"\n";
   str += " \t"+"\n";
   str += "\n";
   
       return str;
   }
    
}
