package edu.wpi.cs3733.d22.teamY.model;

public class MedEquipReq {
  private int requestNum;
  private String equipID;
  private String targetLocID;

  public int getKey() {
    return requestNum;
  }

  public int getRequestNum() {
    return requestNum;
  }

  public String getEquipID() {
    return equipID;
  }

  public String getTargetLocID() {
    return targetLocID;
  }

  public MedEquipReq(int requestNum, String equipID, String targetLocID) {
    this.requestNum = requestNum;
    this.equipID = equipID;
    this.targetLocID = targetLocID;
  }

  public MedEquipReq getClone() {
    return new MedEquipReq(requestNum, equipID, targetLocID);
  }
}
