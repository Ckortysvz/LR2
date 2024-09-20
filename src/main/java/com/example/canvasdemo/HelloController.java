package com.example.canvasdemo;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import model.Draw;

public class HelloController {
    @FXML
    private Canvas canvasmy; // Подключение к Canvas из FXML
    @FXML
    private ColorPicker colorpicker; // Подключение к ColorPicker из FXML

    private Draw drawer = new Draw(); // Создаем экземпляр класса Draw

    // Метод для рисования прямоугольника
    @FXML
    protected void drawRectangle() {
        GraphicsContext graphicsContext = canvasmy.getGraphicsContext2D();
        Color color = colorpicker.getValue();
        graphicsContext.clearRect(0, 0, canvasmy.getWidth(), canvasmy.getHeight()); // Очищаем холст
        drawer.drawRectangle(graphicsContext, 50, 50, 100, 50, color);
        System.out.println("Rectangle drawn with color: " + color);
    }

    // Метод для рисования квадрата
    @FXML
    protected void drawSquare() {
        GraphicsContext graphicsContext = canvasmy.getGraphicsContext2D();
        Color color = colorpicker.getValue();
        graphicsContext.clearRect(0, 0, canvasmy.getWidth(), canvasmy.getHeight()); // Очищаем холст
        drawer.drawSquare(graphicsContext, 200, 50, 50, color);
        System.out.println("Square drawn with color: " + color);
    }

    // Метод для рисования круга
    @FXML
    protected void drawCircle() {
        GraphicsContext graphicsContext = canvasmy.getGraphicsContext2D();
        Color color = colorpicker.getValue();
        graphicsContext.clearRect(0, 0, canvasmy.getWidth(), canvasmy.getHeight()); // Очищаем холст
        drawer.drawCircle(graphicsContext, 350, 50, 25, color);
        System.out.println("Circle drawn with color: " + color);
    }
}
