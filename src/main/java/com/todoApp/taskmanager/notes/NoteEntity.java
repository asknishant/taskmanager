package com.todoApp.taskmanager.notes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NoteEntity {
    String title;
    Integer id;
    String body;
}
