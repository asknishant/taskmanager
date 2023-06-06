package com.todoApp.taskmanager.tasks;

import com.todoApp.taskmanager.notes.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskEntity {
    Integer id;
    String name;
    Date dueDate;
    Boolean completed;
    List<NoteEntity> notes;

}
