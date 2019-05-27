package br.com.pbd.models.business;

import br.com.pbd.models.beans.Funcionario;
import java.util.List;

public interface IcoreValidacaoBusiness {
    public List<Funcionario> ValidarLogin(String login, String senha);
}
