package nieZnanyLekarz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class BufferedReaderClass {

    List<String> list_internistNames = new ArrayList<>();
    List<String> list_oncologistNames = new ArrayList<>();
    List<String> list_cardiologistNames = new ArrayList<>();

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

    private String string_generalFilePath = "C:\\Users\\A702387\\OneDrive - Atos\\Desktop\\nieZnanyLekarz\\nieZnanyLekarz\\textFiles\\";
    private String string_doctorNamesPath = "doctorNamesAndPictures\\doctorNames\\";
    private String string_doctorPicturesPath = "doctorNamesAndPictures\\doctorPictures\\";
    private String string_doctorDatesInternistPath = "doctorDates\\internistDates\\InternistDates_";
    private String string_doctorDatesOncologistPath = "doctorDates\\oncologistDates\\OncologistDates_";
    private String string_doctorDatesCardiologistPath = "doctorDates\\cardiologistDates\\CardiologistDates_";

    private String[] filesDoctorNames = {
                                    string_generalFilePath + string_doctorNamesPath + "InternistNames.txt",
                                    string_generalFilePath + string_doctorNamesPath + "OncologistNames.txt",
                                    string_generalFilePath + string_doctorNamesPath + "CardiologistNames.txt",
    };

    private String[] filesDatesInternist = {
                                    string_generalFilePath + string_doctorDatesInternistPath + "1st.txt",
                                    string_generalFilePath + string_doctorDatesInternistPath + "2nd.txt",
                                    string_generalFilePath + string_doctorDatesInternistPath + "3rd.txt",
                                    string_generalFilePath + string_doctorDatesInternistPath + "4th.txt"
    };

    private String[] filesDatesOncologist = {
                                    string_generalFilePath + string_doctorDatesOncologistPath + "1st.txt",
                                    string_generalFilePath + string_doctorDatesOncologistPath + "2nd.txt",
                                    string_generalFilePath + string_doctorDatesOncologistPath + "3rd.txt",
                                    string_generalFilePath + string_doctorDatesOncologistPath + "4th.txt"
    };

    private String[] filesDatesCardiologist = {
                                    string_generalFilePath + string_doctorDatesCardiologistPath + "1st.txt",
                                    string_generalFilePath + string_doctorDatesCardiologistPath + "2nd.txt",
                                    string_generalFilePath + string_doctorDatesCardiologistPath + "3rd.txt",
                                    string_generalFilePath + string_doctorDatesCardiologistPath + "4th.txt"
    };


    void launchReader() throws IOException {
        read();
        printAll();
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

    private void printAll() {

        /*
        System.out.println(list_internistNames.get(0));
        writeToFile(string_generalFilePath, string_doctorDatesInternistPath,"1st.txt", list_internistDates_1st);

        //Remove record from List
        list_internistDates_1st.remove("10.05.2019");
        writeToFile(string_generalFilePath, string_doctorDatesInternistPath,"1st.txt", list_internistDates_1st);

        System.out.println(list_internistNames.get(1));
        writeToFile(string_generalFilePath, string_doctorDatesInternistPath,"2nd.txt", list_internistDates_2nd);

        System.out.println(list_internistNames.get(2));
        writeToFile(string_generalFilePath, string_doctorDatesInternistPath,"3rd.txt", list_internistDates_3rd);

        System.out.println(list_internistNames.get(3));
        writeToFile(string_generalFilePath, string_doctorDatesInternistPath,"4th.txt", list_internistDates_4th);


        System.out.println(list_oncologistNames.get(0));
        writeToFile(string_generalFilePath, string_doctorDatesOncologistPath,"1st.txt", list_oncologistDates_1st);

        System.out.println(list_oncologistNames.get(1));
        writeToFile(string_generalFilePath, string_doctorDatesOncologistPath,"2nd.txt", list_oncologistDates_2nd);

        System.out.println(list_oncologistNames.get(2));
        writeToFile(string_generalFilePath, string_doctorDatesOncologistPath,"3rd.txt", list_oncologistDates_3rd);

        System.out.println(list_oncologistNames.get(3));
        writeToFile(string_generalFilePath, string_doctorDatesOncologistPath,"4th.txt", list_oncologistDates_4th);


        System.out.println(list_cardiologistNames.get(0));
        writeToFile(string_generalFilePath, string_doctorDatesCardiologistPath,"1st.txt", list_cardiologistDates_1st);

        System.out.println(list_cardiologistNames.get(1));
        writeToFile(string_generalFilePath, string_doctorDatesCardiologistPath,"2nd.txt", list_cardiologistDates_2nd);

        System.out.println(list_cardiologistNames.get(2));
        writeToFile(string_generalFilePath, string_doctorDatesCardiologistPath,"3rd.txt", list_cardiologistDates_3rd);

        System.out.println(list_cardiologistNames.get(3));
        writeToFile(string_generalFilePath, string_doctorDatesCardiologistPath,"4th.txt", list_cardiologistDates_4th);

         */
    }

    private void writeToFile(String generalPath, String doctorDatesPath, String fileNumber, List<String> doctorDates) throws IOException {

        String fileName = generalPath + doctorDatesPath + fileNumber;

        BufferedWriter writerClear = new BufferedWriter(new FileWriter(fileName));
        writerClear.append("");
        writerClear.close();


        for (String dateString : doctorDates) {
            BufferedWriter writeDateToFile = new BufferedWriter(new FileWriter(fileName, true));
            writeDateToFile.append(dateString).append("\n");
            writeDateToFile.close();
        }

        for (String printAll : doctorDates) {
            System.out.println(printAll);
        }




    }
}