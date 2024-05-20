public class Libro {

        // Atributos
        private String titulo;
        private String autor;
        private int año_Publicacion;
        private double precio;

        // Constructor
        public Libro(String titulo, String autor, int año_Publicacion, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.año_Publicacion = año_Publicacion;
            this.precio = precio;
        }

        // Métodos para establecer y obtener los atributos
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }

        public void setAño_Publicacion(int año_Publicacion) {
            this.año_Publicacion = año_Publicacion;
        }

        public int getAño_Publicacion() {
            return año_Publicacion;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        // Método para mostrar la información del libro
        public void mostrarInformacion() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Año de Publicación: " + año_Publicacion);
            System.out.println("Precio: " + precio);
        }

        // Método main para probar la clase
        public static void main(String[] args) {
            // Crear un nuevo libro
            Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, 50.000);

            // Mostrar la información del libro
            libro1.mostrarInformacion();
        }
    }


