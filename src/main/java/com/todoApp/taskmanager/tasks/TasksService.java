package com.todoApp.taskmanager.tasks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TasksService {
    List<TaskEntity> tasks;

    public TasksService() {
        this.tasks = new ArrayList<>();
    }
    /*
    * Get all tasks
    * */

    public List<TaskEntity> getAllTasks() {
        return tasks;
    }

    /*
    * Create a task
    */
    public void createTask(String title, Date dueDate) {
        int newTaskId = tasks.size();
        TaskEntity task = new TaskEntity(newTaskId,title, dueDate, false, new ArrayList<>());
        tasks.add(task);
    }

    /*
    * Get task by Id
    * */
    public  TaskEntity getTaskById(int id) {
        return tasks.get(id);
    }

    /*
    * Delete a task
    * */
    public  void deleteTaskById(int id) {
        if(!tasks.isEmpty() && tasks.size() > id)
            tasks. remove(id);
    }

    /*
    * Update tasks by id
    * */

    public void updateTaskById(int id, String name, Date dueDate, Boolean completed) {
        if(tasks.size() <= id) {
            throw new TaskNotFoundException(id);
        }

        TaskEntity task = tasks.get(id);

        if(name != null) {
            task.setName(name);
        }
        if(dueDate != null) {
            task.setDueDate(dueDate);
        }
        if(completed != null) {
            task.setCompleted(completed);
        }
    }

    /**/
    static class  TaskNotFoundException extends IllegalArgumentException {
        public  TaskNotFoundException(int taskId) {
            super("Task with id = " + taskId + "not found");
        }
    }
}


