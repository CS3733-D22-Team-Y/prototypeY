package edu.wpi.cs3733.d22.teamY.model.dao;

import edu.wpi.cs3733.d22.teamY.MedEquipReqDBO;
import edu.wpi.cs3733.d22.teamY.model.dao.exception.DaoAddException;
import edu.wpi.cs3733.d22.teamY.model.dao.exception.DaoDeleteException;
import edu.wpi.cs3733.d22.teamY.model.dao.exception.DaoGetException;
import edu.wpi.cs3733.d22.teamY.model.dao.exception.DaoUpdateException;
import java.util.List;

public interface MedEquipReqDao {
  List<MedEquipReqDBO> getAllMedEquipReq() throws DaoGetException;

  MedEquipReqDBO getMedEquipReq(String requestNum) throws DaoGetException;

  void addMedEquipReq(MedEquipReqDBO mreq) throws DaoAddException;

  void updateMedEquipReq(MedEquipReqDBO mreq) throws DaoUpdateException;

  void deleteMedEquipReq(MedEquipReqDBO mreq) throws DaoDeleteException;
}
