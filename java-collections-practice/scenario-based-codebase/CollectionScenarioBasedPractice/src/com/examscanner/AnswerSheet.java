package com.examscanner;
import java.util.List;

public interface AnswerSheet<T> {
    String getStudentName();
    List<T> getAnswers();
}
