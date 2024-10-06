/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.servicos;

import br.edu.qi.dao.DAOFactory;
import br.edu.qi.dao.MotoristaDAO;
import br.edu.qi.modelo.Motorista;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diogenes wilgner
 * @version 1.0
 * @since 10/07/2019 - 16:09
 */
public class MotoristaServicos {

    /**
     *
     * @param motorista objeto da UI
     * @throws SQLException retorna exception no banco de dados
     */
    public void cadastrarMotorista(Motorista motorista) throws SQLException {
        MotoristaDAO motoristaDAO = DAOFactory.getMotoristaDAO();
        motoristaDAO.cadastrarMotorista(motorista);
    }//fecha método

    public void alterarMotorista(Motorista motorista) throws SQLException {
        MotoristaDAO motoristaDAO = DAOFactory.getMotoristaDAO();
        motoristaDAO.alterarMotorista(motorista);
    }//fecha método

    public void deletarMotorista(long id) throws SQLException {
        MotoristaDAO motoristaDAO = DAOFactory.getMotoristaDAO();
        motoristaDAO.deletarMotorista(id);
    }//fecha método

    public ArrayList<Motorista> buscarMotorista()
            throws SQLException {
        MotoristaDAO motoristaDAO = DAOFactory.getMotoristaDAO();
        return motoristaDAO.buscarMotoristas();
    }//fecha buscarMotorista

    public ArrayList<Motorista> filtrar(String pesquisa, String filtro)
            throws SQLException {
        MotoristaDAO motoristaDAO = DAOFactory.getMotoristaDAO();
        return motoristaDAO.filtrar(pesquisa, filtro);
    }//fecha filtrarMotorista    
}//fecha classe

