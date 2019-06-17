package com.survey.survey.controller;

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
    public ChoiceBox specChoiceBox;
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
}
