package Homework;

public class homework01 {
    public static void main(String[] args) {
        Person tmp;
        Person[] people = new Person[3];
        people[0] = new Person("jack", 20, "农民");
        people[1] = new Person("jack1", 30, "工人");
        people[2] = new Person("jack2", 25, "官员");
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - j; j++) {
                if (people[i].getAge()<people[i+1].getAge()) {
                    tmp = people[i];
                    people[i]=people[i+1];
                    people[i+1]=tmp;
//                System.out.println(people[i]);
            }

        }

    }

            for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }

}
    class Person {
        private String name;
        private int age;
        private String job;

        public Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    '}';
        }
    }

