package br.com.pbd.models.dao;

import br.com.pbd.models.beans.Funcionario;
import java.util.List;

public interface IcoreValidacaoDAO {
    public List<Funcionario> ValidarLogin(String login, String senha);
}
