package com.liang.base;

import java.util.*;

public class PQ {
    static class Task {
        int priority;
        String name;

        public Task(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        public int getPriority() {
            return priority;
        }

        public String getName() {
            return name;
        }
    }


    public static void main(String[] args) {
//        Queue<Integer> pd = new PriorityQueue<>();
//        pd.offer(10);
//        pd.add(20);
//        pd.addAll(Arrays.asList(new Integer[]{
//                11, 12, 13, 2, 7, 15, 12, 8, 6, 19, 12
//        }));
//        while (pd.peek() != null) {
//            System.out.println(pd.poll() + " ");
//        }

        Queue<Task> tasks = new PriorityQueue<Task>(11, taskComparator);
        tasks.offer(new Task(20, "写日记"));
        tasks.offer(new Task(30, "coding"));
        tasks.offer(new Task(100, "TV"));
        tasks.offer(new Task(10, "健身"));
        tasks.offer(new Task(14, "hello"));
        Task task = tasks.poll();
        while (task != null) {
            System.out.print("处理任务: " + task.getName() + ",优先级:" + task.getPriority() + "\n");
            task = tasks.poll();
        }


    }

    private static Comparator<Task> taskComparator = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            if (o1.getPriority() > o2.getPriority()) {
                return -1;
            } else if (o1.getPriority() < o2.getPriority()) {
                return 1;
            } else {
                return 0;
            }
        }
    };
}
