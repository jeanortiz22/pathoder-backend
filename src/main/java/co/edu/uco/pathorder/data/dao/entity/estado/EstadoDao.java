package co.edu.uco.pathorder.data.dao.entity.estado;

import co.edu.uco.pathorder.data.dao.entity.CreateDAO;
import co.edu.uco.pathorder.data.dao.entity.DeleteDAO;
import co.edu.uco.pathorder.data.dao.entity.RetrieveDAO;
import co.edu.uco.pathorder.data.dao.entity.UpdateDAO;
import co.edu.uco.pathorder.entity.EstadoEntity;

import java.util.UUID;

public interface EstadoDao extends CreateDAO<EstadoEntity>, RetrieveDAO<EstadoEntity, UUID>, UpdateDAO<EstadoEntity, UUID>, DeleteDAO<UUID> {
}
