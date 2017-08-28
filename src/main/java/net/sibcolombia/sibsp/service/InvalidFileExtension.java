package net.sibcolombia.sibsp.service;

/**
 * Exception thrown when the file source extension is invalid, invalid spreadsheet file extension
 * 
 * @author Valentina Grajales
 */
public class InvalidFileExtension extends Exception {

  private static final long serialVersionUID = 2168691807603702728L;

  public InvalidFileExtension(String message) {
    super(message);
  }

}
