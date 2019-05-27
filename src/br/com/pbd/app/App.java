package br.com.pbd.app;

import br.com.pbd.models.beans.Funcionario;
import br.com.pbd.models.fachada.CoreFachada;
import br.com.pbd.util.Criptografar;
import br.com.pbd.view.TelaLogin;

public class App {
    
    public static void main(String[] args) {
        
        CoreFachada fachada = new CoreFachada();
        TelaLogin telaLogin = new TelaLogin(fachada);
        telaLogin.setVisible(true);
        
        Funcionario admin = new Funcionario();
        admin.setLogin("admin");
        admin.setSenha("admin");
        admin.setSenha(Criptografar.encriptografar("admin"));
        admin.setNome("Matheus");
        admin.setTipo("Administrador");
        
        fachada.SalvarFuncionario(admin);
    }
}
