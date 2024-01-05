package org.education.leetcode.myGenerators.myExceptions;

public class InvalidInputException extends Exception {
    /**
     *
     * @param message - сообщение исключения
     *
     * Исключение сообщающее о неверном/некорректном вводе входных данных
     */
    public InvalidInputException(String message) {
        super(message);
    }
}
