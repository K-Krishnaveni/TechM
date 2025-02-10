public class User {
        private String name;
        private int age;

        // Constructor
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        // Overriding toString() for meaningful string representation
        @Override
        public String toString() {
            return "User{name='" + name + "', age=" + age + "}";
        }

        // Overriding equals() to compare objects based on their values
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;  // Check if same reference
            if (obj == null || getClass() != obj.getClass()) return false;
            User user = (User) obj;
            return age == user.age && name.equals(user.name);
        }

        // Overriding hashCode() to ensure consistent hashing
        @Override
        public int hashCode() {
            return name.hashCode() + age;
        }

}
