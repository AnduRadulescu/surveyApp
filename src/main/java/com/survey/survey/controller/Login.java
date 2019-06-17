package com.survey.survey.controller;

import com.survey.survey.model.User;
import com.survey.survey.repository.UserRepository;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class Login implements ApplicationContextAware {

    @Autowired
    private UserRepository userRepository;

    @FXML
    public Button logInBtn;
    @FXML
    public Button singInBtn;
    @FXML
    public PasswordField passwordText;
    @FXML
    public TextField userText;
    @FXML
    public ChoiceBox choiceBox;
    private ApplicationContext context;

    @FXML
    public void onLogin(ActionEvent actionEvent) throws IOException {
        if (isFieldEmpty()) {
            return;
        } else {
            User user = userRepository.findByUserNameAndPassword(userText.getText(), passwordText.getText());
            switch (choiceBox.getValue().toString()) {
                case "Student":
                    System.out.println("student");
                    //load fxml
                    openSurveyWindow(actionEvent);
                    break;
                case "Administrator":
                    System.out.println("Administrator");
                    //load fxml
                    break;
            }
        }
    }

    private boolean isFieldEmpty() {
        return userText.getText().isEmpty() || passwordText.getText().isEmpty() || choiceBox.getValue() == null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (this.context != null) {
            return;
        }
        this.context = applicationContext;
    }

    private Object createControllerForType(final Class<?> type) {
        return context.getBean(type);
    }

    private void openSurveyWindow(Event event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/survey.fxml/"));
        loader.setControllerFactory(this::createControllerForType);
        Parent rootNode = loader.load();
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
}
