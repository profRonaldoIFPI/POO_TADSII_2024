package aula1209;
import java.time.LocalDate;
import java.time.Period;
public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate nascimento;
    public Pessoa(String nome, String cpf, String email, String telefone, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNascimento(LocalDate data){
        this.nascimento = data;
    }
    public LocalDate getNascimento(){
        return this.nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        char[] eMail = email.toCharArray();
        int contArr = 0;
        for(int i=0; i<=eMail.length-1 ;i++){
            if(eMail[i]=='@'){
                contArr++;
            }
        }
        if(contArr==1){
            this.email = email;
        }else{
            System.out.println("e-mail inválido");
        }
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getIdade(){
        Period periodo = Period.between(this.nascimento,LocalDate.now());
        return periodo.getYears();
    }
}
