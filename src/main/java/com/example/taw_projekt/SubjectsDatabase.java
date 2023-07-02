package com.example.taw_projekt;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class SubjectsDatabase {

    private final List<Subjects> subjectsList = new ArrayList<>();

    private int activityIndex = 1;

    public void addSubject(Subjects element){
        element.setId(activityIndex);
        subjectsList.add(element);
        activityIndex = activityIndex +1;
    }

    public List<Subjects> getSubjectList() {
        return subjectsList;
    }

    public List<Subjects> getSpecifySubjects(Integer id, Integer room, Boolean exam) {
        if (id == null && room == null && exam == null){
            return subjectsList;
        }
        List<Subjects> filteredSubject = new ArrayList<>();
        for (Subjects subjects : subjectsList) {

            // 3. Pobranie przedmiotów, które mają egzamin
            if (id == null && room == null && subjects.getExam().equals(exam)) {
                filteredSubject.add(subjects);
            }

            // 4. Pobranie przedmiotów, które odbywają się w konkretej sali
            else if (id == null && exam == null && subjects.getRoom().equals(room)) {
                filteredSubject.add(subjects);
            }

            // 5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208
            else if (id == null && subjects.getExam().equals(exam) && subjects.getRoom().equals(room)) {
                filteredSubject.add(subjects);
            }

            // 6. Pobranie przedmiotu o konkretnym identyfikatorze
            else if (room == null && exam == null && subjects.getId().equals(id)) {
                filteredSubject.add(subjects);
            }
        }

        return filteredSubject;
    }

    // Usunięcie wszystkich przedmiotów
    public boolean deleteAll() { subjectsList.clear();
        return true;
    }

    // Usunięcie przedmiotu po ID
    public boolean deleteById(Integer id) {
        Subjects subjectToDelete = null;
        for (Subjects element : subjectsList){
            if (element.getId().equals(id)){
                subjectToDelete = element;
            }
        }
        if (subjectToDelete == null) {
            return false;
        }
        subjectsList.remove(subjectToDelete);
        return true;
    }
}
