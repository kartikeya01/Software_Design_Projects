package sample;

// Create a JavaFx mortgage calculator app that allows the users
// to enter a purchase price, down-payment amount and interest rate.
// Based on these values, the app should calculate the loan amount
// (purchase price minus down payment) and display the monthly payment
// for 10-,20- and 30- year loans. Allow the user to select a custom
// loan duration (in years) by using slider and display the monthly
// payments.

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;


public class Controller {

    @FXML
    private TextField purchasePrice;

    @FXML
    private TextField downPaymentAmount;

    @FXML
    private TextField interestRate;

    @FXML
    private TextField monthlyPayment;

    @FXML
    private Slider loanDurationSlider;

    @FXML
    private BigDecimal loanDuration = new BigDecimal(0);

    @FXML
    public void MortgageCalculator(javafx.event.ActionEvent actionEvent) {

        try {
            BigDecimal userPurchasePrice = new BigDecimal(purchasePrice.getText());
            BigDecimal userDownPaymentAmount = new BigDecimal(downPaymentAmount.getText());

            if ( userPurchasePrice.intValue() < 1 || userDownPaymentAmount.intValue() < 1 ) {
                throw new NumberFormatException();
            }

            if ( userDownPaymentAmount.intValue() > userPurchasePrice.intValue() ) {
                throw new NumberFormatException();
            }

            BigDecimal userInterestRate = new BigDecimal(interestRate.getText());
            BigDecimal userLoanAmount = userPurchasePrice.subtract(userDownPaymentAmount);

            userInterestRate = userInterestRate.divide(new BigDecimal("12"), 8, RoundingMode.HALF_UP).divide(new BigDecimal("100"), 8, RoundingMode.HALF_UP);
            BigDecimal x = userInterestRate.add(BigDecimal.valueOf(1)).pow(loanDuration.multiply(BigDecimal.valueOf(12)).intValue());

            BigDecimal rate = x.multiply(userInterestRate).divide(x.subtract(BigDecimal.valueOf(1.0)), 8, RoundingMode.HALF_UP);
            BigDecimal result = userLoanAmount.multiply(rate);


            monthlyPayment.setText(NumberFormat.getCurrencyInstance().format(result));

        } catch (NumberFormatException | AbstractMethodError | ArithmeticException result) {
            monthlyPayment.setText("Please enter a valid calculation");
        }
    }

    public void initialize() {
        NumberFormat.getCurrencyInstance().setRoundingMode(RoundingMode.HALF_UP);

        loanDurationSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                loanDuration = BigDecimal.valueOf(newValue.intValue());
            }
        });
    }
}
