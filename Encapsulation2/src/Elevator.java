public class Elevator {
    int currentFloor = 1;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor = currentFloor - 1;
        } else {
            System.out.println("Лифт на минимальном этаже");
        }
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor = currentFloor + 1;
        } else {
            System.out.println("Лифт на максимальном этаже");
        }
    }
    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("этаж указан неверно введите этаж от " + minFloor + " до " + maxFloor);
        } else {
            if (currentFloor > floor) {//едем вниз
                System.out.println(getCurrentFloor());
                while (currentFloor != floor) {
                    moveDown();
                    System.out.println(getCurrentFloor());
                }
            } else if (currentFloor < floor) {//едем вверх
                System.out.println(getCurrentFloor());
                while (currentFloor != floor) {
                    moveUp();
                    System.out.println(getCurrentFloor());
                }
            } else {//Вы приехали
                System.out.println("Лифт уже приехал");
            }
        }
    }

}
