public class Main {
    public static void main(String[] args) {
        
        Kue[] kueArray = new Kue[20];

        // Inisialisasi objek-objek kue dalam array
        kueArray[0] = new KuePesanan("Bolu Kukus", 3000, 0.5);
        kueArray[1] = new KuePesanan("Brownies", 5000, 0.3);
        kueArray[2] = new KuePesanan("Kue Sus", 2000, 0.2);
        kueArray[3] = new KuePesanan("Donat", 1000, 0.1);
        kueArray[4] = new KuePesanan("Lapis Legit", 5000, 1.5);
        kueArray[5] = new KueJadi("Nastar", 5000, 10);
        kueArray[6] = new KueJadi("Kue Lapis", 1000, 5);
        kueArray[7] = new KueJadi("Putu Ayu", 2000, 20);
        kueArray[8] = new KueJadi("Onde-onde", 1500, 15);
        kueArray[9] = new KueJadi("Kue Lumpur", 3000, 8);
        kueArray[10] = new KuePesanan("Kue Pandan", 2500, 0.2);
        kueArray[11] = new KuePesanan("Kue Keju", 3500, 0.3);
        kueArray[12] = new KuePesanan("Kue Kering", 4000, 0.25);
        kueArray[13] = new KuePesanan("Kue Lumpur", 3000, 0.2);
        kueArray[14] = new KuePesanan("Kue Tart", 4000, 0.9);
        kueArray[15] = new KueJadi("Kue Kacang", 6000, 25);
        kueArray[16] = new KueJadi("Kue Bolu", 7000, 30);
        kueArray[17] = new KueJadi("Kue Semprit", 5000, 18);
        kueArray[18] = new KueJadi("Kue Putri Salju", 8000, 35);
        kueArray[19] = new KueJadi("Kue Tape", 4000, 20);

        for(int i = 0; i < kueArray.length; i++) {
            if(kueArray[i] != null) {
                System.out.println(kueArray[i].toString());
            }
            
        }
        System.out.println();

        double totalHargaSemuaKue = 0;
        for(int i = 0; i < kueArray.length; i++) {
            if(kueArray[i] != null) {
                totalHargaSemuaKue += kueArray[i].getHarga();
            }
        }
        System.out.println("Total semua harga kue "+totalHargaSemuaKue);

        double totalHargaKueJadi = 0;
        for(int i = 0; i < kueArray.length; i++) {
            if(kueArray[i] != null && kueArray[i] instanceof KueJadi) {
                totalHargaKueJadi += kueArray[i].getHarga();
            }
        }
        System.out.println("Total semua kue jadi "+totalHargaKueJadi);

        double totalSemuaKuePesanan = 0;
        for(int i = 0; i < kueArray.length; i++) {
            if(kueArray[i] != null && kueArray[i] instanceof KuePesanan) {
                totalSemuaKuePesanan += kueArray[i].getHarga();
            }
        }
        System.out.println("Total semua kue pesanan "+totalSemuaKuePesanan);

        double hargaKueTerbesar = 0;
        for (int i = 0; i < kueArray.length; i++) {
            if (kueArray[i].getHarga() > hargaKueTerbesar) {
                hargaKueTerbesar = kueArray[i].getHarga();
            }
        }

        System.out.println("Dari seluruh kue, harga yang paling tinggi adalah " + hargaKueTerbesar);


        // double totalSemuaKue = 0;
        // for(int i = 0; i < kueArray.length; i++) {
        //     totalSemuaKue += kueArray[i].getHarga();
        // }
        // System.out.println(totalSemuaKue);

        // for(int i = 0; i < kueArray.length; i++) {
        //     System.out.println(kueArray[i].toString());
        // }

        // // total harga semua kue
        // double[] totalHargaSemuaKue = new double[kueArray.length];
        // for(int i = 0; i < kueArray.length; i++) {
            

        //     totalHargaSemuaKue[i] += kueArray[i].getHarga();
            
        // }
        // System.out.println("Total harga semua kue" + totalHargaSemuaKue);

        // // total harga semua Kue Jadi
        // double[] totalHargaKueJadi = new double[kueArray.length];
        // for(int i = 0; i < kueArray.length; i++) {
            

        //     if (kueArray[i] instanceof KueJadi) {
        //         totalHargaKueJadi[i] += kueArray[i].getHarga();
        //     }
            
        // }
        // System.out.println("Total harga kue jadi" + totalHargaKueJadi);
    }
}
