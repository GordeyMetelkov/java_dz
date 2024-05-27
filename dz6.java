import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class dz6 {  
    public static void main(String[] args) {
        dz6 system = new dz6();
        system.xxxxx();
        System.out.println(system.clinicDB.toString());
    }  
    Set<Cat> clinicDB;
    public void xxxxx () {
        clinicDB = new HashSet<>();
        Cat barsik = new Cat("Barsik", 1, "Grey", 30, 5, "Kate");
        Cat persik = new Cat("Persik", 2, "Orange", 25, 4, "Snejana");
        Cat barsik2 = new Cat("Barsik", 1, "Grey", 30, 5, "Kate");
        System.out.println(barsik.equals(barsik2));
        clinicDB.add(barsik);
        clinicDB.add(persik);
        clinicDB.add(barsik2);
        
    }

    class Cat {
        String name;
        int age;
        String color;
        int height;
        int weight;
        String owner;

        public Cat (String name, int age, String color, int height, int weight, String owner) {

            this.name = name;
            this.age = age;
            this.color = color;
            this.height = height;
            this.weight = weight;
            this.owner = owner;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return this.name.equals(cat.name) 
                    && this.age == cat.age 
                    && this.color.equals(cat.color) 
                    && this.height == cat.height 
                    && this.weight == cat.weight 
                    && this.owner.equals(cat.owner);
        }

        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }
        public String getColor() {
            return this.color;
        }
        public int getHeight() {
            return this.height;
        }
        public int getWeight() {
            return this.weight;
        }
        public String getOwner() {
            return this.owner;
        }
        
        @Override
        public String toString() {
            
            return name + " " + owner;
        }
        @Override
        public int hashCode() {
            
            return Objects.hash(name, age, color, height, weight, owner);
        }
    }
}
