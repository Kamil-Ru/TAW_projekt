package com.example.taw_projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("IO")
public class Api {

    @Autowired
    private SubjectsDatabase subjectsDatabase;

    // Wprowadzanie nowego przedmiotu
    @PostMapping(value = "subject",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOneSubject(@RequestBody Subjects subjects) {
        subjectsDatabase.addSubject(subjects);
    }

    // Wprowadzanie listy przedmiotów
    @PostMapping(value = "subjects",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
        public void addSubjects(@RequestBody Subjects[] subjects) {
            for (Subjects subject : subjects) {
                subjectsDatabase.addSubject(subject);
            }
        }

    // Pobieranie wszystkich przedmiotów
    @GetMapping(value = "subjects",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getSubjects(){
        List<Subjects> data = subjectsDatabase.getSubjectList();
        if (data.size() == 0){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(data);
    }

    // Usuwanie wszystkich przedmiotów
    @DeleteMapping(value = "subjects",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteSubjects() {
        if (subjectsDatabase.deleteAll()){
            return ResponseEntity.noContent().build();
        }
        else return ResponseEntity.unprocessableEntity().build();
    }

    // Filtrację pod kątemm: egzaminu, sali, ID
    @GetMapping(value = "subject",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getSpecifySubjects(
            @Nullable @RequestParam("id") Integer id,
            @Nullable @RequestParam("room") Integer room,
            @Nullable @RequestParam("exam") Boolean exam
    ) {
        List<Subjects> data = subjectsDatabase.getSpecifySubjects(id, room, exam);
        if (data.size() == 0){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(data);
    }

    @DeleteMapping(value = "subject",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteSubject(
            @Nullable @RequestParam("id") Integer id
    ) {
        if (subjectsDatabase.deleteById(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
