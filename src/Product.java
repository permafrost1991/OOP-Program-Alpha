/*
 *Name : James Hood
 * Description: ****Step 3****** An abstract type that implements the Item interface.
 * Implements the basic functionality that all items on a production line should have.
 * Date: 9/29/18
 * Resource: Prof. Vanselow
 */


import java.util.Date;

public class Product implements Item {

  protected int serialNumber;

  protected String manufacturer;

  protected Date manufacturedOn;

  protected String name;

  //Class Variables

  private static int currentProductionNumber = 1;
  //This will store the next number to be
  //assigned to serialNumber


  public Product(String name) {

    setName( name );

    setProductionNumber( currentProductionNumber );

    currentProductionNumber++;

    manufacturer = MANUFACTURER;

    manufacturedOn = new Date();

  }

  @Override

  public void setProductionNumber(int prodNumber) {

    serialNumber = prodNumber;

  }

  @Override

  public void setName(String name) {

    this.name = name;


  }

  @Override

  public String getName() {

    return name;

  }

  @Override

  public Date getManufactureDate() {

    return manufacturedOn;

  }

  @Override

  public int getSerialNumber() {

    return serialNumber;

  }

//toString method that returns all values in and returns them as a string.
  public String toString() {

    String str = "Manufacturer: " + manufacturer + "\n";

    str += "Serial Number: " + serialNumber + "\n";

    str += "Date: " + manufacturedOn + "\n";

    str += "Name: " + name;

    return str;


  }

}