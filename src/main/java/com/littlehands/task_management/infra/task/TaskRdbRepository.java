package com.littlehands.task_management.infra.task;

import com.littlehands.task_management.domain.task.Task;
import com.littlehands.task_management.domain.task.TaskId;
import com.littlehands.task_management.domain.task.TaskRepository;
import org.springframework.stereotype.Component;

@Component
public class TaskRdbRepository implements TaskRepository {
  @Override
  public Task findById(TaskId taskId) {
    return null;
  }

  @Override
  public void save(Task task) {

  }
}