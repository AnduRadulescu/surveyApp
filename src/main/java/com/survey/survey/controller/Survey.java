package com.survey.survey.controller;

import com.survey.survey.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

/**
 * @author alexa on 6/17/2019.
 */
@Controller
public class Survey {
    @FXML
    public TextField emailText;
    @FXML
    public TextField nrText;
    @FXML
    public TextField uniText;
    @FXML
    public ChoiceBox workChoiceBox;
    @FXML
    public TextField specChoiceBox;
    @FXML
    public TextField jobText;
    @FXML
    public ChoiceBox jobChoiceBox;
    @FXML
    public TextField compNameText;
    @FXML
    public TextField compCityText;
    @FXML
    public ChoiceBox studyChoice;
    @FXML
    public TextField whishedText;


    public void onSubmit(ActionEvent actionEvent) {

    }

    void initialize() {
    }

    void initData(User user) {
        System.out.println(user);
    }
}
