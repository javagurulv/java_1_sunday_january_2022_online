package student_aleksandra_jefimova.lesson_3.level_7.task_29;

class Fish {
    String name;
    String colour;
    private int months;

    public Fish (String fishName, String fishColour, int fishMonths) {
        this.name = fishName;
        this.colour = fishColour;
        this.months = fishMonths;
    }

        public void swim() {
            System.out.println("I am swimming");
        }

        public void showYourColour() {
            System.out.println("I am " + this.colour);
        }

    }
