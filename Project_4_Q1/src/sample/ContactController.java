package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import java.io.File;
import java.util.Collections;

public class ContactController {

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private ListView<Contact> contactListView;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField imageTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private ImageView contactImageView;

    @FXML
    private Button add;

    @FXML
    private Button update;

    @FXML
    private Button delete;


    private final ObservableList<Contact> contactList = FXCollections.observableArrayList();

    public void initialize(){

        contactList.add(new Contact(    "Ray",
                                        "Dalio",
                                        "websitehelp@bwater.com",
                                        "+1(203)226-3030",
                                        "./sample/images/dalio.png" )
        );

        contactList.add(new Contact(    "Narendra",
                                        "Modi",
                                        "connect@mygov.nic.in",
                                        "+91-11-23012312",
                                        "./sample/images/modi.png" )
        );

        contactList.add(new Contact(    "Elon",
                                        "Musk",
                                        "elonmusk@tesla.com",
                                        "+1(888)518-3752",
                                        "./sample/images/musk.png" )
        );

        contactList.add(new Contact(    "Jordan",
                                        "Peterson",
                                        "jordan.peterson@utoronto.ca",
                                        "416-978-7619",
                                        "./sample/images/peterson.png" )
        );

        contactList.add(new Contact(    "Kartikeya",
                                        "Sharma",
                                        "kartikeyasharma04@gmail.com",
                                        "+1(917)306-8361",
                                        "./sample/images/sharma.png" )
        );

        contactList.add(new Contact(    "Masayoshi",
                                        "Son",
                                        "mson@softbank.co.jp",
                                        "+81-3-6889-2000",
                                        "./sample/images/son.png")
        );

        contactList.add(new Contact(    "Jack",
                                        "Ma",
                                        "jackMa@alibaba.com",
                                        "+1(888)518-3752",
                                        "./sample/images/ma.png" )
        );

        contactList.add(new Contact(    "Tae",
                                        "Musk",
                                        "TaeMusk@gmail.com",
                                        "+1(243)518-3752",
                                        "./sample/images/tae.png" )
        );
        contactList.add(new Contact(    "Tiffany",
                                        "Barker",
                                        "elonmusk@tesla.com",
                                        "+1(888)518-3752",
                                        "./sample/images/barker.png" )
        );
        contactList.add(new Contact(    "Alice",
                                        "Kim",
                                        "alicekim@tesla.com",
                                        "+1(888)438-3752",
                                        "./sample/images/kim.png" )
        );


        Collections.sort(contactList, (o2, o1) -> -o1.getLastName().compareTo(o2.getLastName()));
        contactListView.setItems(contactList);


        contactListView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {

                    if(newValue==null || contactList.size()==0){
                        clearAll();
                    } else {

                        firstNameTextField.setText(newValue.getFirstName());
                        lastNameTextField.setText(newValue.getLastName());
                        phoneNumberTextField.setText(newValue.getPhoneNumber());
                        emailTextField.setText(newValue.getEmail());
                        imageTextField.setText(newValue.getImagePath());
                        contactImageView.setImage(new Image(newValue.getImagePath()));
                    }
                }
        );
        contactListView.setCellFactory(param -> new ImageTextCell());
    }

    private void clearAll() {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        phoneNumberTextField.setText("");
        emailTextField.setText("");
        imageTextField.setText("./sample/images/default.png");
        contactImageView.setImage(new Image(imageTextField.getText()));
    }


    @FXML
    void addContactActionEvent(ActionEvent event) {

        clearAll();

        contactList.add(new Contact(    firstNameTextField.getText(),
                                        lastNameTextField.getText(),
                                        emailTextField.getText(),
                                        phoneNumberTextField.getText(),
                                        imageTextField.getText()
        ));

        Collections.sort(contactList, (o2, o1) -> -o1.getLastName().compareTo(o2.getLastName()));

        contactListView.refresh();
    }

    @FXML
    void updateContactActionEvent(ActionEvent event) {
        int index = contactList.indexOf(contactListView.getSelectionModel().getSelectedItem());

        if((index < 0) || contactList.size()==0){
            return;
        }

        contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).setFirstName(firstNameTextField.getText());
        contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).setLastName(lastNameTextField.getText());
        contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).setEmail(emailTextField.getText());
        contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).setPhoneNumber(phoneNumberTextField.getText());
        contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).setImagePath(imageTextField.getText());

        String imaFile = "src/"+imageTextField.getText().substring(2);
        File imageFile = new File(imaFile);

        if(!(imageTextField.getText().equals("./sample/images/default.png"))) {
            if (!(imageFile.exists())&& !(imaFile.equals("src/sample/images/"))){
                imageTextField.setText("./sample/images/default.png");
                contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).setImagePath(imageTextField.getText());
            }
        }
        contactImageView.setImage(new Image(contactList.get((contactList.indexOf(contactListView.getSelectionModel().getSelectedItem()))).getImagePath()));

        Collections.sort(contactList, (o2, o1) -> -o1.getLastName().compareTo(o2.getLastName()));
        contactListView.refresh();
    }

    @FXML
    void deleteButtonActionEvent(ActionEvent event) {
        int index = contactList.indexOf(contactListView.getSelectionModel().getSelectedItem());
        if((index < 0) || contactList.size()==0){
            return;
        }
        if(contactList.size()==1){
            contactList.clear();
            return;
        }
        contactList.remove(index, index+1);
    }

}
