package Balaji.Assignment;
import java.io.FileNotFoundException;

public interface Interface_cls {
   public void showAllFiles();
   public void addFile();
   public void deleteFile();
   abstract void searchFile() throws FileNotFoundException;
  }