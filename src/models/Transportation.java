package models;

import java.time.LocalDateTime;

public abstract class Transportation {
  /*
   * Attributes
   */
  private LocalDateTime startDateTime;
  private LocalDateTime endDateTime;
  private String departureLocation;
  private String arrivalLocation;
  private double fare;

  /*
   * Getters + Setters
   */
  // startDateTime
  public LocalDateTime getStartDateTime() {
    return this.startDateTime;
  }
  public void setStartDateTime(LocalDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  // endDateTime
  public LocalDateTime getEndDateTime() {
    return this.endDateTime;
  }
  public void setEndDateTime(LocalDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  // departureLocation
  public String getDepartureLocation() {
    return this.departureLocation;
  }
  public void setDepartureLocation(String departureLocation) {
    this.departureLocation = departureLocation;
  }

  // arrivalLocation
  public String getArrivalLocation() {
    return this.arrivalLocation;
  }
  public void setArrivalLocation(String arrivalLocation) {
    this.arrivalLocation = arrivalLocation;
  }

  // fare
  public double getFare() {
    return this.fare;
  }
  public void setFare(double fare) {
    this.fare = fare;
  }

  /*
   * Abstract Methods
   */
  // Get the type of transportation
  public abstract String getTransportationType();
  // Get the details of the transportation
  public abstract String getTransportationDetails();
  // Calculate the fare of the transportation
  public abstract double calculateFare();
}
