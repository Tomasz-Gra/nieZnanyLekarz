package nieZnanyLekarz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderClass {

    private List<String> list_internistNames = new ArrayList<>();
    private List<String> list_oncologistNames = new ArrayList<>();
    private List<String> list_cardiologistNames = new ArrayList<>();

    private List<String> list_internistDates_1st = new ArrayList<>();
    private List<String> list_internistDates_2nd = new ArrayList<>();
    private List<String> list_internistDates_3rd = new ArrayList<>();
    private List<String> list_internistDates_4th = new ArrayList<>();

    private List<String> list_oncologistDates_1st = new ArrayList<>();
    private List<String> list_oncologistDates_2nd = new ArrayList<>();
    private List<String> list_oncologistDates_3rd = new ArrayList<>();
    private List<String> list_oncologistDates_4th = new ArrayList<>();

    private List<String> list_cardiologistDates_1st = new ArrayList<>();
    private List<String> list_cardiologistDates_2nd = new ArrayList<>();
    private List<String> list_cardiologistDates_3rd = new ArrayList<>();
    private List<String> list_cardiologistDates_4th = new ArrayList<>();

    private String generalFilePath = "C:\\Users\\A702387\\OneDrive - Atos\\Desktop\\nieZnanyLekarz\\nieZnanyLekarz\\textFiles\\";
    private String doctorNamesPath = "doctorNamesAndPictures\\doctorNames\\";
    private String doctorPicturesPath = "doctorNamesAndPictures\\doctorPictures\\";
    private String doctorDatesInternistPath = "doctorDates\\internistDates\\InternistDates_";
    private String doctorDatesOncologistPath = "doctorDates\\oncologistDates\\OncologistDates_";
    private String doctorDatesCardiologistPath = "doctorDates\\cardiologistDates\\CardiologistDates_";

    private String[] filesDoctorNames = {
                                    generalFilePath + doctorNamesPath + "InternistNames.txt",
                                    generalFilePath + doctorNamesPath + "OncologistNames.txt",
                                    generalFilePath + doctorNamesPath + "CardiologistNames.txt",
    };


    private String[] filesDatesInternist = {
                                    generalFilePath + doctorDatesInternistPath + "1st.txt",
                                    generalFilePath + doctorDatesInternistPath + "2nd.txt",
                                    generalFilePath + doctorDatesInternistPath + "3rd.txt",
                                    generalFilePath + doctorDatesInternistPath + "4th.txt"
    };

    private String[] filesDatesOncologist = {
                                    generalFilePath + doctorDatesOncologistPath + "1st.txt",
                                    generalFilePath + doctorDatesOncologistPath + "2nd.txt",
                                    generalFilePath + doctorDatesOncologistPath + "3rd.txt",
                                    generalFilePath + doctorDatesOncologistPath + "4th.txt"
    };

    private String[] filesDatesCardiologist = {
                                    generalFilePath + doctorDatesCardiologistPath + "1st.txt",
                                    generalFilePath + doctorDatesCardiologistPath + "2nd.txt",
                                    generalFilePath + doctorDatesCardiologistPath + "3rd.txt",
                                    generalFilePath + doctorDatesCardiologistPath + "4th.txt"
    };

    public static void main(String[] args)throws Exception
    {
        BufferedReaderClass bufferedReaderClass = new BufferedReaderClass();
        bufferedReaderClass.read();

        bufferedReaderClass.printAll();

        bufferedReaderClass.whenAppendStringUsingBufferedWritter_thenOldContentShouldExistToo();
        bufferedReaderClass.read();
        bufferedReaderClass.printAll();


    }

    private void readFromFile(String[] fileNameString, int numberInArray, List<String> fileString) throws IOException {
        File fileName = new File(fileNameString[numberInArray]);
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        fileString.clear();

        String readRecordFromFile;
        while ((readRecordFromFile = br.readLine()) != null)
            fileString.add(readRecordFromFile);
    }

    private void read() throws IOException {
        readFromFile(filesDoctorNames, 0, list_internistNames);

        readFromFile(filesDatesInternist, 0, list_internistDates_1st);
        readFromFile(filesDatesInternist, 1, list_internistDates_2nd);
        readFromFile(filesDatesInternist, 2, list_internistDates_3rd);
        readFromFile(filesDatesInternist, 3, list_internistDates_4th);



        readFromFile(filesDoctorNames, 1, list_oncologistNames);

        readFromFile(filesDatesOncologist, 0, list_oncologistDates_1st);
        readFromFile(filesDatesOncologist, 1, list_oncologistDates_2nd);
        readFromFile(filesDatesOncologist, 2, list_oncologistDates_3rd);
        readFromFile(filesDatesOncologist, 3, list_oncologistDates_4th);



        readFromFile(filesDoctorNames, 2, list_cardiologistNames);

        readFromFile(filesDatesCardiologist, 0, list_cardiologistDates_1st);
        readFromFile(filesDatesCardiologist, 1, list_cardiologistDates_2nd);
        readFromFile(filesDatesCardiologist, 2, list_cardiologistDates_3rd);
        readFromFile(filesDatesCardiologist, 3, list_cardiologistDates_4th);
    }

    private void printOnConsole(List<String> listOfNames) {
        for (String listOfName: listOfNames)
            System.out.println(listOfName);

        System.out.print("\n");
    }

    private void printAll() {
        System.out.println(list_internistNames.get(0));
        printOnConsole(list_internistDates_1st);

        /*
        System.out.println(list_internistNames.get(1));
        printOnConsole(list_internistDates_2nd);

        System.out.println(list_internistNames.get(2));
        printOnConsole(list_internistDates_3rd);

        System.out.println(list_internistNames.get(3));
        printOnConsole(list_internistDates_4th);


        System.out.println(list_oncologistNames.get(0));
        printOnConsole(list_oncologistDates_1st);

        System.out.println(list_oncologistNames.get(1));
        printOnConsole(list_oncologistDates_2nd);

        System.out.println(list_oncologistNames.get(2));
        printOnConsole(list_oncologistDates_3rd);

        System.out.println(list_oncologistNames.get(3));
        printOnConsole(list_oncologistDates_4th);


        System.out.println(list_cardiologistNames.get(0));
        printOnConsole(list_cardiologistDates_1st);

        System.out.println(list_cardiologistNames.get(1));
        printOnConsole(list_cardiologistDates_2nd);

        System.out.println(list_cardiologistNames.get(2));
        printOnConsole(list_cardiologistDates_3rd);

        System.out.println(list_cardiologistNames.get(3));
        printOnConsole(list_cardiologistDates_4th);

         */
    }

    private void whenAppendStringUsingBufferedWritter_thenOldContentShouldExistToo() throws IOException {

        String fileName = generalFilePath + doctorDatesInternistPath + "1st.txt";
        String str = "\nWorld";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.append(' ');
        writer.append(str);

        writer.close();
    }
}