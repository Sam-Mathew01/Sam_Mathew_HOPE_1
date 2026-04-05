package utils;

public class Validator {

    public static void validatePeople(int people) throws Exception {
        if (people <= 0) {
            throw new Exception("Number of people must be greater than 0");
        }
    }

    public static void validateTable(int table) throws Exception {
        if (table <= 0) {
            throw new Exception("Invalid table number");
        }
    }
}