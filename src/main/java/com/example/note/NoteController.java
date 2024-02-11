package com.example.note;

//NoteController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

 @Autowired
 private NoteRepository noteRepository;

 @PostMapping
 public Note saveNote(@RequestBody Note note) {
     return noteRepository.save(note);
 }

 @GetMapping
 public List<Note> getAllNotes() {
     return noteRepository.findAll();
 }

 @GetMapping("/{id}")
 public Note getNoteById(@PathVariable Long id) {
     return noteRepository.findById(id).orElse(null);
 }
}

