package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.Funcionario;
import java.util.List;

public interface IcoreFachada {
    
    public List<Funcionario> ValidarLogin(String login, String senha);
    
    public void SalvarFuncionario(Funcionario funcionario);
    
}
