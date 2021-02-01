class Main {
    public static void main(String args[]) {
        //csvReader reader = new csvReader("data.csv");
        csvReader reader = new csvReader("/Users/beyzayildirim/Documents/Find_My_Exam_Schedule/src/data.csv");
        Backend backend = new Backend(reader);
        UI ui = new UI(backend);
    }
}