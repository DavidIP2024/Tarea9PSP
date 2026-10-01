import java.util.Random;


public class Descarga extends Thread {

    private String nombreArchivo;
    private int tiempoBloque;
    private long tiempoDescarga;


    public Descarga(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

        Random random = new Random();
        tiempoBloque = random.nextInt(401) + 100;
    }


    @Override
    public void run() {

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {

            try {
                Thread.sleep(tiempoBloque);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("[" + nombreArchivo + "] " + (i * 10) + "%");
        }

        tiempoDescarga = System.currentTimeMillis() - inicio;

        System.out.println("[" + nombreArchivo + "] completada en "
                + tiempoDescarga + " ms");
    }


    public long getTiempoDescarga() {
        return tiempoDescarga;
    }
}