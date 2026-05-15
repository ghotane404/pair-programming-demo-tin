package com.pluralsight.io;

import com.pluralsight.models.Contract;
import com.pluralsight.models.Dealership;
import com.pluralsight.models.Vehicle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContractFileManager {

    public static void loadConstract() throws IOException {
//        Contract contracts;
        FileReader fileReader = new FileReader("data/contracts.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        String[] cols = line.split("\\|");

        String contractType = cols[0];
        String date = cols[1];
        String customerName = cols[2];
        String customerEmail = cols[3];

        int vin = Integer.parseInt(cols[4]);
        int year = Integer.parseInt(cols[5]);

        String make = cols[6];
        String model = cols[7];
        String vehicleType = cols[8];
        String color = cols[9];

        int odometer = Integer.parseInt(cols[10]);

        double vehiclePrice = Double.parseDouble(cols[11]);
        double salesTax = Double.parseDouble(cols[12]);
        double recordingFee = Double.parseDouble(cols[13]);
        double processingFee = Double.parseDouble(cols[14]);

        String financeOption = cols[15];

        double expectedEndingValue = Double.parseDouble(cols[16]);
        double leaseFee = Double.parseDouble(cols[17]);
        double totalPrice = Double.parseDouble(cols[18]);
        double monthlyPayment = Double.parseDouble(cols[19]);


        ArrayList<Contract> contracts = new ArrayList<>();

        while((line = bufferedReader.readLine()) != null)
        {
//            contracts.add()
        }

    }


}
