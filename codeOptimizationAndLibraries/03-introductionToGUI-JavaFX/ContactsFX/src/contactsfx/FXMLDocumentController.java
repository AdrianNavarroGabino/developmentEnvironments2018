/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsfx;

import contactsfx.data.Contact;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author nacho
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<Contact> listContacts;
    @FXML
    private TextField textName;
    @FXML
    private TextField textEmail;
    @FXML
    private TextField textPhone;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonRemove;
    
    ObservableList<Contact> contacts;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contacts = FXCollections.observableArrayList(readContacts());
        listContacts.setItems(contacts);

        listContacts.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Contact>()
            {
                @Override
                public void changed(ObservableValue<? extends Contact> observable, 
                                    Contact oldValue, Contact newValue) {
                    if (newValue != null)
                    {
                        textName.setText(newValue.getName());
                        textEmail.setText(newValue.getEmail());
                        textPhone.setText(newValue.getPhoneNumber());
                    }
                }
            }
        );
        
    }

    @FXML
    private void addContact(ActionEvent event) {
        if (textName.getText().isEmpty() || textEmail.getText().isEmpty() ||
            textPhone.getText().isEmpty())
        {
            Alert dialog = new Alert(AlertType.ERROR);
            dialog.setTitle("Error");
            dialog.setHeaderText("Error adding data");
            dialog.setContentText("No field can be empty");
            dialog.showAndWait();
        } else {
            Contact newContact = new Contact(textName.getText(), 
                                             textEmail.getText(),
                                             textPhone.getText());
            contacts.add(newContact);
            saveContacts();

            Alert dialog = new Alert(AlertType.INFORMATION);
            dialog.setTitle("Success");
            dialog.setHeaderText("Adding contacts");
            dialog.setContentText("Contact successfully added");
            dialog.showAndWait();            
        }
    }

    @FXML
    private void removeContact(ActionEvent event) {
        int position = listContacts.getSelectionModel().getSelectedIndex();
        if (position >= 0)
        {
            contacts.remove(position);
            saveContacts();
        }
    }
    
    private List<Contact> readContacts() {
        
        try {
            List<String> lines = Files.readAllLines(Paths.get("contacts.txt"));
            return lines.stream()
                        .map(line -> new Contact(line.split(":")[0],
                                                 line.split(":")[1],
                                                 line.split(":")[2]))
                        .collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
    private void saveContacts() {
        
        try (PrintWriter pw = new PrintWriter("contacts.txt"))
        {            
            contacts.stream()
                    .forEach(contact -> {
                        pw.println(contact.getName() + ":" +
                                   contact.getEmail() + ":" +
                                   contact.getPhoneNumber());
                    });
        } catch (Exception e) {
        }
    }
}
