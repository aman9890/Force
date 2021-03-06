package OpenCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AmanSingh {
    public static void main(String[] args) throws IOException, CsvException {  //read data from Student.txt file
        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));

        CSVParser parser = new CSVParserBuilder()
                .withSeparator('\t')
                .build();

        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        List<String[]> data = obj.readAll();
/*
        Double fare = data.stream()
                .mapToDouble(x->Double.parseDouble(x[2]))
                .sum();
        System.out.println(fare);
*/



        double sum1=data.stream()

                .mapToDouble(x -> Double.parseDouble(x[2]))
                .sum();
        System.out.println("total amount of sales is:   "+sum1);
    }
}

