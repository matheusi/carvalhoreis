package br.com.pbd.models.fachada;

import br.com.pbd.models.beans.Funcionario;
import br.com.pbd.models.business.FuncionarioBusiness;
import br.com.pbd.models.business.IcoreFuncionarioBusiness;
import br.com.pbd.models.business.IcoreValidacaoBusiness;
import br.com.pbd.models.business.ValidacaoBusiness;
import java.util.List;

public class CoreFachada implements IcoreFachada{

    IcoreValidacaoBusiness validacaoBusiness;
    IcoreFuncionarioBusiness funcionarioBusiness;
    
    public CoreFachada() {
        this.validacaoBusiness = new ValidacaoBusiness();
        this.funcionarioBusiness = new FuncionarioBusiness();
    }

    @Override
    public List<Funcionario> ValidarLogin(String login, String senha) {
        return validacaoBusiness.ValidarLogin(login, senha);
    }

    @Override
    public void SalvarFuncionario(Funcionario funcionario) {
        funcionarioBusiness.Salvar(funcionario);
    }
    
}
