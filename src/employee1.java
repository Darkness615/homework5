public class employee1 {

        private String fio;
        private String position;
        private String email;
        private String phone;
        private double value;
        private int age;



        public int getAge() {
                return age;
        }

        public employee1(String fio, String position, String email, String phone, double value, int age) {
                this.fio = fio;
                this.position = position;
                this.email = email;
                this.phone = phone;
                this.value = value;
                this.age = age;
        }


        public void printInfo()
        {
                System.out.println(String.format("FIO: %s, Position: %s, Email: %s,Phone: %s, Value: %s,Age: %s",fio,position,email,phone,value,age));
        }
}
