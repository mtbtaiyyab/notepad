package com.example.note;

//Note.java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String text;
 
 public void displayNoteText() {
     System.out.println("Note Text: " + text);
 }

 // Getters and setters
}
