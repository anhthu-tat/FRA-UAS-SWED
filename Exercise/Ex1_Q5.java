public class Ex1_Q5 {
    public class Goods {
        public String name;
        public String edition;
        public int year;
        public boolean sold;
        private double price;

        public Goods (String name, String edition, int year, boolean sold, double price) {
            this.name = name;
            this.edition = edition;
            this.year = year;
            this.sold = sold;
            this.price = price;
        }

        //Setters and getters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getEdition() {
            return edition;
        }
        public void setEdition(String edition) {
            this.edition = edition;
        }

        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }

        public boolean getSold() {
            return sold;
        }
        public void setSold(boolean sold) {
            this.sold = sold;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }



        public void printin4 () {
            System.out.println("This "+name+" is the "+edition+" edition, published in "+year+", was sold at $"+price+", and is "+sold);
        }

        public void current_price(int x) {
            double p = price;
            int y = year;
            p *= ((x - y)*0.01)+1;
            setPrice(p);
        }

        public void SoldStatus (){
            if (sold = true) {
                System.out.println("This good is sold out");
            }
            else {
                System.out.println("This good is not sold out");
            }
        }
    }
}
