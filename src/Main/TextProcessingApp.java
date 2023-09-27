/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.TextController;
import Model.TextModel;
import View.TextView;

public class TextProcessingApp {
    public static void main(String[] args) {
        // Đường dẫn đến file input.txt trên máy của bạn
        String inputFilePath = "C:\\Users\\FPTShop\\Documents\\NetBeansProjects\\NormalizingText\\src\\File\\input.txt";
        // Đường dẫn đến file output.txt trên máy của bạn
        String outputFilePath = "C:\\Users\\FPTShop\\Documents\\NetBeansProjects\\NormalizingText\\src\\File\\output.txt";

        TextModel model = new TextModel();
        TextView view = new TextView();
         TextController controller = new TextController(model, new TextView());


        controller.processText(inputFilePath, outputFilePath);
    }
}
