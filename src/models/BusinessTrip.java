package models;

import java.time.LocalDate;
import java.util.List;

/*
 * BusinessTrip class
 */
public class BusinessTrip {
  /*
   * Attributes
   */
  private String purpose;
  private LocalDate startDate;
  private LocalDate endDate;
  private List<Staff> assignedStaff;
  private List<Transportation> transportationsUsed;

  /*
   * Getters + Setters
   */
  // purpose
  public String getPurpose() {
    return this.purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  // startDate
  public LocalDate getStartDate() {
    return this.startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  // endDate
  public LocalDate getEndDate() {
    return this.endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  // assignedStaff
  public List<Staff> getAssignedStaff() {
    return this.assignedStaff;
  }
  public void setAssignedStaff(List<Staff> assignedStaff) {
    this.assignedStaff = assignedStaff;
  }

  // usedTransportation
  public List<Transportation> getTransportationsUsed() {
    return this.transportationsUsed;
  }
  public void setTransportationsUsed(List<Transportation> transportationsUsed) {
    this.transportationsUsed = transportationsUsed;
  }
}
