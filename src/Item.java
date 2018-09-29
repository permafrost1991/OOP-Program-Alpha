/*
 *Name : James Hood
 * Description: ****Step 1***** Interface that forces all classed to implements these functions
 * Date: 9/29/18
 * Resource: Prof. Vanselow
 */

import java.util.Date;

public interface Item {

  final String MANUFACTURER= "OracleProduction";

  void setProductionNumber(int productionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}