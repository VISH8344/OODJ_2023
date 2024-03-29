/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HostelRoom;
import Model.Payment;
import Model.Student;
import Util.FileName;
import Util.FileUtil;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 */
public class PaymentController implements Controller {

    private ArrayList<Payment> payments;
    private static PaymentController paymentController;

    public static PaymentController ActivatePaymentController() {
        if (PaymentController.paymentController == null) {
            PaymentController.paymentController = new PaymentController();
        }
        return PaymentController.paymentController;
    }

    PaymentController() {
        this.payments = new ArrayList<>();
        ArrayList<String[]> textRecords = FileUtil.ReadFile(FileName.PAYMENT);
        textRecords.forEach(record -> {
            Payment loadedObject = fromTextToObject(record);
            payments.add(loadedObject);
        });
    }
    
    private Payment fromTextToObject(String[] splittedLine){
        int id = Integer.parseInt(splittedLine[0]);
        double amount = Double.parseDouble(splittedLine[1]);
        LocalDateTime dt = LocalDateTime.parse(splittedLine[2]);
        boolean isRefunded = Boolean.parseBoolean(splittedLine[3]);
        int stuID = Integer.parseInt(splittedLine[4]);
        int roomID = Integer.parseInt(splittedLine[5]);
        Student stu = StudentController.ActivateStudentController().getStudentById(stuID);
        HostelRoom room = HostelRoomController.ActivateHostelRoomController().getHostelRoomById(roomID);
        return new Payment(id, stu, room, amount, dt, isRefunded);
    }
    
    private ArrayList<String> fromObjectToText(){
        ArrayList<String> fileContents = new ArrayList<>();
        payments.forEach(payment -> {
            fileContents.add(payment.getPaymentID() +";"+ payment.getAmount() +";"+ payment.getDateTime() +";"+ payment.isRefunded() +";"+ payment.getStudent().getStudentID() +";"+ payment.getRoom().getRoomID());
        });
        return fileContents;
    }

     private int generateUniqueNumber(int num){
        return num + 1;
    }
    
    private boolean checkIDIsExist(int id){
        boolean isFound = false;
        for(Payment payment : payments){
            if(payment.getPaymentID()== id){
                isFound = true;
            }
        }
        return isFound;
    }

    @Override
    public int getNewID() {
        int tempNewId = payments.size() + 1;
        boolean isIDExist = checkIDIsExist(tempNewId);
        while(isIDExist){
            tempNewId = generateUniqueNumber(tempNewId);
            if(!checkIDIsExist(tempNewId)){
                break;
            }
        }
        return tempNewId;
    }

    public ArrayList<Payment> getPayments() {
        return this.payments;
    }

    public ArrayList<Payment> getValidPayments() {
        ArrayList<Payment> response = new ArrayList<>();
        for (int i = 0; i < payments.size(); i++) {
            if (!payments.get(i).isRefunded()) {
                response.add(payments.get(i));
            }
        }
        if (response == null) {
            System.out.println("No valid payment");
        }
        return response;
    }
    
    public ArrayList<Payment> getAnnualPayments(){
        ArrayList<Payment> validpayment = getValidPayments();
        ArrayList<Payment> response = new ArrayList<>();
        for(int i = 0; i < validpayment.size();i++){
            if(payments.get(i).getDateTime().getYear() == 2023){
                response.add(payments.get(i));
            }
        }
        if (response == null) {
            System.out.println("No valid payment in 2023");
        }
        return response;
    }
    
    public ArrayList<Payment> getMonthlyPayments(int x){
        ArrayList<Payment> validpayment = getValidPayments();
        ArrayList<Payment> response = new ArrayList<>();
        for(int i = 0; i < validpayment.size();i++){
            if(payments.get(i).getDateTime().getMonthValue() == x){
                response.add(payments.get(i));
            }
        }
        if (response == null) {
            System.out.println("No valid payment in 2023");
        }
        return response;
    }
    
    public ArrayList<Payment> getDailyPayments(int x, int y){
        ArrayList<Payment> validpayment = getMonthlyPayments(x);
        ArrayList<Payment> response = new ArrayList<>();
        for(int i = 0; i < validpayment.size();i++){
            if(payments.get(i).getDateTime().getDayOfMonth()== y){
                response.add(payments.get(i));
            }
        }
        if (response == null) {
            System.out.println("No valid payment in 2023");
        }
        return response;
    }

    public double getTotalSales() {
        double total = 0.0;
        ArrayList<Payment> validPayments = getValidPayments();
        for (Payment payment : validPayments) {
            System.out.println("payment id: " + payment.getPaymentID());
            System.out.println("payment: " + payment.getAmount());
            total += payment.getAmount();
        }
        return total;
    }

    public Payment getPaymentById(int id) {
        Payment response = null;
        for (int i = 0; i < payments.size(); i++) {
            if (payments.get(i).getPaymentID()== id) {
                response = payments.get(i);
                break;
            }
        }
        if (response == null) {
            System.out.println("Payment with this id : " + id + " is not found");
        }
        return response;
    }

    public ArrayList<Payment> getPaymentsByStudentID(int stuID) {
        ArrayList<Payment> responses = null;
        for (int i = 0; i < payments.size(); i++) {
            if (payments.get(i).getStudent().getStudentID() == stuID) {
                responses.add(payments.get(i));
            }
        }
        if (responses == null) {
            System.out.println("Payment with this student id : " + stuID + " is not found");
        }
        return responses;
    }

    public <T> void add(Payment payment) {
        this.payments.add(payment);
        saveRecords();
    }

    public void update(Payment payment) {
        for (int i = 0; i < payments.size(); i++) {
            if (payments.get(i).getPaymentID() == payment.getPaymentID()) {
                payments.set(i, payment);
                break;
            }
        }
        saveRecords();
    }

    @Override
    public void saveRecords() {
        System.out.println("payments" + payments.toString());
        FileUtil.WriteToFile(FileName.PAYMENT, fromObjectToText());
    }

    // Testing
//    public static void main(String[] args) {
//        PaymentController sc = paymentController.ActivatePaymentController();
//        sc.getPayments().forEach(payment -> {
//            System.out.println(payment.isRefunded());
//        });
//
//        System.out.println(sc.getPaymentById(1));
//        System.out.println(sc.getTotalSales());
//    }
}
