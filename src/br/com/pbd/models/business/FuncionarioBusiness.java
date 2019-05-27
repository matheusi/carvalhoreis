package br.com.pbd.models.business;

import br.com.pbd.models.beans.Funcionario;
import br.com.pbd.models.dao.FuncionarioDAO;
import br.com.pbd.models.dao.IcoreFuncionarioDAO;
import br.com.pbd.util.Conexao;

public class FuncionarioBusiness implements IcoreFuncionarioBusiness{
    
    IcoreFuncionarioDAO funcionarioDao;
    
    public FuncionarioBusiness() {
        this.funcionarioDao = new FuncionarioDAO(Conexao.conexao());
    }
    
    @Override
    public void Salvar(Funcionario funcionario){
        funcionarioDao.Salvar(funcionario);
    }
}
