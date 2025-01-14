package com.example;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RGBColorsController {

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private Slider greenSlider;

    @FXML
    private TextField greenTextField;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;

    public void initialize() {
        // property binding
        redTextField.textProperty()
                .bind(redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty()
                .bind(greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty()
                .bind(blueSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty()
                .bind(alphaSlider.valueProperty().asString("%.2f"));

        // listeners for sliders
        redSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue, Number newValue) {
                red = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }

        });

        greenSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue, Number newValue) {
                green = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }

        });

        blueSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue, Number newValue) {
                blue = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }

        });

        alphaSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue, Number newValue) {
                alpha = newValue.doubleValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }

        });
    }
}
