package co.edu.uco.pathorder.bussinesslogic.facade.impl;

import co.edu.uco.pathorder.bussinesslogic.businesslogic.ReservaBusinessLogic;
import co.edu.uco.pathorder.bussinesslogic.businesslogic.impl.ReservaBusinessLogicImpl;
import co.edu.uco.pathorder.bussinesslogic.facade.ReservaFacade;
import co.edu.uco.pathorder.crosscutting.excepciones.PathOrderException;
import co.edu.uco.pathorder.data.dao.factory.DAOFactory;
import co.edu.uco.pathorder.data.dao.factory.Factory;
import co.edu.uco.pathorder.dto.ReservaDTO;

import java.util.List;
import java.util.UUID;

public class ReservaFacadeimpl implements ReservaFacade {

    private DAOFactory daoFactory;
    private ReservaBusinessLogic reservaBusinessLogic;

    public ReservaFacadeimpl() throws PathOrderException {
        daoFactory = DAOFactory.getFactory(Factory.POSTGRES_SQL);
        reservaBusinessLogic = new ReservaBusinessLogicImpl(daoFactory);
    }



    @Override
    public void registrarReserva(ReservaDTO reserva) throws PathOrderException {

    }

    @Override
    public void modificarReserva(UUID id, ReservaDTO reserva)  throws PathOrderException{

    }

    @Override
    public void eliminarReserva(UUID id) throws PathOrderException {

    }

    @Override
    public List<ReservaDTO> consultarReserva(UUID id)  throws PathOrderException {
        return List.of();
    }

    @Override
    public List<ReservaDTO> consultarReservas(ReservaDTO filtro) throws PathOrderException {
        return List.of();
    }
}
