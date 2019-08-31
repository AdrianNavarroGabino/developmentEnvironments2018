/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepadfx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 *
 * @author nacho
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private MenuItem menuOpen;
    @FXML
    private MenuItem menuSave;
    @FXML
    private MenuItem menuExit;
    @FXML
    private TextArea textResult;
    @FXML
    private Label labelStatus;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void open(ActionEvent event) 
    {
        try
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open File");
            File selectedFile = fileChooser.showOpenDialog(null);
            
            if (selectedFile != null)
            {
                List<String> lines = Files.readAllLines(selectedFile.toPath());
                for(String line: lines)
                {
                    textResult.appendText(line + "\n");
                }
                labelStatus.setText(lines.size() + " lines read from file");
            }
        } catch (Exception e) {}
    }

    @FXML
    private void save(ActionEvent event) 
    {
        PrintWriter pw = null;
        try
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save file");
            File selectedFile = fileChooser.showSaveDialog(null);
            
            if (selectedFile != null)
            {
                pw = new PrintWriter(new FileWriter(selectedFile));
                pw.print(textResult.getText());
                labelStatus.setText("File successfully saved");
            }
        } catch (IOException e) {
            labelStatus.setText("Error saving file");
            e.printStackTrace();
        } finally {
            try
            {
                pw.close();
            } catch (Exception e) {}
        }
    }

    @FXML
    private void exit(ActionEvent event) 
    {
        System.exit(0);
    }
    
}
