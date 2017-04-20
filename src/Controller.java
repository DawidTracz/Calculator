import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private double intNumberFirst;
    private String operationNumber;
    @FXML
    TextField textBar;
    @FXML
    public void numberPressed(ActionEvent event) {
        String number = ((Button) event.getSource()).getText();
        String numberBefore = textBar.getText();
        String numberAfter = numberBefore + number;
        textBar.setText(numberAfter);
    }
    @FXML
    public void operationPressed(ActionEvent event) {
        String numberBefore;
        if (textBar.getText().equals("")) {
            numberBefore = "0";
            intNumberFirst = Double.parseDouble(numberBefore);
            textBar.setText("");
            operationNumber = ((Button) event.getSource()).getText();
        } else {
            numberBefore = textBar.getText();
            intNumberFirst = Double.parseDouble(numberBefore);
            textBar.setText("");
            operationNumber = ((Button) event.getSource()).getText();
        }
    }
    @FXML
    public void equalsPressed(ActionEvent event) {
        String numberAfter = textBar.getText();
        double intNumberAfter = Double.parseDouble(numberAfter);

        switch (operationNumber) {
            case "+":
                intNumberFirst = intNumberFirst + intNumberAfter;
                break;
            case "-":
                intNumberFirst = intNumberFirst - intNumberAfter;
                break;
            case "X":
                intNumberFirst = intNumberFirst * intNumberAfter;
                break;
            case "/":
                intNumberFirst = intNumberFirst / intNumberAfter;
                break;
            default:
                break;
        }
        textBar.setText("" + intNumberFirst);
    }
    @FXML
    public void clearPressed(ActionEvent event) {
        textBar.setText("");
    }
}
