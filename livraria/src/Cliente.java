public class Cliente {
    // Atributos
     private String nome;
     private String email;
     private String telefone;

     // Método de acesso
    // Leitura
    public String getNome() {
        return nome;
    }
    //Alteração
    public void setNome(String nome) {
        nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


     // Método
    public String obterContatos() {
        return String.format("Nome: %s \nE-mail: %s \nTelefone: %s", nome, email, telefone);
    }
}
